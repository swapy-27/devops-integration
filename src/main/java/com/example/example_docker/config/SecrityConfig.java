package com.example.example_docker.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.jaas.memory.InMemoryConfiguration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
public class SecrityConfig {

    //basic auth with In memory Authentication
    @Autowired
    public AuthEntryPoint authEntryPoint;
    @Bean
    public UserDetailsService users() {
        UserDetails user = User.builder()
                .username("user")
                .password(bCryptPasswordEncoder().encode("user"))
                .roles("USER")
                .build();

        return new InMemoryUserDetailsManager(user);
    }
    @Bean
    public SecurityFilterChain SecurityFilterChain(HttpSecurity http) throws Exception {

        return http.csrf(csrf->csrf.disable())
                .authorizeHttpRequests(auth-> auth.anyRequest().authenticated())
                .httpBasic(httpBasic -> httpBasic.authenticationEntryPoint(authEntryPoint)).build();

    }
    @Bean
    public BCryptPasswordEncoder bCryptPasswordEncoder(){
        return new BCryptPasswordEncoder();
    }



}
