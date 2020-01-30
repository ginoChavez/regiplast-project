package regiplast.infrastructure.hibernate.repository;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import regiplast.domain.entity.Person;
import regiplast.domain.entity.Role;
import regiplast.domain.entity.User;
import regiplast.domain.repository.UserRepository;
import regiplast.infrastructure.hibernate.repository.common.BaseHibernateRepository;

@Transactional
@Repository
public class UserHibernateRepository extends BaseHibernateRepository<User> implements UserRepository {
	public User getById(long userId) {
		
		User user = new User();
		Session session = sessionFactory.getCurrentSession();
		Query query = session.createSQLQuery("select u.id user_id, u.user_name, r.id role_id, r.role_name, p.id person_id, p.first_name, p.last_name, "
				+ " p.id_number, p.address, p.phone, p.email, p.active " + 
				"from user u " + 
				"left join person p on u.person_id = p.id " + 
				"inner join role r on u.role_id=r.id "
				+ "where u.id = :userId");
		List<Object[]> rows = query.setLong("userId", userId).list();
		//User user = null;
		if(!rows.isEmpty()) {
			Role role = null;
			Person person = null;
			Object[] row = rows.get(0);
			user = new User(Long.valueOf(row[0].toString()), (String) row[1]);
			role = new Role(Long.valueOf(row[2].toString()), (String) row[3]);
			if(row[4]!=null) {
				person = new Person(Long.valueOf(row[4].toString()), (String) row[5], (String) row[6], (String) row[7], (String) row[8], (String) row[9], (String) row[10], (Boolean)row[11]);
			}
			user.setPerson(person);
			user.setRole(role);
		}
		return user;
	}
	
	public User getByName(String name) {
		User user = null;
		Session session = sessionFactory.getCurrentSession();
		Query query = session.createSQLQuery("select u.id user_id, u.user_name, u.password, r.id role_id, r.role_name, p.id person_id, p.first_name, p.last_name, "
				+ " p.id_number, p.address, p.phone, p.email, p.active " + 
				"from user u " + 
				"left join person p on u.person_id = p.id " + 
				"inner join role r on u.role_id=r.id "
				+ "where u.user_name = :userName");
		List<Object[]> rows = query.setString("userName", name).list();
		//User user = null;
		if(!rows.isEmpty()) {
			Role role = null;
			Person person = null;
			Object[] row = rows.get(0);
			user = new User(Long.valueOf(row[0].toString()), (String) row[1], (String) row[2]);
			role = new Role(Long.valueOf(row[3].toString()), (String) row[4]);
			if(row[5]!=null) {
				person = new Person(Long.valueOf(row[5].toString()), (String) row[6], (String) row[7], (String) row[8], (String) row[9], (String) row[10], (String) row[11], (Boolean)row[12]);
			}
			user.setPerson(person);
			user.setRole(role);
		}
		return user;
	}
	
	public User save(User user) {
		return super.save(user);
	}

	@Override
	public List<User> getPaginated(int page, int pageSize) {
		List<User> users = null;
		Session session = sessionFactory.getCurrentSession();
		Query query = session.createSQLQuery("select u.id user_id, u.user_name, r.id role_id, r.role_name, p.id person_id, p.first_name, p.last_name, "
				+ " p.id_number, p.address, p.phone, p.email, p.active " + 
				"from user u " + 
				"left join person p on u.person_id = p.id " + 
				"inner join role r on u.role_id=r.id");
		query.setFirstResult(page);
		query.setMaxResults(pageSize);
		List<Object[]> rows = query.list();
		User user = null;
		Role role = null;
		Person person = null;
		users = new ArrayList<User>();
		if(!rows.isEmpty()) {
			for (Object[] row : rows) {
				user = new User(Long.valueOf(row[0].toString()), (String) row[1]);
				role = new Role(Long.valueOf(row[2].toString()), (String) row[3]);
				if(row[4]!=null) {
					person = new Person(Long.valueOf(row[4].toString()), (String) row[5], (String) row[6], (String) row[7], (String) row[8], (String) row[9], (String) row[10], (Boolean)row[11]);
				}
				user.setPerson(person);
				user.setRole(role);
				users.add(user);
			}
		}
		return users;
	}
}
