package br.com.plataformalancamentofinanceiro.test;

import br.com.plataformalancamentofinanceiro.factory.GerenciadorPessoaFactory;
import br.com.plataformalancamentofinanceiro.service.GerenciadorPessoaService;

public class GerenciadorPessoaServiceTest {
	
	public static void main(String[] args) {
		persist();
	}
	
	public static void persist() {
		GerenciadorPessoaService gerenciadorPessoaService = new GerenciadorPessoaService();
			gerenciadorPessoaService.persist(GerenciadorPessoaFactory.getJamileBatistaAlves());
	}
	
}
