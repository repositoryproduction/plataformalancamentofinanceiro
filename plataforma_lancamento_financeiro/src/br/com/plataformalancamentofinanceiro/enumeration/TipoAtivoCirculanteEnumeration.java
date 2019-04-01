package br.com.plataformalancamentofinanceiro.enumeration;

public enum TipoAtivoCirculanteEnumeration {
	
	ATIVO_CIRCULANTE_A(1, "A", "Composição de Salário Mensal"),
	ATIVO_CIRCULANTE_B(2, "B", "Devolução de Empréstimo"),
    ATIVO_CIRCULANTE_C(3, "C", "Recisão Contratual"),
    ATIVO_CIRCULANTE_D(4, "D", "Retorno de Investimento Financeiro"),
    ATIVO_CIRCULANTE_E(5, "E", "Receita de Vendas");
	
	private Integer codigo;
	private String sigla;
	private String descricao;
	
	private TipoAtivoCirculanteEnumeration(Integer codigo, String sigla, String descricao) {
		this.codigo = codigo;
		this.sigla = sigla;
		this.descricao = descricao;
	}

	public Integer getCodigo() {
		return codigo;
	}

	public String getSigla() {
		return sigla;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}

	public void setSigla(String sigla) {
		this.sigla = sigla;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
}
