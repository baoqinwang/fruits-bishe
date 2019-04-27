//服务层
app.service('chatService',function($http){
	    	
	//读取列表数据绑定到表单中
	this.findAll=function(){
		return $http.get('../chat/findAll.do');		
	}
	//分页 
	this.findPage=function(page,rows){
		return $http.get('../chat/findPage.do?page='+page+'&rows='+rows);
	}
	//查询实体
	this.findOne=function(id){
		return $http.get('../chat/findOne.do?id='+id);
	}
	//增加 
	this.add=function(entity){
		return  $http.post('../chat/add.do',entity );
	}
	//修改 
	this.update=function(entity){
		return  $http.post('../chat/update.do',entity );
	}
	//删除
	this.dele=function(ids){
		return $http.get('../chat/delete.do?ids='+ids);
	}
	//搜索
	this.search=function(page,rows,searchEntity){
		return $http.post('../chat/search.do?page='+page+"&rows="+rows, searchEntity);
	}    	
});
