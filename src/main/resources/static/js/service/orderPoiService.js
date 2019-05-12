//服务层
app.service('orderPoiService',function($http){


    //搜索
    this.search=function(page,rows,searchEntity){
        return $http.post('../ddinfo/findPoiPage.do?page='+page+"&rows="+rows, searchEntity);
    }
});
