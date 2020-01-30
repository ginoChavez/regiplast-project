package regiplast.domain.entity;

public class Declaracion {
	private long id;
	private Empresa empresa;
	private String anio;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public Empresa getEmpresa() {
		return empresa;
	}
	public void setEmpresa(Empresa empresa) {
		this.empresa = empresa;
	}
	public String getAnio() {
		return anio;
	}
	public void setAnio(String anio) {
		this.anio = anio;
	}
	
}
