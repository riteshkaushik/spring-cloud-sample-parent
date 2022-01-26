package com.rkk.spring.cloud.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@EnableWebSecurity
@Configuration
public class AppSecurityConfig extends WebSecurityConfigurerAdapter {


    public void configure(HttpSecurity http) throws Exception {
        http.csrf().ignoringAntMatchers("/encrypt/**").ignoringAntMatchers("/decrypt/**").ignoringAntMatchers("*/refresh/**");
        super.configure(http);
    }

}
