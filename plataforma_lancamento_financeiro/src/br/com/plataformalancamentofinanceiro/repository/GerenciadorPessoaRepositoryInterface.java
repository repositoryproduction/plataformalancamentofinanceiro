package br.com.plataformalancamentofinanceiro.repository;

import java.util.List;

import br.com.plataformalancamentofinanceiro.domain.GerenciadorPessoaDomain;

public interface GerenciadorPessoaRepositoryInterface {
	public GerenciadorPessoaDomain persist(GerenciadorPessoaDomain gerenciadorPessoaDomain);
	public GerenciadorPessoaDomain delete(GerenciadorPessoaDomain gerenciadorPessoaDomain);
	public GerenciadorPessoaDomain update(GerenciadorPessoaDomain gerenciadorPessoaDomain);
	public List<GerenciadorPessoaDomain> findAll();
	public GerenciadorPessoaDomain findOne(Long codigo);
	public GerenciadorPessoaDomain findOne(String nome);
}
