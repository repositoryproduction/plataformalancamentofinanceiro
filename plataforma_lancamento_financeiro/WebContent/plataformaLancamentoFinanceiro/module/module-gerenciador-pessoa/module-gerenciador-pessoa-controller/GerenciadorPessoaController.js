var gerenciadorPessoaModule = angular.module('GerenciadorPessoaModule', []);

gerenciadorPessoaModule.controller('gerenciadorPessoaController', function($scope, $http) {

    $scope.gerenciadorPesoaModel = {};

    $scope.gerenciadorPessoaModelResultList = [];
    
    $scope.gerenciadorPessoaTipoPessoaModelList = [];
    
    /**
     * Funcionalidade: Responsavel por recuperar os dados do cadastro de pessoas
	 * URL do Servico de Gerenciador de Pessoa
     */
    URL_PESSOA_SERVICE = 'http://localhost:8080/plataforma_lancamento_financeiro/rest/pessoaRest';
    
    /**
     * Funcionalidade: Responsavel por recuperar os dados do 'Gerenciador de Pessoa'
     */
    $http.get(URL_PESSOA_SERVICE).then(function(response) {
        $scope.gerenciadorPessoaModelResultList = response.data;
    });

    /*
     * Responsável por recuperar as opcoes do Tipo de Pessoa
     * */
//    $http.get(URL_PESSOA_SERVICE).then(function(response) {
//    	$scope.gerenciadorPessoaTipoPessoaModelList = response.data;
//    });

    /**
     * Funcionalidade:	Responsavel por limpar formulario
     */
    $scope.clear = function() {
    	$scope.gerenciadorPesoaModel = [];
    };
    
    /**
     * Funcionalidade:	Responsavel por Salvar os dados de Gerenciador de Pessoa
     * */
    $scope.persist = function(gerenciadorPesoaModel) {
    	$scope.remove(gerenciadorPesoaModel);
   		if(gerenciadorPesoaModel.codigo == undefined) {
   			$scope.gerenciadorPessoaModelResultList.push(gerarCodigoPessoaModel(gerenciadorPesoaModel));
   		} else {
   			$scope.gerenciadorPessoaModelResultList.push(gerenciadorPesoaModel);
   		}
  		console.log("SUCESSO: Dados cadastrados com Sucesso!");
       	$scope.clear();
    };
    
    /**
     * Funcionalidade: 	Responsavel por Editar os dados de Gerenciador de Pessoa
     * Acao:           	Carrega o objeto da 'view' para o 'controller'
     * */
    $scope.merge = function(gerenciadorPesoaModelSelecionado) {
    	$scope.gerenciadorPesoaModel = angular.copy(gerenciadorPesoaModelSelecionado);
    };
    
    /**
     * Funcionalidade:	Responsavel por Pesquisar em uma determinada lista se existe o objeto passado por parametro
     * */
    function isExiste(gerenciadorPesoaModel) {
    	for( var indiceX = 0 ; indiceX < $scope.gerenciadorPessoaModelResultList.length ; indiceX++ ) {
    		if($scope.gerenciadorPessoaModelResultList[indiceX].codigo == gerenciadorPesoaModel.codigo && 
    		   $scope.gerenciadorPessoaModelResultList[indiceX].nome == gerenciadorPesoaModel.nome &&
    		   $scope.gerenciadorPessoaModelResultList[indiceX].tipoPessoaEnumeration == gerenciadorPesoaModel.tipoPessoaEnumeration) {
    			return true;
    		}
    	}
    	return false;
    };
    
    /**
     * Funcionalidade:	Responsavel por remover os dados de Gerenciador de Pessoa
     * */
    $scope.remove = function(gerenciadorPesoaModel) {    	
    	recuperarRegistroCadastrado(gerenciadorPesoaModel);    	
    	for( var indiceX = 0 ; indiceX < $scope.gerenciadorPessoaModelResultList.length ; indiceX++ ) {
    		if($scope.gerenciadorPessoaModelResultList[indiceX].codigo == gerenciadorPesoaModel.codigo) {
    			$scope.gerenciadorPessoaModelResultList.splice(indiceX, 1);
    		}
    	}
    };
    
    /**
     * Funcionalidade:	Responsavel por recuperar um determinada pessoa cadastrada
     * */
    function recuperarRegistroCadastrado(gerenciadorPesoaModel) {
    	gerenciadorPessoaModelResult = {};
    	for( let indiceX ; indiceX < $scope.gerenciadorPessoaModelResultList.length ; indiceX++ ) {
    		if($scope.gerenciadorPessoaModelResultList[indiceX].codigo == gerenciadorPesoaModel.codigo) {
    			gerenciadorPesoaModelResult = gerenciadorPesoaModel[indiceX];
    			return gerenciadorPesoaModelResult;
    		}
    	}
    	return gerenciadorPessoaModelResult;
    };
    
    /**
     * Funcionalidade:	Responsavel por gerar o codigo de uma determinada pessoa ao ser cadastrada
     * */
    function gerarCodigoPessoaModel(gerenciadorPesoaModelParametro) {
    	var codigo = 0;
    	for( var indiceX = 0 ; indiceX < $scope.gerenciadorPessoaModelResultList.length ; indiceX++ ) {
    		if($scope.gerenciadorPessoaModelResultList[indiceX].codigo > codigo) {
    			codigo = Math.max(null, $scope.gerenciadorPessoaModelResultList[indiceX].codigo);
    		}
    	}
    	gerenciadorPesoaModelFactory(gerenciadorPesoaModelParametro, codigo);
    	return gerenciadorPesoaModelParametroResult;
    };
    
    /**
     * Funcionalidade:	Responsavel por gerar objeto com o codigo automatico
     * */
    function gerenciadorPesoaModelFactory(gerenciadorPesoaModelParametro, codigoParametro) {
    	gerenciadorPesoaModelParametroResult = {
    		codigo: codigoParametro + 1,
	    	nome: gerenciadorPesoaModelParametro.nome,
	    	tipoPessoaEnumeration: gerenciadorPesoaModelParametro.tipoPessoaEnumeration,
	    	isFontePagamento: true,
	    	isAtivo: true
	   }
    	return gerenciadorPesoaModelParametroResult;
    };
    
    // FIXME [DESENVOLVIMENTO] {N} -- ""
    /**
     * Funcionalidade:	Ordenar dados do datatable
     * */
    $scope.ordenar = function(keyname){
        $scope.sortKey = keyname;
        $scope.reverse = !$scope.reverse;
    };

});