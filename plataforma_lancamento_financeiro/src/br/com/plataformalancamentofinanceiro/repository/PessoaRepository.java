package br.com.plataformalancamentofinanceiro.repository;

import java.io.Serializable;
import java.util.List;

import javax.inject.Inject;

import br.com.plataformalancamentofinanceiro.domain.PessoaDomain;

public class PessoaRepository implements Serializable, PessoaRepositoryInterface {

	private static final long serialVersionUID = 1L;
	
	@Inject
	private BaseRepository<PessoaDomain> baseRepository;
	
	public PessoaRepository() { }

	@Override
	public PessoaDomain persist(PessoaDomain pessoaDomain) {
		return (PessoaDomain) baseRepository.persist(pessoaDomain);
	}

	@Override
	public PessoaDomain delete(PessoaDomain pessoaDomain) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public PessoaDomain update(PessoaDomain pessoaDomain) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<PessoaDomain> findAll() {
		return baseRepository.findAll(PessoaDomain.class);
	}

	@Override
	public PessoaDomain findOne(Long codigo) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public PessoaDomain findOne(String nome) {
		// TODO Auto-generated method stub
		return null;
	}

	public BaseRepository<PessoaDomain> getBaseRepository() {
		return baseRepository;
	}

	public void setBaseRepository(BaseRepository<PessoaDomain> baseRepository) {
		this.baseRepository = baseRepository;
	}
	
}
