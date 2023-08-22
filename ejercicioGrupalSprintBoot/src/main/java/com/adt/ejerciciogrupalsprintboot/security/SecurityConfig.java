package com.adt.ejerciciogrupalsprintboot.security;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.web.servlet.config.annotation.CorsRegistry;

import java.util.logging.Level;
import java.util.logging.Logger;


@Configuration
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {
    private final static Logger LOG_MONITOREO = Logger.getLogger("com.adt.ejerciciogrupalsprintboot.controllers");
    @Override
    protected void configure(HttpSecurity http) throws Exception {
        LOG_MONITOREO.log(Level.INFO, "Que pasa en el login");
        http.csrf().disable();
        http.authorizeHttpRequests().anyRequest().permitAll();
        http.authorizeRequests()
                .dispatcherTypeMatchers(HttpMethod.valueOf("/**")).authenticated()
                //.dispatcherTypeMatchers(HttpMethod.valueOf("/")).permitAll()
                .anyRequest()
                .permitAll()

                .and().formLogin()
                .and()
                .logout(logout -> logout
                        .logoutUrl("/logout")
                        .logoutSuccessUrl("/home")
                        //.logoutSuccessHandler()
                        .invalidateHttpSession(true)
                        //.addLogoutHandler()
                        .deleteCookies()
                );
        //http.authorizeRequests().dispatcherTypeMatchers(HttpMethod.valueOf("/index")).permitAll();
    }

    @Override
    public void addCorsMappings(CorsRegistry registry) {

    }

    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        auth.inMemoryAuthentication()
                .withUser("user1").password("123").roles("ADMIN")
                .and()
                .withUser("user2").password("123").roles("CLIENTE")
                .and()
                .withUser("user3").password("123").roles("PROFESIONAL");
    }

    @Override
    public void configure(WebSecurity web) throws Exception {

    }
    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
        http
                .csrf().disable()
                .authorizeHttpRequests()
                .anyRequest().permitAll();
        return http.build();
    }
}
