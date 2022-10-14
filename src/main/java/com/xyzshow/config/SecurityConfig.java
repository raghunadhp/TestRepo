package com.xyzshow.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
public class SecurityConfig {
	
	@Bean
	SecurityFilterChain securityFilterChain(HttpSecurity httpSecurity) throws Exception{
		return httpSecurity
				.csrf(csrf -> csrf.ignoringAntMatchers("/h2-console/**"))
				.authorizeRequests(auth -> 
						auth.antMatchers("/api/browse/**").permitAll()
						.antMatchers("/api/tbook/**").permitAll()
						.antMatchers("/api/cbook/**").permitAll()
						.anyRequest().authenticated()
						).headers(headers -> headers.frameOptions().sameOrigin())
				.httpBasic(Customizer.withDefaults())
				.build();
	}

}
