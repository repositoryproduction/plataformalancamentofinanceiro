package br.com.plataformalancamentofinanceiro.service;

import java.io.Serializable;
import java.util.List;

import javax.inject.Inject;

import br.com.plataformalancamentofinanceiro.domain.GerenciadorPessoaDomain;
import br.com.plataformalancamentofinanceiro.repository.GerenciadorPessoaRepository;

public class GerenciadorPessoaService implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Inject
	private GerenciadorPessoaRepository gerenciadorPessoaRepository;
	
	public GerenciadorPessoaService() { }
	
	public GerenciadorPessoaDomain persist(GerenciadorPessoaDomain gerenciadorPessoaDomain) {
		return gerenciadorPessoaRepository.persist(gerenciadorPessoaDomain);
	}
	
	public List<GerenciadorPessoaDomain> findAll() {
		return gerenciadorPessoaRepository.findAll();
	}

	public GerenciadorPessoaRepository getPessoaRepository() {
		return gerenciadorPessoaRepository;
	}

	public void setPessoaRepository(GerenciadorPessoaRepository gerenciadorPessoaRepository) {
		this.gerenciadorPessoaRepository = gerenciadorPessoaRepository;
	}
	
}
