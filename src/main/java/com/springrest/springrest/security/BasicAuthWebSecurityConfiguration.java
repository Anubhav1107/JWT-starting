// package com.springrest.springrest.security;

// import org.springframework.context.annotation.Bean;
// import org.springframework.context.annotation.Configuration;
// import org.springframework.security.config.annotation.web.builders.HttpSecurity;
// import org.springframework.security.core.userdetails.User;
// import org.springframework.security.core.userdetails.UserDetails;
// import org.springframework.security.provisioning.InMemoryUserDetailsManager;
// import org.springframework.security.web.SecurityFilterChain;

// @Configuration
// public class BasicAuthWebSecurityConfiguration
// {
//   @Bean
//   public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
//     http
//          .csrf().disable()
//          .authorizeRequests().anyRequest().authenticated()
//          .and()
//          .httpBasic();

//     return http.build();
//   }

//   @Bean
//   public InMemoryUserDetailsManager userDetailsService() {
//     UserDetails admin = User
//         .withUsername("anubhav")
//         .password("{noop}qwerty1234")
//         .roles("ADMIN")//ADMIN
//         .build();
//     UserDetails user = User
//     .withUsername("amit")
//     .password("{noop}asdf1234")
//     .roles("USER")
//     .build();

//     return new InMemoryUserDetailsManager(admin, user);
//   }
// }