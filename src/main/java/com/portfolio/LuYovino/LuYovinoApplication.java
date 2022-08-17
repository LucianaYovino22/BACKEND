package com.portfolio.LuYovino;

import java.util.Arrays;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.UrlBasedCorsConfigurationSource;
import org.springframework.web.filter.CorsFilter;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@SpringBootApplication
public class LuYovinoApplication {

    public static void main(String[] args) {
        SpringApplication.run(LuYovinoApplication.class, args);
    }

     @Bean
        public WebMvcConfigurer corsConfigurer() {
        return new WebMvcConfigurer() {
           @Override
           public void addCorsMappings(CorsRegistry registry) {
               registry.addMapping("/**")
               .allowedOrigins("*")
               .allowedMethods("*")
               .allowedHeaders("*");
           }
        };
    }
}
