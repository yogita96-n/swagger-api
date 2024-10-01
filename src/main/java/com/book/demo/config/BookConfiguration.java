package com.book.demo.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.web.access.intercept.AuthorizationFilter;

@Configuration
public class BookConfiguration {
//    @Autowired
//    private JWTFilter jwtFilter;
    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
        //http.addFilterBefore(jwtFilter, AuthorizationFilter.class);
        http.authorizeHttpRequests(auth->auth.anyRequest().permitAll());
        http.csrf(cs->cs.disable());
        return http.build();

    }
}
