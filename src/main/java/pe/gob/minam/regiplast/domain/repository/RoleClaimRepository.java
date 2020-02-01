package pe.gob.minam.regiplast.domain.repository;

import java.util.List;

import pe.gob.minam.regiplast.domain.entity.RoleClaim;

public interface RoleClaimRepository {
	public List<RoleClaim> findByRoleId(Long roleId) throws Exception;
}
	