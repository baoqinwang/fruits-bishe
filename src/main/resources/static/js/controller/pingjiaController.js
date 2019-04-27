 //控制层 
app.controller('pingjiaController' ,function($scope,$controller   ,pingjiaService){	
	
	$controller('baseController',{$scope:$scope});//继承
	
    //读取列表数据绑定到表单中  
	$scope.findAll=function(){
		pingjiaService.findAll().success(
			function(response){
				$scope.list=response;
			}			
		);
	}    
	
	//分页
	$scope.findPage=function(page,rows){			
		pingjiaService.findPage(page,rows).success(
			function(response){
				$scope.list=response.rows;	
				$scope.paginationConf.totalItems=response.total;//更新总记录数
			}			
		);
	}
	
	//查询实体 
	$scope.findOne=function(id){
		pingjiaService.findOne(id).success(
			function(response){
				$scope.entity= response;					
			}
		);				
	}
	
	//保存 
	$scope.save=function(){
        $scope.updateEntity={};
        $scope.updateEntity.id=$scope.entity.id;
        $scope.updateEntity.sellerresponse=$scope.entity.sellerresponse;
        pingjiaService.update( $scope.updateEntity).success(
            function(response){
                $scope.msg=response.message;
                $('#editModal1').modal();
                $scope.reloadList();//刷新列表
                $scope.selectIds=[];
            }
        );
    }


    //删除确认
    $scope.checkDel=function () {
        if($scope.selectIds.length<=0) {
            $scope.msg = "请选择删除记录";
            $('#editModal1').modal();
            return ;
        }
        else {
            $('#editModal2').modal();
        }
    }

    $scope.dele=function(){
        //获取选中的复选框
        pingjiaService.dele( $scope.selectIds ).success(
            function(response){
                if(response.success){
                    $scope.msg=response.message;
                    $('#editModal1').modal();
                    $scope.reloadList();//刷新列表
                    $scope.selectIds=[];
                }
            }
        );
    }
	
	$scope.searchEntity={};//定义搜索对象 
	
	//搜索
	$scope.search=function(page,rows){			
		pingjiaService.search(page,rows,$scope.searchEntity).success(
			function(response){
				$scope.list=response.rows;	
				$scope.paginationConf.totalItems=response.total;//更新总记录数
			}			
		);
	}
    //回复窗口打开前赋值
    $scope.openEdit=function(entity){
        $scope.entity=entity;
    }
});	
