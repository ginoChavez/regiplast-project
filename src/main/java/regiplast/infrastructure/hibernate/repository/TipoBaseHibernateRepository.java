package regiplast.infrastructure.hibernate.repository;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import regiplast.domain.entity.TipoBase;
import regiplast.domain.repository.TipoBaseRepository;
import regiplast.infrastructure.hibernate.repository.common.BaseHibernateRepository;

@Transactional
@Repository
public class TipoBaseHibernateRepository extends BaseHibernateRepository<TipoBase> implements TipoBaseRepository {
	@SuppressWarnings("deprecation")
	public TipoBase getById(long tipoBaseId) {
		Session session = sessionFactory.getCurrentSession();
		Query query = session.createSQLQuery("CALL getTipado(:tipoBaseId)")
				.addEntity(TipoBase.class)
				.setParameter("tipoBaseId", tipoBaseId);
		TipoBase tipoBase = null;
		if(query.list()!=null&&!query.list().isEmpty()) {
			tipoBase = (TipoBase) query.list().get(0);
		}
				
		return tipoBase;
	}
	
	@SuppressWarnings("unchecked")
	@Override
	public List<TipoBase> getByCodigo(String codigo) {
		List<TipoBase> tipoBases = new ArrayList<TipoBase>();
		Session session = sessionFactory.getCurrentSession();
		Query query = session.createSQLQuery(
				"CALL getTipados(:codigo)")
				.addEntity(TipoBase.class)
				.setParameter("codigo", codigo);
		tipoBases = query.list();
		return tipoBases;
	}
	
	public TipoBase save(TipoBase tipoBase) {
		return super.save(tipoBase);
	}
}
