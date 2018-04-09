package com.amos.lukkien.airlineapp.config;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
public class SwaggerConfig {
    public static final Contact DEFAULT_CONTACT = new Contact("Amos Coats", "", "coats01@hotmail.com");

    public static final ApiInfo DEFAULT_API_INFO = new ApiInfo("Lukkien Airline Webservices", "Api Documentation", "1.0", "urn:tos", DEFAULT_CONTACT, "Apache 2.0", "http://www.apache.org/licenses/LINCENSE-2.0");

    @Bean
    public Docket api() {
        return new Docket(DocumentationType.SWAGGER_2).apiInfo(DEFAULT_API_INFO);
    }
}
