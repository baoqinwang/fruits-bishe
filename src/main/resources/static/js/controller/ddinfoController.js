 //控制层 
app.controller('ddinfoController' ,function($scope,$controller,dddetailService   ,ddinfoService){
	
	$controller('baseController',{$scope:$scope});//继承
	
    //读取列表数据绑定到表单中  
	$scope.findAll=function(){
		ddinfoService.findAll().success(
			function(response){
				$scope.list=response;
			}			
		);
	}    
	
	//分页
	$scope.findPage=function(page,rows){			
		ddinfoService.findPage(page,rows).success(
			function(response){
				$scope.list=response.rows;	
				$scope.paginationConf.totalItems=response.total;//更新总记录数
			}			
		);
	}
	
	//查询实体 
	$scope.findOne=function(id,memberid,lxfs){
		ddinfoService.findOne(id).success(
			function(response){
				$scope.entity= response;
                $scope.entity.memberid=memberid;
                $scope.entity.lxfs=lxfs;
			}
		);				
	}
    //查询订单下的商品
    $scope.searchDet=function(ddno){
        dddetailService.searchDet(ddno).success(
            function(response){
                $scope.detList=response;
            }
        );
    }
	//保存修改的地址
    $scope.updateaddr=function(){
        ddinfoService.update($scope.entity).success(
            function(response){
                if(response.success){
                    $scope.msg=response.message;
                    $('#editModal1').modal();
                    $scope.reloadList();//刷新列表
                    $scope.selectIds=[];
                }
            }
		)
	}

    //保存物流信息
    $scope.updatwl=function(){
        $scope.entity.ddstate='03';
        ddinfoService.update($scope.entity).success(
            function(response){
                if(response.success){
                    $scope.msg=response.message;
                    $('#editModal1').modal();
                    $scope.reloadList();//刷新列表
                    $scope.selectIds=[];
                }
            }
        )
    }
        //保存
	$scope.save=function(){				
		var serviceObject;//服务层对象  				
		if($scope.entity.id!=null){//如果有ID
			serviceObject=ddinfoService.update( $scope.entity ); //修改  
		}else{
			serviceObject=ddinfoService.add( $scope.entity  );//增加 
		}				
		serviceObject.success(
			function(response){
				if(response.success){
					//重新查询 
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
		ddinfoService.dele( $scope.selectIds ).success(
			function(response){
				if(response.success){
					$scope.reloadList();//刷新列表
					$scope.selectIds=[];
				}						
			}		
		);				
	}
	
	$scope.searchEntity={};//定义搜索对象
   //修改收获地址窗口打开
    $scope.openEdit=function(id,ddno,memberid,lxfs,newadd){
        $scope.entity={};
        $scope.entity.id=id;
        $scope.entity.ddno=ddno;
        $scope.entity.memberid1=memberid;
        if(newadd==null||newadd=='')
          $scope.entity.newadd=lxfs;
        else
            $scope.entity.newadd=newadd;
    }


    //搜索
    $scope.searchwl=function(wltype,wlinfo){
        ddinfoService.searchwl(wltype,wlinfo).success(
            function(response){
                $scope.state=response.success;
                if(response.success){
                    $scope.wlList=angular.fromJson(response.message);

                }
                $('#editModal3').modal();
            }
        );
    }
        //搜索
	$scope.search=function(page,rows){
		ddinfoService.search(page,rows,$scope.searchEntity).success(
			function(response){
				$scope.list=response.rows;	
				$scope.paginationConf.totalItems=response.total;//更新总记录数
			}			
		);
	}
   //保存订单状态
    $scope.updateDdState=function(id,msg,ddstate){
        $scope.entity={};
        $scope.entity.id=id;
        $scope.entity.ddstate=ddstate;
        $scope.msg=msg;
        $('#editModal5').modal();
    }
    //更新订单状态
    $scope.updateState=function(){
        ddinfoService.updateState($scope.entity).success(
            function(response){
                if(response.success){
                    $scope.msg=$scope.msg+"成功";
                }
                else
                    $scope.msg=$scope.msg+"失败";
                $('#editModal6').modal();
                $scope.reloadList();//刷新列表
                $scope.selectIds=[];
            }
        )
    }
});
