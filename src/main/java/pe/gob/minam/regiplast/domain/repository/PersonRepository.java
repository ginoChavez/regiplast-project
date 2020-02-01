package pe.gob.minam.regiplast.domain.repository;

import java.util.List;

import pe.gob.minam.regiplast.domain.entity.Person;

public interface PersonRepository {
	public Person save(Person person);
	public List<Person> get(int page, int pageSize);
	public Person get(long personId);
}
