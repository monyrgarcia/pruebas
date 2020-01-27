/**
 * SURA
 *
 * Creado el 06/02/2019 18:19:15 (dd/mm/aaaa hh:mm)
 *
 * Copyright SURA(C) All rights reserved. Todos los derechos reservados.
 *
 */
package mx.com.sura.cobranza.comunes.constantes;

/**
 * @Proyecto: resttest
 * @Paquete: mx.com.sura.cobranza.comunes.constantes
 * @Clase: ECodesAdmonConfiguracion.java.
 *
 * @version 1.0.0 
 */
public enum ECodesAdmonConfiguracion {

	/**
	 * Codigo generico de operacion realizada con exito
	 */
	FCCAT000("FCCAT000"),
	/**
	 * Codigo generico de error al realizar la operacion
	 */
	FCCAT001("FCCAT001"),
	/**
	 * Codigo generico en caso de que el identificador del catalogo sea negativo
	 */
	FCCAT002("FCCAT002"),
	/**
	 * Codigo de error en caso de que no se informe la clave de catalogo generico
	 */
	FCCAT003("FCCAT003"),
	
	/**
	 * Debe asociar al menos un trámite a cada pool
	 */
	FCCAT004("FCCAT004"),
	/**
	 * Codigo de configuración exitosa
	 */
	FCCAT005("FCCAT005"),
	/**
	 * Codigo de error por asociacion rol-pool-tramite
	 */
	FCCAT006("FCCAT006"),
	
	/**
	 * 
	 */
	FCCAT007("FCCAT007"),
	
	/**
	 * Codigo de error cuando la asociacion pool tramite ya existe para el usuario
	 * con rol supervisor
	 */
	FCCAT008("FCCAT008"),
	
	FCCAT009("FCCAT009")
	;

	/**
	 * codigo
	 */
	private final String code;

	/**
	 * 
	 * Constructor de la clase
	 * @param code
	 */
	ECodesAdmonConfiguracion(final String code) {
		this.code = code;
	}

	/**
	 * 
	 * Metodo que regresa el codigo
	 * @return String
	 * 			codigo
	 */
	public String code() {
		return this.code;
	}
}
