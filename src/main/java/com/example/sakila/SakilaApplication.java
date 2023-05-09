package com.example.sakila;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.service.VendorExtension;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;

import java.util.Collections;

@SpringBootApplication
public class SakilaApplication {

    public static void main(String[] args) {
        SpringApplication.run(SakilaApplication.class, args);
    }

    @Bean
    public Docket swaggerConfiguration() {
        return new Docket(DocumentationType.SWAGGER_2).select().paths(PathSelectors.ant("/actor/*"))
                .apis(RequestHandlerSelectors.basePackage("com.example.sakila")).build().apiInfo(apiCustomData());
    }

    private ApiInfo apiCustomData() {
        return new ApiInfo(
                "Film Ordering Project", "This is a Film Ordering Project", "1.0", "Film Ordering Project T&C"
                , new Contact("Basement", "http://localhost:8080/swagger-ui/", "test@test.com")
                , "Lic23433", "http://localhost:8080", Collections.emptyList());
    }

}
