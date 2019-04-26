//服务层
app.service('ddinfoService',function($http){
	    	
	//读取列表数据绑定到表单中
	this.findAll=function(){
		return $http.get('../ddinfo/findAll.do');		
	}
	//分页 
	this.findPage=function(page,rows){
		return $http.get('../ddinfo/findPage.do?page='+page+'&rows='+rows);
	}
	//查询实体
	this.findOne=function(id){
		return $http.get('../ddinfo/findOne.do?id='+id);
	}
	//增加 
	this.add=function(entity){
		return  $http.post('../ddinfo/add.do',entity );
	}
	//修改 
	this.update=function(entity){
		return  $http.post('../ddinfo/update.do',entity );
	}
	//删除
	this.dele=function(ids){
		return $http.get('../ddinfo/delete.do?ids='+ids);
	}
	//搜索
	this.search=function(page,rows,searchEntity){
		return $http.post('../ddinfo/search.do?page='+page+"&rows="+rows, searchEntity);
	}
    //搜索物流信息
    this.searchwl=function(wltype,wlinfo){
        return $http.post('../ddinfo/searchwl.do?wltype='+wltype+"&wlinfo="+wlinfo);
    }
    //更新订单状态
    this.updateState=function(entity){
        return $http.post('../ddinfo/updateState.do',entity);
    }
});
