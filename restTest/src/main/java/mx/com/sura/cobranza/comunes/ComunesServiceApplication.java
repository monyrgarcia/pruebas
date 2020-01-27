/**
 * SURA
 *
 * Creado el 13/12/2018 11:46:48 (dd/mm/aaaa hh:mm)
 *
 * Copyright SURA(C) All rights reserved. Todos los derechos reservados.
 *
 */
package mx.com.sura.cobranza.comunes;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;
import org.springframework.context.annotation.Bean;

import com.netflix.hystrix.contrib.metrics.eventstream.HystrixMetricsStreamServlet;

import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * 
 * @Proyecto: resttest
 * @Paquete: mx.com.sura.cobranza.comunes
 * @Clase: ComunesServiceApplication.java.
 *
 * @version 1.0.0
 */
@SpringBootApplication
@EnableSwagger2
@EnableHystrix
@EnableHystrixDashboard
public class ComunesServiceApplication {

	/**
     * Inicializacion de la aplicacion mediante spring-boot
     * 
     * @param args
     *            argumentos para inicializacion
     */
	public static void main(String[] args) {
		SpringApplication.run(ComunesServiceApplication.class, args);
	}

	/**
     * Bean para mostrar el tablero de hystrix
     * 
     * @return ServletRegistrationBean
     */
    @SuppressWarnings({ "rawtypes", "unchecked" })
	@Bean
    public ServletRegistrationBean hystrixStream() {
        return new ServletRegistrationBean(new HystrixMetricsStreamServlet(), "/hystrix.stream");
    }
}

