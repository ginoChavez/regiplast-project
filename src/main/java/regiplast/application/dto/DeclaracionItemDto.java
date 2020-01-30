package regiplast.application.dto;

public class DeclaracionItemDto {
	private long id;
	private ProveedorDto proveedor;
	private TipoBaseDto tipoDeclaracion;
	private TipoBaseDto tipoBien;
	private TipoBaseDto tipoResina;
	private TipoBaseDto tipoUso;
	private TipoBaseDto formaValoracion;
	private OrigenDto origen;
	private DestinoDto destino;
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
	public TipoBaseDto getTipoDeclaracion() {
		return tipoDeclaracion;
	}
	public void setTipoDeclaracion(TipoBaseDto tipoDeclaracion) {
		this.tipoDeclaracion = tipoDeclaracion;
	}
	public TipoBaseDto getTipoBien() {
		return tipoBien;
	}
	public void setTipoBien(TipoBaseDto tipoBien) {
		this.tipoBien = tipoBien;
	}
	public TipoBaseDto getTipoResina() {
		return tipoResina;
	}
	public void setTipoResina(TipoBaseDto tipoResina) {
		this.tipoResina = tipoResina;
	}
	public TipoBaseDto getTipoUso() {
		return tipoUso;
	}
	public void setTipoUso(TipoBaseDto tipoUso) {
		this.tipoUso = tipoUso;
	}
	public TipoBaseDto getFormaValoracion() {
		return formaValoracion;
	}
	public void setFormaValoracion(TipoBaseDto formaValoracion) {
		this.formaValoracion = formaValoracion;
	}
	
	public ProveedorDto getProveedor() {
		return proveedor;
	}
	public void setProveedor(ProveedorDto proveedor) {
		this.proveedor = proveedor;
	}
	public OrigenDto getOrigen() {
		return origen;
	}
	public void setOrigen(OrigenDto origen) {
		this.origen = origen;
	}
	public DestinoDto getDestino() {
		return destino;
	}
	public void setDestino(DestinoDto destino) {
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
