package br.com.plataformalancamentofinanceiro.service;

import java.io.Serializable;
import java.util.List;

import javax.inject.Inject;

import br.com.plataformalancamentofinanceiro.domain.PessoaDomain;
import br.com.plataformalancamentofinanceiro.repository.PessoaRepository;

public class PessoaService implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Inject
	private PessoaRepository pessoaRepository;
	
	public PessoaService() { }
	
	public PessoaDomain persist(PessoaDomain pessoaDomain) {
		return pessoaRepository.persist(pessoaDomain);
	}
	
	public List<PessoaDomain> findAll() {
		return pessoaRepository.findAll();
	}

	public PessoaRepository getPessoaRepository() {
		return pessoaRepository;
	}

	public void setPessoaRepository(PessoaRepository pessoaRepository) {
		this.pessoaRepository = pessoaRepository;
	}
	
}
