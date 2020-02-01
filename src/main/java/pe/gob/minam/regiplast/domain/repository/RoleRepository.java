package pe.gob.minam.regiplast.domain.repository;

import java.util.List;

import pe.gob.minam.regiplast.domain.entity.Role;

public interface RoleRepository {
	public Role save(Role role);
	public List<Role> getPaginated(int page, int pageSize);
	public List<Role> getAll();
	public Role getById(long roleId);
}
