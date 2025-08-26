package com.example.ProyectoSantander.configuration;


import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SwaggerConfig {

    @Bean
    public OpenAPI customOpenAPI() {
        return new OpenAPI()
                .info(new Info()
                        .title("API CRUD Clientes - Proyecto Santander")
                        .version("1.0")
                        .description("CRUD de clientes usando Spring Boot, JPA y H2 con Swagger UI para test tecnico (empresa HRT p/santantder)"));
    }
}
