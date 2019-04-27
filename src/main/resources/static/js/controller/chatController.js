 //控制层 
app.controller('chatController' ,function($scope,$controller   ,chatService){	
	
	$controller('baseController',{$scope:$scope});//继承
	
    //读取列表数据绑定到表单中  
	$scope.findAll=function(){
		chatService.findAll().success(
			function(response){
				$scope.list=response;
			}			
		);
	}    
	
	//分页
	$scope.findPage=function(page,rows){			
		chatService.findPage(page,rows).success(
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
            $('#editModal1').modal();
            return ;
        }
        else {
            $('#editModal2').modal();
        }
    }
	
	//查询实体 
	$scope.findOne=function(id){				
		chatService.findOne(id).success(
			function(response){
				$scope.entity= response;					
			}
		);				
	}
	
	//保存 
	$scope.save=function(){
        chatService.update( $scope.entity ).success(
			function(response){
                $scope.msg=response.message;
                $('#editModal1').modal();
                $scope.reloadList();//刷新列表
                $scope.selectIds=[];
			}		
		);				
	}
	
	 
	//批量删除 
	$scope.dele=function(){			
		//获取选中的复选框			
		chatService.dele( $scope.selectIds ).success(
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
		chatService.search(page,rows,$scope.searchEntity).success(
			function(response){
				$scope.list=response.rows;	
				$scope.paginationConf.totalItems=response.total;//更新总记录数
			}			
		);
	}
    //回复窗口打开前赋值
    $scope.openEdit=function(id,memberid,content,hfsavetime){
        $scope.entity={};
        $scope.entity.id=id;
        $scope.entity.content=content;
        $scope.entity.memberid1=memberid;
        $scope.entity.hfsavetime=hfsavetime;
    }
});	
