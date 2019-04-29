//服务层
app.service('memberPoiService',function($http){

    //读取列表数据绑定到表单中
    this.findAll=function(){
        return $http.get('../member/findAll.do');
    }
    //分页
    this.findPage=function(page,rows){
        return $http.get('../member/findPage.do?page='+page+'&rows='+rows);
    }
    //查询实体
    this.findOne=function(id){
        return $http.get('../member/findOne.do?id='+id);
    }
    //增加
    this.add=function(entity){
        return  $http.post('../member/add.do',entity );
    }
    //修改
    this.update=function(entity){
        return  $http.post('../member/update.do',entity );
    }
    //删除
    this.dele=function(ids){
        return $http.get('../member/delete.do?ids='+ids);
    }
    //搜索
    this.search=function(page,rows,searchEntity){
        return $http.post('../member/findPoiPage.do?page='+page+"&rows="+rows, searchEntity);
    }
    //下拉列表数据
    this.selectOptionList=function(){
        return $http.get('../member/selectOptionList.do');
    }
    //下拉列表数据
    this.resetPd=function(id){
        return $http.get('../member/resetPd.do?id='+id);
    }
    //下拉列表数据
    this.back=function(){
        return $http.get('../member/back.do');
    }
    //下拉列表数据
    this.backList=function(){
        return $http.get('../member/backList.do');
    }
    //下拉列表数据
    this.downSearch=function(fileName){
        return $http.get('../member/reduction.do?fileName='+fileName);
    }
    //下拉列表数据
    this.downSearch=function(entity){
        return $http.post('../member/excelPoiSearch.do',entity);
    }
});
