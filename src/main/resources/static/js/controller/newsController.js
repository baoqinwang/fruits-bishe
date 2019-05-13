 //控制层 
app.controller('newsController' ,function($scope,$controller,$location   ,newsService){
	
	$controller('baseController',{$scope:$scope});//继承
	
    //读取列表数据绑定到表单中  
	$scope.findAll=function(){
		newsService.findAll().success(
			function(response){
				$scope.list=response;
			}			
		);
	}    
	
	//分页
	$scope.findPage=function(page,rows){			
		newsService.findPage(page,rows).success(
			function(response){
				$scope.list=response.rows;	
				$scope.paginationConf.totalItems=response.total;//更新总记录数
			}			
		);
	}
	
	//查询实体 
	$scope.findOne=function(id){
        var id=$location.search()['id'];
        if(id==null){
            return ;
        }
        newsService.findOne(id).success(
            function(response){
                $scope.entity= response;

                editor.html($scope.entity.content );//商品介绍


            }
        );
    }
	
	//保存 
	$scope.save=function(){
        $scope.entity.content=editor.html();
		var serviceObject;//服务层对象  				
		if($scope.entity.id!=null){//如果有ID
			serviceObject=newsService.update( $scope.entity ); //修改  
		}else{
			serviceObject=newsService.add( $scope.entity  );//增加 
		}				
		serviceObject.success(
            function(response){
                if(response.success){
                    alert("保存成功");
                    location.href='news.html';

                }else{
                    alert(response.message);
                }
            }
        );
	}
	
	 
	//批量删除 
	$scope.dele=function(){			
		//获取选中的复选框			
		newsService.dele( $scope.selectIds ).success(
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
		newsService.search(page,rows,$scope.searchEntity).success(
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
});	
