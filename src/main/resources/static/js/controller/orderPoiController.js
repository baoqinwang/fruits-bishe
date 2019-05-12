//控制层
app.controller('orderPoiController' ,function($scope,$controller   ,orderPoiService){

    $controller('baseController',{$scope:$scope});//继承

    $scope.searchEntity={};//定义搜索对象

    //搜索
    $scope.search=function(page,rows){
        $scope.searchEntity.beginTime=document.getElementById('beginTime').value;
        $scope.searchEntity.endTime=document.getElementById('endTime').value;
        orderPoiService.search(page,rows,$scope.searchEntity).success(
            function(response){
                $scope.list=response.rows;
                $scope.paginationConf.totalItems=response.total;//更新总记录数
            }
        );
    }
    $scope.reloadSearch=function(){
        $scope.searchEntity.beginTime=null;
        $scope.searchEntity.endTime=null;
        orderPoiService.search($scope.paginationConf.currentPage, $scope.paginationConf.itemsPerPage,$scope.searchEntity).success(
            function(response){
                $scope.list=response.rows;
                $scope.paginationConf.totalItems=response.total;//更新总记录数
            }
        );
    }
});
