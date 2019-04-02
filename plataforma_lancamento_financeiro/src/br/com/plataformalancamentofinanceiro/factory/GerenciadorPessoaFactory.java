package br.com.plataformalancamentofinanceiro.factory;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import br.com.plataformalancamentofinanceiro.domain.GerenciadorPessoaDomain;
import br.com.plataformalancamentofinanceiro.enumeration.TipoPessoaEnumeration;

public class GerenciadorPessoaFactory implements Serializable {

	private static final long serialVersionUID = 1L;
	
	public GerenciadorPessoaFactory() { }
	
	public static GerenciadorPessoaDomain getJamileBatistaAlves() {
		GerenciadorPessoaDomain gerenciadorPessoaDomain = new GerenciadorPessoaDomain();
			gerenciadorPessoaDomain.setCodigo(1L);
			gerenciadorPessoaDomain.setIsAtivo(Boolean.TRUE);
			gerenciadorPessoaDomain.setIsFontePagamento(Boolean.TRUE);
			gerenciadorPessoaDomain.setNome("Jamile Batista Alves");
			gerenciadorPessoaDomain.setTipoPessoaEnumeration(TipoPessoaEnumeration.PESSOA_FISICA);
		return gerenciadorPessoaDomain; 
	}
	
	public static GerenciadorPessoaDomain getJoseQuintin() {
		GerenciadorPessoaDomain gerenciadorPessoaDomain = new GerenciadorPessoaDomain();
			gerenciadorPessoaDomain.setCodigo(2L);
			gerenciadorPessoaDomain.setIsAtivo(Boolean.TRUE);
			gerenciadorPessoaDomain.setIsFontePagamento(Boolean.TRUE);
			gerenciadorPessoaDomain.setNome("José Quintin");
			gerenciadorPessoaDomain.setTipoPessoaEnumeration(TipoPessoaEnumeration.PESSOA_FISICA);
		return gerenciadorPessoaDomain;
	}
	
	public static GerenciadorPessoaDomain getLeiaRodriguesSilva() {
		GerenciadorPessoaDomain gerenciadorPessoaDomain = new GerenciadorPessoaDomain();
			gerenciadorPessoaDomain.setCodigo(3L);
			gerenciadorPessoaDomain.setIsAtivo(Boolean.TRUE);
			gerenciadorPessoaDomain.setIsFontePagamento(Boolean.TRUE);
			gerenciadorPessoaDomain.setNome("Léia Rodrigues Silva");
			gerenciadorPessoaDomain.setTipoPessoaEnumeration(TipoPessoaEnumeration.PESSOA_FISICA);
		return gerenciadorPessoaDomain;
	}
	
	public static List<GerenciadorPessoaDomain> findAll() {
		List<GerenciadorPessoaDomain> pessoaDomainList = new ArrayList<GerenciadorPessoaDomain>();
			pessoaDomainList.add(getJamileBatistaAlves());
			pessoaDomainList.add(getJoseQuintin());
			pessoaDomainList.add(getLeiaRodriguesSilva());
		return pessoaDomainList;
	}
	
	
}
