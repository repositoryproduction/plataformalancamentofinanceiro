var gerenciadorPessoaModule = angular.module('GerenciadorPessoaModule', []);

gerenciadorPessoaModule.controller('gerenciadorPessoaController', function($scope, $http) {

    $scope.gerenciadorPesoaModel = {};

    $scope.gerenciadorPessoaModelResultList = [];

    URL_PESSOA_SERVICE = 'http://localhost:8080/plataforma_lancamento_financeiro/rest/pessoaRest';

    $http.get(URL_PESSOA_SERVICE).then(function(response) {
        $scope.gerenciadorPessoaModelResultList = response.data;
    });

});