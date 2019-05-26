 //控制层 
app.controller('goodsController' ,function($scope,$controller ,$location  ,goodsService,uploadService,protypeService){
	
	$controller('baseController',{$scope:$scope});//继承

    //读取列表数据绑定到表单中  
	$scope.findAll=function(){
		goodsService.findAll().success(
			function(response){
				$scope.list=response;
			}			
		);
	}
    $scope.remove_iamge_entity = function(index){
        $scope.entity.imgurl.splice(index,1);
    }
	//分页
	$scope.findPage=function(page,rows){			
		goodsService.findPage(page,rows).success(
			function(response){
				$scope.list=response.rows;	
				$scope.paginationConf.totalItems=response.total;//更新总记录数
			}			
		);
	}
    //上下架变更
    $scope.shelfcheck=function(id,value){
        // $scope.entity={};
        $scope.entity.id=id;
        if(value=='01'||value=='02')
        {
            $scope.entity.isshelf="00";
        }
        else
            $scope.entity.isshelf="01";
        $scope.entity.imgurl=null;
        goodsService.updateShelf(  $scope.entity).success(
            function(response){
                if(response.success){
                    $scope.msg=response.message;
                    $('#editModal3').modal();
                    $scope.reloadList();//重新加载
                }
            }
        );
    }
    // //查询实体
    // $scope.updateShelf=function(){
    //     goodsService.updateShelf(  $scope.entity).success(
    //         function(response){
    //             if(response.success){
    //                 $scope.msg="修改成功";
    //                 $scope.reloadList();//刷新列表
    //
    //             }
    //         }
    //     );
    // }
        //查询实体
	$scope.findOne=function(){	
		var id=$location.search()['id'];
		if(id==null){
			return ;
		}		
		goodsService.findOne(id).success(
			function(response){
				$scope.entity= response;
				
				editor.html($scope.entity.content );//商品介绍
                sellMsgEditor.html($scope.entity.sellmsg); //商家留言
				//商品图片
                if($scope.entity.imgurl!=null&&""!=$scope.entity.imgurl)
				$scope.entity.imgurl=JSON.parse($scope.entity.imgurl);
                else
                    $scope.entity.imgurl=[];
				// //扩展属性
				// $scope.entity.goodsDesc.customAttributeItems=JSON.parse($scope.entity.goodsDesc.customAttributeItems);
				// //规格选择
				// $scope.entity.goodsDesc.specificationItems= JSON.parse($scope.entity.goodsDesc.specificationItems);
				// //转换sku列表中的规格对象
				//
				// for(var i=0;i< $scope.entity.itemList.length;i++ ){
				// 	$scope.entity.itemList[i].spec=  JSON.parse($scope.entity.itemList[i].spec);
				// }
				
			}
		);		
	}
	
	//保存 
	$scope.save=function(){
        $scope.entity.shelfbegin=$("#test1").val();
        $scope.entity.shelfend=$("#test2").val();
		$scope.entity.content=editor.html();
        $scope.entity.sellmsg=sellMsgEditor.html();
        if($scope.entity.imgurl!=null)
        $scope.entity.imgurl=JSON.stringify($scope.entity.imgurl);
		var serviceObject;//服务层对象  				
		if($scope.entity.id!=null){//如果有ID
			serviceObject=goodsService.update( $scope.entity ); //修改  
		}else{
			serviceObject=goodsService.add( $scope.entity  );//增加 
		}				
		serviceObject.success(
			function(response){
				if(response.success){
					alert("保存成功");
					location.href='goods.html';
					
				}else{
					alert(response.message);
				}
			}		
		);				
	}
	
	
	 
	//批量删除 
	$scope.dele=function(){			
		//获取选中的复选框			
		goodsService.dele( $scope.selectIds ).success(
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
		goodsService.search(page,rows,$scope.searchEntity).success(
			function(response){
				$scope.list=response.rows;	
				$scope.paginationConf.totalItems=response.total;//更新总记录数
			}			
		);
	}
    // $scope.shelfcheck=function(id,shelfvalue){
    //     entity1.id=id;
    //     entity1.isshelf=shelfvalue;
    // }
	//上传图片
	$scope.uploadFile=function(){
		uploadService.uploadFile().success(
			function(response){
				if(response.success){
					$scope.image_entity.url= response.message;
				}else{
					alert(response.message);					
				}
			}		
		);
		
		
	}
	
	$scope.entity={ imgurl:[]  };
	
	//将当前上传的图片实体存入图片列表
	$scope.add_image_entity=function(){
		$scope.entity.imgurl.push($scope.image_entity);
	}
	
	//移除图片
	$scope.remove_image_entity=function(index){
		$scope.entity.imgurl.splice(index,1);
	}
    
	//查询一级商品分类列表
	$scope.selectProTypeList=function(){

        protypeService.findByParentId(0).success(
			function(response){
				$scope.proType1List=response;
			}
		);
		
	}
	
	//查询二级商品分类列表
	$scope.$watch('entity.fid',function(newValue,oldValue){

        protypeService.findByParentId(newValue).success(
				function(response){
					$scope.proType2List=response;
				}
		);
		
	});


	

	


	

	
	$scope.proType1List=[];//商品分类列表
	//查询商品分类列表
	$scope.findprotypeList=function(){
        protypeService.findAll().success(
			function(response){
				for(var i=0;i<response.length;i++){
					$scope.proType1List[response[i].id]=response[i].typename;
				}
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
