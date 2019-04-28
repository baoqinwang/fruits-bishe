 //控制层 
app.controller('memberController' ,function($scope,$controller   ,memberService){
	
	$controller('baseController',{$scope:$scope});//继承
	
    //读取列表数据绑定到表单中  
	$scope.findAll=function(){
		memberService.findAll().success(
			function(response){
				$scope.list=response;
			}			
		);
	}    
	
	//分页
	$scope.findPage=function(page,rows){			
		memberService.findPage(page,rows).success(
			function(response){
				$scope.list=response.rows;	
				$scope.paginationConf.totalItems=response.total;//更新总记录数
			}			
		);
	}
	
	//查询实体 
	$scope.findOne=function(id){				
		memberService.findOne(id).success(
			function(response){
				$scope.entity= response;					
			}
		);				
	}
	
	//保存 
	$scope.save=function(){				
		var serviceObject;//服务层对象
		if($scope.entity.id!=null){//如果有ID
			serviceObject=memberService.update( $scope.entity ); //修改  
		}else{
			serviceObject=memberService.add( $scope.entity  );//增加 
		}				
		serviceObject.success(
			function(response){
				if(response.success){
					//重新查询
                    // alert(response.message);
                    $scope.msg=response.message;
                    $('#editModal3').modal();
		        	$scope.reloadList();//重新加载
				}else{
                    $scope.msg=response.message;
                    $('#editModal3').modal();

				}
			}		
		);				
	}
	
	 
	//批量删除 
	$scope.dele=function(){
		//获取选中的复选框			
		memberService.dele( $scope.selectIds ).success(
			function(response){
				if(response.success){
                    $scope.msg=response.message;
                    $('#editModal3').modal();
					$scope.reloadList();//刷新列表
					$scope.selectIds=[];
				}						
			}		
		);				
	}
	
	$scope.searchEntity={};//定义搜索对象 
	
	//搜索
	$scope.search=function(page,rows){			
		memberService.search(page,rows,$scope.searchEntity).success(
			function(response){
				$scope.list=response.rows;	
				$scope.paginationConf.totalItems=response.total;//更新总记录数
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
    //重置密码确认
    $scope.reset=function(id){
        $scope.resetId=id;
        $('#editModal4').modal();
    }
   //重置密码
    $scope.resetPd=function(){
        //获取选中的复选框
        memberService.resetPd( $scope.resetId ).success(
            function(response){
                if(response.success){
                    $scope.msg=response.message;
                    $('#editModal3').modal();
                    $scope.reloadList();//刷新列表
                    $scope.resetId=null;
                }
            }
        );
    }

    //用户信息备份
    $scope.back=function(){
        memberService.back().success(
            function(response){
                if(response.success) {
                    $scope.msg = response.message;
                    $('#editModal3').modal();
                }
            }
        );
    }

   //查询所有备份的文件
    $scope.backList=function(){
        memberService.backList().success(
            function(response){
                $scope.backList=response;
            }
        );
    }
    //设置还原的文件名
    $scope.setFileName=function(filename){
        $scope.fileName=filename;
    }
    //查询还原
    $scope.reduction=function(){
        memberService.reduction($scope.fileName).success(
            function(response){
                $scope.msg = response.message;
                $('#editModal3').modal();
            }
        );
    }
});	
