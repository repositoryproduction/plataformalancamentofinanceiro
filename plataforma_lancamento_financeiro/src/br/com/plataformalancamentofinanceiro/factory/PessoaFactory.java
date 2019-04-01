package br.com.plataformalancamentofinanceiro.factory;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import br.com.plataformalancamentofinanceiro.domain.PessoaDomain;
import br.com.plataformalancamentofinanceiro.enumeration.TipoPessoaEnumeration;

public class PessoaFactory implements Serializable {

	private static final long serialVersionUID = 1L;
	
	public PessoaFactory() { }
	
	public static PessoaDomain getJamileBatistaAlves() {
		PessoaDomain pessoaDomain = new PessoaDomain();
			pessoaDomain.setCodigo(1L);
			pessoaDomain.setIsAtivo(Boolean.TRUE);
			pessoaDomain.setIsFontePagamento(Boolean.TRUE);
			pessoaDomain.setNome("Jamile Batista Alves");
			pessoaDomain.setTipoPessoaEnumeration(TipoPessoaEnumeration.PESSOA_FISICA);
		return pessoaDomain; 
	}
	
	public static PessoaDomain getJoseQuintin() {
		PessoaDomain pessoaDomain = new PessoaDomain();
			pessoaDomain.setCodigo(2L);
			pessoaDomain.setIsAtivo(Boolean.TRUE);
			pessoaDomain.setIsFontePagamento(Boolean.TRUE);
			pessoaDomain.setNome("José Quintin");
			pessoaDomain.setTipoPessoaEnumeration(TipoPessoaEnumeration.PESSOA_FISICA);
		return pessoaDomain;
	}
	
	public static PessoaDomain getLeiaRodriguesSilva() {
		PessoaDomain pessoaDomain = new PessoaDomain();
			pessoaDomain.setCodigo(3L);
			pessoaDomain.setIsAtivo(Boolean.TRUE);
			pessoaDomain.setIsFontePagamento(Boolean.TRUE);
			pessoaDomain.setNome("Léia Rodrigues Silva");
			pessoaDomain.setTipoPessoaEnumeration(TipoPessoaEnumeration.PESSOA_FISICA);
		return pessoaDomain;
	}
	
	public static List<PessoaDomain> findAll() {
		List<PessoaDomain> pessoaDomainList = new ArrayList<PessoaDomain>();
			pessoaDomainList.add(getJamileBatistaAlves());
			pessoaDomainList.add(getJoseQuintin());
			pessoaDomainList.add(getLeiaRodriguesSilva());
		return pessoaDomainList;
	}
	
	
}
