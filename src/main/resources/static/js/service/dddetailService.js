//服务层
app.service('dddetailService',function($http){
	    	
	//读取列表数据绑定到表单中
	this.findAll=function(){
		return $http.get('../dddetail/findAll.do');		
	}
	//分页 
	this.findPage=function(page,rows){
		return $http.get('../dddetail/findPage.do?page='+page+'&rows='+rows);
	}
	//查询实体
	this.findOne=function(id){
		return $http.get('../dddetail/findOne.do?id='+id);
	}
	//增加 
	this.add=function(entity){
		return  $http.post('../dddetail/add.do',entity );
	}
	//修改 
	this.update=function(entity){
		return  $http.post('../dddetail/update.do',entity );
	}
	//删除
	this.dele=function(ids){
		return $http.get('../dddetail/delete.do?ids='+ids);
	}
	//搜索
	this.search=function(page,rows,searchEntity){
		return $http.post('../dddetail/search.do?page='+page+"&rows="+rows, searchEntity);
	}
    //查询明细
    this.searchDet=function(ddno){
        return $http.post('../dddetail/searchDet.do?ddno='+ddno);
    }
});
