/**
 * SURA
 *
 * Creado el 05/02/2019 19:09:46 (dd/mm/aaaa hh:mm)
 *
 * Copyright SURA(C) All rights reserved. Todos los derechos reservados.
 *
 */
package mx.com.sura.cobranza.comunes.dto;

import java.io.Serializable;

import javax.validation.constraints.NotBlank;

/**
 * @Proyecto: ms-fc-admon-configuracion-service
 * @Paquete: mx.com.sura.cobranza.admonconfiguracion.dto
 * @Clase: TestDTO.java.
 *
 * @version 1.0.0 
 */
public class TestDTO implements Serializable {

	/**
	 * id de serial
	 */
	private static final long serialVersionUID = 38637131780588159L;

	/**
	 * nombre de la persona a saludar
	 */
	@NotBlank(message = "[test.nombre.requerido]")
	private String nombre;

	/**
	 * apellido de la persona a saludar
	 */
	@NotBlank(message = "[test.apellido.requerido]")
	private String apellido;

	/**
	 * Obtener valor.
	 * @return El valor de nombre.  
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * Fija el valor.
	 *
	 * @param nombre el valor de nombre a colocar
	 */
	public void setNombre(final String nombre) {
		this.nombre = nombre;
	}

	/**
	 * Obtener valor.
	 * @return El valor de apellido.  
	 */
	public String getApellido() {
		return apellido;
	}

	/**
	 * Fija el valor.
	 *
	 * @param apellido el valor de apellido a colocar
	 */
	public void setApellido(final String apellido) {
		this.apellido = apellido;
	}
}
