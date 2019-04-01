package br.com.plataformalancamentofinanceiro.repository;

import java.io.Serializable;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.jboss.logging.Logger;

public class BaseRepository<T> implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private static final Logger LOGGER = Logger.getLogger(BaseRepository.class);
	
	@PersistenceContext(unitName = "plataforma_lancamento_financeiro_PU")
	private EntityManager entityManager;
	
	public BaseRepository() { }

	public T persist(T object) {
		entityManager.persist(object);
		return object;
	}
	
	@SuppressWarnings("unchecked")
	public List<T> findAll(Class<T> object) {
		Query query = entityManager.createQuery("FROM " + object.getSimpleName());
		return query.getResultList();
	}

	public EntityManager getEntityManager() {
		return entityManager;
	}

	public void setEntityManager(EntityManager entityManager) {
		this.entityManager = entityManager;
	}

	public static Logger getLogger() {
		return LOGGER;
	}
	
}
