package com.abilify.springbootrestapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import java.util.Collections;

@SpringBootApplication
@EnableSwagger2

public class SpringBootRestApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootRestApiApplication.class, args);
	}

	@Bean
	public Docket swaggerConfiguration(){
		// Return a prepared Docket instance
		return new Docket(DocumentationType.SWAGGER_2)
				.select()
				//.paths(PathSelectors.ant("/*"))
				.apis(RequestHandlerSelectors.basePackage("com.abilify.springbootrestapi.application"))
				.build()
				.apiInfo(apiDetails());
	}

	private ApiInfo apiDetails(){
		return new ApiInfo(
				"ABILIFY API",
				"TECH SUPPORT INDUSTRY ABILIFY MARKETPLACE API ",
				"1.0",
				"Free to use",
				new springfox.documentation.service.Contact("Abilify", "https://abilify.com","contact@abilify.com"),
				"",
				"",
				Collections.emptyList());
		}
}