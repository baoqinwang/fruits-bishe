//控制层
app.controller('stockinfoPoiController' ,function($scope,$controller   ,stockinfoPoiService,protypeService,kcrecordService){

    $controller('baseController',{$scope:$scope});//继承

    //读取列表数据绑定到表单中
    $scope.findAll=function(){
        stockinfoPoiService.findAll().success(
            function(response){
                $scope.list=response;
            }
        );
    }

    //分页
    $scope.findPage=function(page,rows){
        stockinfoPoiService.findPage(page,rows).success(
            function(response){
                $scope.list=response.rows;
                $scope.paginationConf.totalItems=response.total;//更新总记录数
            }
        );
    }

    //查询实体
    $scope.findOne=function(id,goodName,fname,sname){
        stockinfoPoiService.findOne(id).success(
            function(response){
                $scope.entity= response;
                $scope.entity.goodName=goodName;
                $scope.entity.fname=fname;
                $scope.entity.sname=sname;
            }
        );
    }

    //保存
    $scope.save=function(){
        var serviceObject;//服务层对象
        if($scope.entity.goodsId!=null){//如果有ID
            serviceObject=stockinfoPoiService.update( $scope.entity ); //修改
        }else{
            serviceObject=stockinfoPoiService.add( $scope.entity  );//增加
        }
        serviceObject.success(
            function(response){
                if(response.success){
                    $scope.msg=response.message;
                    $('#editModal1').modal();
                    $scope.reloadList();//重新加载
                }else{
                    alert(response.message);
                }
            }
        );
    }

    //保存出入库存
    $scope.savekcrecod=function(){
        $scope.entity.gid=$scope.entity.goodsId;
        kcrecordService.savekcrecod( $scope.entity ).success(
            function(response){
                if(response.success){
                    $scope.msg=response.message;
                    $('#editModal1').modal();
                    $scope.reloadList();//重新加载
                }else{
                    alert(response.message);
                }
            }
        );
    }


    //批量删除
    $scope.dele=function(){
        //获取选中的复选框
        stockinfoPoiService.dele( $scope.selectIds ).success(
            function(response){
                if(response.success){
                    $scope.reloadList();//刷新列表
                    $scope.selectIds=[];
                }
            }
        );
    }

    $scope.searchEntity={};//定义搜索对象
    //搜索
    $scope.search=function(page,rows){
        stockinfoPoiService.search(page,rows,$scope.searchEntity).success(
            function(response){
                $scope.list=response.rows;
                $scope.paginationConf.totalItems=response.total;//更新总记录数
            }
        );
    }
    //查询一级商品分类列表
    $scope.selectProTypeList3=function(){

        protypeService.findByParentId(0).success(
            function(response){
                $scope.proTypeList3=response;
            }
        );

    }
    //查询二级商品分类列表
    $scope.$watch('searchEntity.fid',function(newValue,oldValue){

        protypeService.findByParentId(newValue).success(
            function(response){
                $scope.proTypeList4=response;
            }
        );

    });


});
