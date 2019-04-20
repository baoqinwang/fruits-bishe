//服务层
app.service('protypeService',function($http){

    //读取列表数据绑定到表单中
    this.findAll=function(){
        return $http.get('../protype/findAll.do');
    }
    //分页
    this.findPage=function(page,rows){
        return $http.get('../protype/findPage.do?page='+page+'&rows='+rows);
    }
    //查询实体
    this.findOne=function(id){
        return $http.get('../protype/findOne.do?id='+id);
    }
    //增加
    this.add=function(entity){
        return  $http.post('../protype/add.do',entity );
    }
    //修改
    this.update=function(entity){
        return  $http.post('../protype/update.do',entity );
    }
    //删除
    this.dele=function(ids){
        return $http.get('../protype/delete.do?ids='+ids);
    }
    //搜索
    this.search=function(page,rows,searchEntity){
        return $http.post('../protype/search.do?page='+page+"&rows="+rows, searchEntity);
    }

    this.findByParentId = function(parentId){
        return $http.get("../protype/findByParentId.do?parentId="+parentId);
    }
});
