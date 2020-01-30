package regiplast.application.dto;

public class DeclaracionDto {
	private long id;
	private EmpresaDto empresa;
	private String anio;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public EmpresaDto getEmpresa() {
		return empresa;
	}
	public void setEmpresa(EmpresaDto empresa) {
		this.empresa = empresa;
	}
	public String getAnio() {
		return anio;
	}
	public void setAnio(String anio) {
		this.anio = anio;
	}
	
}
