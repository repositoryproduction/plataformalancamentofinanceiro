package br.com.plataformalancamentofinanceiro.test;

import br.com.plataformalancamentofinanceiro.factory.PessoaFactory;
import br.com.plataformalancamentofinanceiro.service.PessoaService;

public class PessoaServiceTest {
	
	public static void main(String[] args) {
		persist();
	}
	
	public static void persist() {
		PessoaService pessoaService = new PessoaService();
			pessoaService.persist(PessoaFactory.getJamileBatistaAlves());
	}
	
}
