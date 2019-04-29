//控制层
app.controller('memberPoiController' ,function($scope,$controller   ,memberPoiService){

    $controller('baseController',{$scope:$scope});//继承

    $scope.searchEntity={};//定义搜索对象

    //搜索
    $scope.search=function(page,rows){
        $scope.searchEntity.sheng=document.getElementById('province2').value;
        $scope.searchEntity.shi=document.getElementById('city2').value;
        $scope.searchEntity.isgjhy=document.getElementById('isgjhy').value;
        memberPoiService.search(page,rows,$scope.searchEntity).success(
            function(response){
                $scope.list=response.rows;
                $scope.paginationConf.totalItems=response.total;//更新总记录数
            }
        );
    }
    $scope.reloadSearch=function(){
        memberPoiService.search($scope.paginationConf.currentPage, $scope.paginationConf.itemsPerPage,$scope.searchEntity).success(
            function(response){
                $scope.list=response.rows;
                $scope.paginationConf.totalItems=response.total;//更新总记录数
            }
        );
    }
});
