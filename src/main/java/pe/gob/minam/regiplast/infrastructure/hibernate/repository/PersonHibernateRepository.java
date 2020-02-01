package pe.gob.minam.regiplast.infrastructure.hibernate.repository;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import pe.gob.minam.regiplast.domain.entity.Person;
import pe.gob.minam.regiplast.domain.repository.PersonRepository;
import pe.gob.minam.regiplast.infrastructure.hibernate.repository.common.BaseHibernateRepository;

@Transactional
@Repository
public class PersonHibernateRepository extends BaseHibernateRepository<Person> implements PersonRepository {
	public Person get(long personId) {
		Session session = sessionFactory.getCurrentSession();
		Query query = session.createSQLQuery("select p.id_person, p.first_name, p.last_name, "
				+ " p.id_number, p.address, p.phone, p.email, p.active " + 
				"from person p where p.id_person = :personId");
		List<Object[]> rows = query.setLong("personId", personId).list();
		Person person = null;
		if(!rows.isEmpty()) {
			Object[] row = rows.get(0);
			person = new Person(Long.valueOf(row[0].toString()), (String) row[1], (String) row[2], (String) row[3], (String) row[4], (String) row[5], (String) row[6], (Boolean)row[7]);
		}
		return person;
	}
	
	@SuppressWarnings("unchecked")
	@Override
	public List<Person> get(int page, int pageSize) {
		List<Person> persons = new ArrayList<Person>();
		Session session = sessionFactory.getCurrentSession();
		Query query = session.createSQLQuery("select p.id_person, p.first_name, p.last_name, "
				+ " p.id_number, p.address, p.phone, p.email, p.active " + 
				"from person p ");
		query.setFirstResult(page);
		query.setMaxResults(pageSize);
		List<Object[]> rows = query.list();
		Person person = null;
		if(!rows.isEmpty()) {
			for (Object[] row : rows) {
			    person = new Person(Long.valueOf(row[0].toString()), (String) row[1], (String) row[2], (String) row[3], (String) row[4], (String) row[5], (String) row[6], (Boolean)row[7]);
				persons.add(person);
			}
		}
		return persons;
	}
	
	public Person save(Person person) {
		return super.save(person);
	}
}
