package br.edu.atitus.poo.atitus.configs;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;

@Configuration
public class ConfigSwagger {

	@Bean
	public OpenAPI getOpenAPI() {
		return new OpenAPI()
				.info(new Info()
						.title("API AtituSound")
						.description("Documentacao do backend")
						.version("Versao 1.0.0")
						.contact(new Contact()
								.name("Fabricio, Bruno")
								.email("teste@teste.com")));
	}
}
