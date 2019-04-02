package br.com.plataformalancamentofinanceiro.resource;

import java.io.Serializable;
import java.util.List;

import javax.inject.Inject;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import br.com.plataformalancamentofinanceiro.domain.GerenciadorPessoaDomain;
import br.com.plataformalancamentofinanceiro.service.GerenciadorPessoaService;

@Path("/pessoaRest")
@Produces({MediaType.APPLICATION_JSON,
		  MediaType.APPLICATION_ATOM_XML})
@Consumes(MediaType.APPLICATION_JSON)
public class GerenciadorPessoaResource implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Inject
	private GerenciadorPessoaService gerenciadorPessoaService;
	
	public GerenciadorPessoaResource() { }
	
	@GET
	public List<GerenciadorPessoaDomain> findAll() {
		return gerenciadorPessoaService.findAll();
	}

	public GerenciadorPessoaService getPessoaService() {
		return gerenciadorPessoaService;
	}

	public void setPessoaService(GerenciadorPessoaService gerenciadorPessoaService) {
		this.gerenciadorPessoaService = gerenciadorPessoaService;
	}

}
