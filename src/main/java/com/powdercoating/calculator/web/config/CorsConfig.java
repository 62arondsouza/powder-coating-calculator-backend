package com.powdercoating.calculator.web.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.CorsConfigurationSource;
import org.springframework.web.cors.UrlBasedCorsConfigurationSource;

import java.util.Arrays;

@Configuration
public class CorsConfig {
	
	@Autowired
	private Environment env;
	
	@Bean
	public CorsConfigurationSource corsConfigurationSource() {
		CorsConfiguration config = new CorsConfiguration();
		
		// READ FROM RENDER ENV VAR
		String frontendUrl = env.getProperty("frontend.url", "http://localhost:5173");
		
		// LOG FOR DEBUG
		System.out.println("=== CORS CONFIG LOADED ===");
		System.out.println("Allowed origins: [http://localhost:5173, " + frontendUrl + "]");
		
		config.setAllowedOrigins(Arrays.asList(
				"http://localhost:5173",
				frontendUrl
		));
		config.setAllowedMethods(Arrays.asList("GET", "POST", "PUT", "DELETE", "OPTIONS"));
		config.setAllowedHeaders(Arrays.asList("*"));
		config.setAllowCredentials(false);
		
		UrlBasedCorsConfigurationSource source = new UrlBasedCorsConfigurationSource();
		source.registerCorsConfiguration("/**", config);
		return source;
	}
}
