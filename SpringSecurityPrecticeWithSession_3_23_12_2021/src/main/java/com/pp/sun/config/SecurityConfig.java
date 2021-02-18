package com.pp.sun.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.web.util.matcher.AntPathRequestMatcher;

@EnableWebSecurity
@Configurable
public class SecurityConfig extends WebSecurityConfigurerAdapter {

	@Autowired
	private BCryptPasswordEncoder PasswordEncoder;

	@Autowired
	private UserDetailsService userDetailsService;

	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
		auth.userDetailsService(userDetailsService).passwordEncoder(PasswordEncoder);

	}

	@Override
	protected void configure(HttpSecurity http) throws Exception {
		http.authorizeRequests().antMatchers("/registration", "/save", "/index", "/login", "/csrflogin").permitAll()// permit
																													// all
				// request with
				// out login
				.antMatchers("/admin").hasAuthority("ADMIN")// oly form admin after login
				.antMatchers("/emp").hasAuthority("EMPLOYEE")// only for emp after login
				.anyRequest().authenticated()// povide all after login with out roles athentication

				.and().formLogin()// take defalt login page of spring boot application
				.loginPage("/login")// get type//to fetch the custome login page url
				.loginProcessingUrl("/mylogin")// post type// to process custom login form in spring security to use
												// this
												// methods
												// ...this show be match with custom login from url
				.defaultSuccessUrl("/common", true).failureUrl("/login?error")// if the lhing is fail then this usr will
																				// show in url teb

				.and()// take dafault page ogout
				.logout().logoutRequestMatcher(new AntPathRequestMatcher("/logout"))// if you are using custom login in
																					// this cate you should give url to
																					// logout url to sprion application
																					// to logout sucessfully
				.logoutSuccessUrl("/login?logout")// thisnis form successfull logout url after logout in url teb
				.invalidateHttpSession(true) // to modifies invalided session after logout

				.and().exceptionHandling().accessDeniedPage("/denied")

		;
//		http.csrf().disable(); // to disble the csrf security in the spring sercurity that means it will cot
								// genrate the csrf token in formhtml page not security check

	}

}
