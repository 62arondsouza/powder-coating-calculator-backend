package com.powdercoating.calculator.web.config;

import java.util.Arrays;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.web.cors.CorsConfiguration;

@Configuration
public class SecurityConfig {
	
	@Bean
	public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
		http
				.cors(cors -> cors.configurationSource(
						request -> {
							CorsConfiguration config = new CorsConfiguration();
							config.setAllowedOrigins(Arrays.asList(
									"http://localhost:5173",
									System.getenv("frontend.url") != null ?
											System.getenv("frontend.url") : "https://powder-coating-calculator.netlify.app"
							));
							config.setAllowedMethods(Arrays.asList("GET", "POST", "PUT", "DELETE", "OPTIONS"));
							config.setAllowedHeaders(Arrays.asList("*"));
							config.setAllowCredentials(false);
							return config;
						}
				))
				.csrf(csrf -> csrf.disable())
				.authorizeHttpRequests(auth -> auth.anyRequest().permitAll());
		return http.build();
	}
}
