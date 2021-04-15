package com.pp.sun.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@EnableWebSecurity
@Configuration
public class SecurityConfigurationClass extends WebSecurityConfigurerAdapter {
	
//	has-a relationship
	@Autowired
	private BCryptPasswordEncoder  pwdEncoder;
	
//	for athetication
	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
//		in mamory athentication means credentials are store in RAM 
//		no password encoder user .password("{noop}1")
		 auth.inMemoryAuthentication().withUser("A").password("{noop}a").authorities("ADMIN");
		 auth.inMemoryAuthentication().withUser("E").password("{noop}e").authorities("EMPLOYEE");
		 auth.inMemoryAuthentication().withUser("S").password("{noop}s").authorities("STUDENT");

		
		
		
		
		
		
		
		
//		data base related authentication
//		 auth.jdbcAuthentication()
		
//		orm reletd or jpa conrecps authentication
//		 auth.userDetailsService(userDetailsService)
		
	}
//	for authorization
	@Override
		protected void configure(HttpSecurity http) throws Exception {
		http.authorizeRequests()
		
		//set athenorization code 
		.antMatchers("/home").permitAll()
		.antMatchers("/welcome").authenticated()
		.antMatchers("**/admin").authenticated()
		.antMatchers("/emp").hasAuthority("EMPLOYEE")
		.antMatchers("/std").hasAuthority("STUDENT")
		.antMatchers("common").hasAnyAuthority("ADMIN","EMPLOYEE");
		
		
		
		}

}
