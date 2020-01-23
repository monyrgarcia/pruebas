package mx.com.sura.cobranza.comunes.beans;

import java.io.Serializable;
import java.util.List;

public class CatalogosBean implements Serializable{

	private static final long serialVersionUID = 2835943292079416583L;
	private Long id;
	private String descripcion;
	private String nombre;
	private List<Integer> filtro;
	private Long idEntero;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public List<Integer> getFiltro() {
		return filtro;
	}
	public void setFiltro(List<Integer> filtro) {
		this.filtro = filtro;
	}
	public Long getIdEntero() {
		return idEntero;
	}
	public void setIdEntero(Long idEntero) {
		this.idEntero = idEntero;
	}
}
