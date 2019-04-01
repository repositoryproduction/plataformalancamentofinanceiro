package br.com.plataformalancamentofinanceiro.repository;

import java.util.List;

import br.com.plataformalancamentofinanceiro.domain.PessoaDomain;

public interface PessoaRepositoryInterface {
	public PessoaDomain persist(PessoaDomain pessoaDomain);
	public PessoaDomain delete(PessoaDomain pessoaDomain);
	public PessoaDomain update(PessoaDomain pessoaDomain);
	public List<PessoaDomain> findAll();
	public PessoaDomain findOne(Long codigo);
	public PessoaDomain findOne(String nome);
}
