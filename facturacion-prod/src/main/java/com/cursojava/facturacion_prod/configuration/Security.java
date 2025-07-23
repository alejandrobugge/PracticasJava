package com.cursojava.facturacion_prod.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class Security {
    @Bean
    public SecurityFilterChain filterChain(HttpSecurity httpSecurity) throws Exception {
        httpSecurity.csrf(
                crsf->crsf.disable()
        ).authorizeHttpRequests(
                auth->{
                    //auth.anyRequest().authenticated(); hace que todo sea con clave
                    //hace que productos sea sin clave y el resto con clave
                    auth.requestMatchers("/api/v1/productos/**").permitAll()
                            .anyRequest().authenticated();

                }
        ).httpBasic(Customizer.withDefaults());
        return  httpSecurity.build();
    }

}
