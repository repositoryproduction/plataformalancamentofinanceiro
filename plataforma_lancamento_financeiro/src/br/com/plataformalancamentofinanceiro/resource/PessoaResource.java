package br.com.plataformalancamentofinanceiro.resource;

import java.io.Serializable;
import java.util.List;

import javax.inject.Inject;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import br.com.plataformalancamentofinanceiro.domain.PessoaDomain;
import br.com.plataformalancamentofinanceiro.service.PessoaService;

@Path("/pessoaRest")
@Produces({MediaType.APPLICATION_JSON,
		  MediaType.APPLICATION_ATOM_XML})
@Consumes(MediaType.APPLICATION_JSON)
public class PessoaResource implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Inject
	private PessoaService pessoaService;
	
	public PessoaResource() { }
	
	@GET
	public List<PessoaDomain> findAll() {
//		return PessoaFactory.findAll();
		return pessoaService.findAll();
	}

	public PessoaService getPessoaService() {
		return pessoaService;
	}

	public void setPessoaService(PessoaService pessoaService) {
		this.pessoaService = pessoaService;
	}

}
