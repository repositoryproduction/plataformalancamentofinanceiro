package br.com.plataformalancamentofinanceiro.domain;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

import br.com.plataformalancamentofinanceiro.enumeration.TipoAtivoCirculanteEnumeration;

@Entity
@Table(name = "TB_ATIVO_CIRCULANTE")
@XmlRootElement
public class AtivoCirculanteDomain implements Serializable {
	
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "CODIGO")
	private Long codigo;
	
	@Column(name = "ID_FONTE_PAGAMENTO")
	private PessoaDomain fontePagamento;
	
	@Column(name = "TIPO_ATIVO_CIRCULANTE")
	private TipoAtivoCirculanteEnumeration tipoAtivoCirculanteEnumeration;
	
	@Column(name = "NUMERO_PARCELA")
	private String numeroParcela;
	
	@Column(name = "VALOR_PARCELA", scale = 2, precision = 2)
	private Double valorParcela;
	
	@Column(name = "DATA_RECEBIMENTO")
	private Date dataRecebimento;
	
	@Column(name = "ID_DESTINO_PAGAMENTO")
	private PessoaDomain contaDestinoPagamento;
	
	@Column(name = "OBSERVACAO")
	private String observacao;
	
	public AtivoCirculanteDomain() { }
	
	public AtivoCirculanteDomain(Long codigo, PessoaDomain fontePagamento, TipoAtivoCirculanteEnumeration tipoAtivoCirculanteEnumeration, String numeroParcela, Double valorParcela, Date dataRecebimento, PessoaDomain contaDestinoPagamento, String observacao) {
		super();
		this.codigo = codigo;
		this.fontePagamento = fontePagamento;
		this.tipoAtivoCirculanteEnumeration = tipoAtivoCirculanteEnumeration;
		this.numeroParcela = numeroParcela;
		this.valorParcela = valorParcela;
		this.dataRecebimento = dataRecebimento;
		this.contaDestinoPagamento = contaDestinoPagamento;
		this.observacao = observacao;
	}
	
	public Long getCodigo() {
		return codigo;
	}

	public void setCodigo(Long codigo) {
		this.codigo = codigo;
	}

	public PessoaDomain getFontePagamento() {
		return fontePagamento;
	}

	public void setFontePagamento(PessoaDomain fontePagamento) {
		this.fontePagamento = fontePagamento;
	}

	public TipoAtivoCirculanteEnumeration getTipoAtivoCirculanteEnumeration() {
		return tipoAtivoCirculanteEnumeration;
	}

	public void setTipoAtivoCirculanteEnumeration(TipoAtivoCirculanteEnumeration tipoAtivoCirculanteEnumeration) {
		this.tipoAtivoCirculanteEnumeration = tipoAtivoCirculanteEnumeration;
	}

	public String getNumeroParcela() {
		return numeroParcela;
	}

	public void setNumeroParcela(String numeroParcela) {
		this.numeroParcela = numeroParcela;
	}

	public Double getValorParcela() {
		return valorParcela;
	}

	public void setValorParcela(Double valorParcela) {
		this.valorParcela = valorParcela;
	}

	public Date getDataRecebimento() {
		return dataRecebimento;
	}

	public void setDataRecebimento(Date dataRecebimento) {
		this.dataRecebimento = dataRecebimento;
	}

	public PessoaDomain getContaDestinoPagamento() {
		return contaDestinoPagamento;
	}

	public void setContaDestinoPagamento(PessoaDomain contaDestinoPagamento) {
		this.contaDestinoPagamento = contaDestinoPagamento;
	}

	public String getObservacao() {
		return observacao;
	}

	public void setObservacao(String observacao) {
		this.observacao = observacao;
	}

}
