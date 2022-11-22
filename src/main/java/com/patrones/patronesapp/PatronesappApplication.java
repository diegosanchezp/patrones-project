package com.patrones.patronesapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

// Security
import org.springframework.context.annotation.Configuration;
import org.springframework.boot.autoconfigure.security.SecurityProperties;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.core.annotation.Order;

@SpringBootApplication
public class PatronesappApplication {

	@Configuration
  	//@Order(SecurityProperties.ACCESS_OVERRIDE_ORDER)
  	protected static class SecurityConfiguration extends WebSecurityConfigurerAdapter {
		@Override
		protected void configure(HttpSecurity http) throws Exception {
		http
			.httpBasic()
		.and()
			.authorizeRequests()
			.antMatchers("/**", "/**").permitAll()
			.anyRequest().authenticated();
		}
  	}

	public static void main(String[] args) {
		SpringApplication.run(PatronesappApplication.class, args);
	}

}
