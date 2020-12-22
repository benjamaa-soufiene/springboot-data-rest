package fr.orsys.configuration;

import java.util.Arrays;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;

@Configuration
public class ConfigSwagger {
	public static final Contact DEFAULT_CONTACT = new Contact("Orsys.fr", "http://www.orsys.fr",
			"info@orsys.fr");
	public static final ApiInfo DEFAULT_API_INFO = new ApiInfo("Orsys.fr", "Spring Boot Data Rest for Orsys.fr", "1.0",
			"urn:tos", DEFAULT_CONTACT, "Apache 2.0", "http://www.apache.org/licenses/LICENSE-2.0", Arrays.asList());
	@Bean
	public Docket api() {
		return new Docket(DocumentationType.SWAGGER_2).apiInfo(DEFAULT_API_INFO)
				.select().apis(RequestHandlerSelectors.any())
				.apis(RequestHandlerSelectors.any())
				.paths(PathSelectors.regex("/error.*").negate())
				.paths(PathSelectors.regex("/profile.*").negate())
				.build();
	}
}
