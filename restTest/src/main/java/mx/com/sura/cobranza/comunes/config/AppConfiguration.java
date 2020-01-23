package mx.com.sura.cobranza.comunes.config;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.UrlBasedCorsConfigurationSource;
import org.springframework.web.filter.CorsFilter;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;


/**
 * 
 * @Proyecto: ms-fc-comunes-service
 *
 * Clase de la configuracion del microservicio para catálogos generales
 * 
 * @version 1.0.0
 */
@Configuration
@ConfigurationProperties(prefix = "ms-fc-comunes-service")
public class AppConfiguration implements WebMvcConfigurer {

	/**
	 * The LOGGER
	 */
	private static final Logger LOGGER = LoggerFactory.getLogger(AppConfiguration.class);



    /**
     * bean de filtro cors
     * 
     * @return CorsFilter
     */
    @Bean
    public CorsFilter corsFilter() {
        UrlBasedCorsConfigurationSource source = new UrlBasedCorsConfigurationSource();
        CorsConfiguration config = new CorsConfiguration();
        config.setAllowCredentials(true);
        config.addAllowedOrigin("*");
        config.addAllowedHeader("*");
        config.addAllowedMethod("OPTIONS");
        config.addAllowedMethod("GET");
        config.addAllowedMethod("POST");
        config.addAllowedMethod("PUT");
        config.addAllowedMethod("DELETE");
        source.registerCorsConfiguration("/**", config);
        return new CorsFilter(source);
    }
}
