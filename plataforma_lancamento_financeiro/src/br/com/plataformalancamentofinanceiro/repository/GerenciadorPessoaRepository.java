package br.com.plataformalancamentofinanceiro.repository;

import java.io.Serializable;
import java.util.List;

import javax.inject.Inject;

import br.com.plataformalancamentofinanceiro.domain.GerenciadorPessoaDomain;

public class GerenciadorPessoaRepository implements Serializable, GerenciadorPessoaRepositoryInterface {

	private static final long serialVersionUID = 1L;
	
	@Inject
	private BaseRepository<GerenciadorPessoaDomain> baseRepository;
	
	public GerenciadorPessoaRepository() { }

	@Override
	public GerenciadorPessoaDomain persist(GerenciadorPessoaDomain gerenciadorPessoaDomain) {
		return (GerenciadorPessoaDomain) baseRepository.persist(gerenciadorPessoaDomain);
	}

	@Override
	public GerenciadorPessoaDomain delete(GerenciadorPessoaDomain gerenciadorPessoaDomain) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public GerenciadorPessoaDomain update(GerenciadorPessoaDomain gerenciadorPessoaDomain) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<GerenciadorPessoaDomain> findAll() {
		return baseRepository.findAll(GerenciadorPessoaDomain.class);
	}

	@Override
	public GerenciadorPessoaDomain findOne(Long codigo) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public GerenciadorPessoaDomain findOne(String nome) {
		// TODO Auto-generated method stub
		return null;
	}

	public BaseRepository<GerenciadorPessoaDomain> getBaseRepository() {
		return baseRepository;
	}

	public void setBaseRepository(BaseRepository<GerenciadorPessoaDomain> baseRepository) {
		this.baseRepository = baseRepository;
	}
	
}
