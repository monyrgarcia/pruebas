package mx.com.sura.cobranza.comunes.dto;

import java.io.Serializable;
import java.util.List;

public class CatalogoDTO implements Serializable {

	private static final long serialVersionUID = 2820227427348667663L;
	private String id;
	private String descripcion;

	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

}
