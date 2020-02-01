package pe.gob.minam.regiplast.infrastructure.hibernate.repository;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import pe.gob.minam.regiplast.domain.entity.RoleClaim;
import pe.gob.minam.regiplast.domain.repository.RoleClaimRepository;
import pe.gob.minam.regiplast.infrastructure.hibernate.repository.common.BaseHibernateRepository;

@Transactional
@Repository
public class RoleClaimHibernateRepository extends BaseHibernateRepository<RoleClaim> implements RoleClaimRepository {

	@Override
	public List<RoleClaim> findByRoleId(Long roleId) throws Exception {
		List<RoleClaim> roleClaims = null;
		Session session = sessionFactory.getCurrentSession();
		Query query = session.createSQLQuery("select rc.id_role_claim, rc.claim_type, rc.claim_value from role_claim rc where rc.id_role = :roleId ");
		List<Object[]> rows = query.setLong("roleId", roleId).list();
		RoleClaim roleClaim = null;
		roleClaims = new ArrayList<RoleClaim>();
		for (Object[] row : rows) {
			roleClaim = new RoleClaim();
			roleClaim.setId(Long.valueOf(row[0].toString()));
			roleClaim.setType(String.valueOf(row[1].toString()));
			//roleClaim.setValue(Boolean.valueOf(row[1].toString()));
			roleClaims.add(roleClaim);
		}
		return roleClaims;
	}
	/*@SuppressWarnings("unchecked")
	public List<RoleClaim> findByRoleId(Long roleId) throws Exception {
		List<RoleClaim> roleClaims = null;
		Criteria criteria = getSession().createCriteria(RoleClaim.class, "rc");
		criteria.createAlias("rc.role", "r");
		//criteria.setFetchMode("user", FetchMode.SELECT); 
		criteria.add(Restrictions.eq("r.id", roleId));
		roleClaims = criteria.list();
		return roleClaims;
	}*/
	
	

}
