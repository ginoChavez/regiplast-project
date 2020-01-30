package regiplast.domain.repository;

import java.util.List;

import regiplast.domain.entity.RoleClaim;

public interface RoleClaimRepository {
	public List<RoleClaim> findByRoleId(Long roleId) throws Exception;
}
	