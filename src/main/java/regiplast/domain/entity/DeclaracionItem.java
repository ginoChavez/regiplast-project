package regiplast.domain.entity;

public class DeclaracionItem {
	private long id;
	private Proveedor proveedor;
	private TipoBase tipoDeclaracion;
	private TipoBase tipoBien;
	private TipoBase tipoResina;
	private TipoBase tipoUso;
	private TipoBase formaValoracion;
	private Origen origen;
	private Destino destino;
	private short biodegradable;
	private Integer porcentajeReciclado;
	private Integer cantidad;
	private Integer peso;
	private short mes;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public Proveedor getProveedor() {
		return proveedor;
	}
	public void setProveedor(Proveedor proveedor) {
		this.proveedor = proveedor;
	}
	public TipoBase getTipoDeclaracion() {
		return tipoDeclaracion;
	}
	public void setTipoDeclaracion(TipoBase tipoDeclaracion) {
		this.tipoDeclaracion = tipoDeclaracion;
	}
	public TipoBase getTipoBien() {
		return tipoBien;
	}
	public void setTipoBien(TipoBase tipoBien) {
		this.tipoBien = tipoBien;
	}
	public TipoBase getTipoResina() {
		return tipoResina;
	}
	public void setTipoResina(TipoBase tipoResina) {
		this.tipoResina = tipoResina;
	}
	public TipoBase getTipoUso() {
		return tipoUso;
	}
	public void setTipoUso(TipoBase tipoUso) {
		this.tipoUso = tipoUso;
	}
	public TipoBase getFormaValoracion() {
		return formaValoracion;
	}
	public void setFormaValoracion(TipoBase formaValoracion) {
		this.formaValoracion = formaValoracion;
	}
	public Origen getOrigen() {
		return origen;
	}
	public void setOrigen(Origen origen) {
		this.origen = origen;
	}
	public Destino getDestino() {
		return destino;
	}
	public void setDestino(Destino destino) {
		this.destino = destino;
	}
	public short getBiodegradable() {
		return biodegradable;
	}
	public void setBiodegradable(short biodegradable) {
		this.biodegradable = biodegradable;
	}
	public Integer getPorcentajeReciclado() {
		return porcentajeReciclado;
	}
	public void setPorcentajeReciclado(Integer porcentajeReciclado) {
		this.porcentajeReciclado = porcentajeReciclado;
	}
	public Integer getCantidad() {
		return cantidad;
	}
	public void setCantidad(Integer cantidad) {
		this.cantidad = cantidad;
	}
	public Integer getPeso() {
		return peso;
	}
	public void setPeso(Integer peso) {
		this.peso = peso;
	}
	public short getMes() {
		return mes;
	}
	public void setMes(short mes) {
		this.mes = mes;
	}
	
}
