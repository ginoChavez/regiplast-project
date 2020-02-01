package pe.gob.minam.regiplast.domain.entity;

public class TipoBase {
	
	private long id;
	private String tipo;
	private String nombre;
	private String descripcion;
	
	
	public TipoBase() {
		super();
	}
	public TipoBase(long id, String tipo, String nombre, String descripcion) {
		super();
		this.id = id;
		this.tipo = tipo;
		this.nombre = nombre;
		this.descripcion = descripcion;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	
	

}
