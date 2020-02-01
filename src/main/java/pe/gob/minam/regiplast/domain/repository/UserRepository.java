package pe.gob.minam.regiplast.domain.repository;

import java.util.List;

import pe.gob.minam.regiplast.domain.entity.User;

public interface UserRepository {
	public User save(User user);
	public User getById(long userId);
	public User getByName(String name);
	public List<User> getPaginated(int page, int pageSize);
}
