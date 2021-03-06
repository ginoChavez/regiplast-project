package pe.gob.minam.regiplast.domain.repository;

import java.util.List;

import pe.gob.minam.regiplast.domain.entity.TipoBase;

public interface TipoBaseRepository {
	public TipoBase save(TipoBase tipoBase);
	public TipoBase getById(long tipoBaseId);
	public List<TipoBase> getByCodigo(String codigo);
}
