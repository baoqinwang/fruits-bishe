//控制层
app.controller('protypeController' ,function($scope,$controller   ,protypeService){

    $controller('baseController',{$scope:$scope});//继承

    //读取列表数据绑定到表单中
    $scope.findAll=function(){
        protypeService.findAll().success(
            function(response){
                $scope.list=response;
            }
        );
    }

    //分页
    $scope.findPage=function(page,rows){
        protypeService.findPage(page,rows).success(
            function(response){
                $scope.list=response.rows;
                $scope.paginationConf.totalItems=response.total;//更新总记录数
            }
        );
    }

    //查询实体
    $scope.findOne=function(id){
        protypeService.findOne(id).success(
            function(response){
                $scope.entity= response;
            }
        );
    }

    //保存
    $scope.save=function(){
        var serviceObject;//服务层对象
        if($scope.entity.id!=null){//如果有ID
            serviceObject=protypeService.update( $scope.entity ); //修改
        }else{
            if($scope.grade==1)
             $scope.entity.fatherid=0;
            else
                $scope.entity.fatherid=$scope.entity_1.id;
            serviceObject=protypeService.add( $scope.entity  );//增加
        }
        serviceObject.success(
            function(response){
                $scope.msg=response.message;
                $('#editModal3').modal();
                if(response.success) {

                    if ($scope.grade == 1)
                        $scope.findByParentId(0);//重新加载
                    else
                        $scope.findByParentId($scope.entity_1.id);//重新加载
                }
            }
        );
    }

    //删除确认
    $scope.checkDel=function () {
        if($scope.selectIds.length<=0) {
            $scope.msg = "请选择删除记录";
            $('#editModal3').modal();
            return ;
        }
        else {
            $('#editModal2').modal();
        }
    }
    //批量删除
    $scope.dele=function(){
        //获取选中的复选框
        protypeService.dele( $scope.selectIds ).success(
            function(response){
                $scope.msg=response.message;
                $('#editModal3').modal();
                if(response.success) {

                    if ($scope.grade == 1)
                        $scope.findByParentId(0);//重新加载
                    else
                        $scope.findByParentId($scope.entity_1.id);//重新加载
                }
            }
        );
    }

    $scope.searchEntity={};//定义搜索对象

    //搜索
    $scope.search=function(page,rows){
        protypeService.search(page,rows,$scope.searchEntity).success(
            function(response){
                $scope.list=response.rows;
                $scope.paginationConf.totalItems=response.total;//更新总记录数
            }
        );
    }

    // 根据父ID查询分类
    $scope.findByParentId =function(parentId){
        $scope.selectIds=[]
        protypeService.findByParentId(parentId).success(function(response){
            $scope.list=response;
        });
    }

    // 定义一个变量记录当前是第几级分类
    $scope.grade = 1;

    $scope.setGrade = function(value){
        $scope.grade = value;
    }

    $scope.selectList = function(p_entity){

        if($scope.grade == 1){
            $scope.entity_1 = null;

        }
        if($scope.grade == 2){
            $scope.entity_1 = p_entity;

        }

        $scope.findByParentId(p_entity.id);
    }











});	
