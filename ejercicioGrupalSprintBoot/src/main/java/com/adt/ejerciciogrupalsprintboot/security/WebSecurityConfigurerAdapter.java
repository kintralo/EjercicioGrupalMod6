package com.adt.ejerciciogrupalsprintboot.security;

import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.web.servlet.config.annotation.CorsRegistry;

public abstract class WebSecurityConfigurerAdapter {
    protected abstract void configure(HttpSecurity http) throws Exception;

    public abstract void addCorsMappings(CorsRegistry registry);

    protected abstract void configure(AuthenticationManagerBuilder auth) throws Exception;

    public abstract void configure(WebSecurity web) throws Exception;
}
