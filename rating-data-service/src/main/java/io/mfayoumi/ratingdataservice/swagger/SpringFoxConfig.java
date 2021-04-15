package io.mfayoumi.ratingdataservice.swagger;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;

import java.util.Collections;

@Configuration
public class SpringFoxConfig {
  @Bean
  public Docket swaggerConfiguration() {
    // Return a prepared Docket instance.
    return new Docket(DocumentationType.SWAGGER_2)
            .select()
            .paths(PathSelectors.any())
            .apis(RequestHandlerSelectors.any())
            .build()
            .apiInfo(apiMetadata());
  }

  private ApiInfo apiMetadata() {
    return new ApiInfo(
            "Rating Data API",
            "Sample API for spring-boot tutorial",
            "1.0",
            "Free to use",
            new springfox.documentation.service.Contact("Mohammad Fayoumi", "https://mfayoumi.com", "mfayoumi@gmail.com"),
            "API License",
            "https://mfayoumi.com/license",
            Collections.emptyList()
    );
  }
}
