package son.configuration;

import com.google.common.base.Predicate;
import com.google.common.base.Predicates;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.ParameterBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.schema.ModelRef;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import java.util.Collections;

import static springfox.documentation.builders.PathSelectors.regex;

@Configuration
@EnableSwagger2
public class SwaggerConfig {

    private ApiInfo apiInfo() {
        return new ApiInfoBuilder()
                .title("Learng English API Documents")
                .description("Documents with Swagger 2")
                .version("1.0")
                .build();
    }

    @Bean
    public Docket restApi() {
        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(apiInfo())
                // Apply for all request on swagger
                .globalOperationParameters(Collections.singletonList(
                        new ParameterBuilder()
                                .name("Authorization")
                                .modelRef(new ModelRef("string"))
                                .parameterType("header")
//                                .required(true)
                                .hidden(true)
                                .defaultValue("Bearer ")
                                .build()
                ))
                .select()
                // It is not always desirable to expose the documentation for your entire API.
                // You can restrict Swagger’s response by passing parameters to the apis()
                // and paths() methods of the Docket class.
                // In the example below, we will instruct Swagger to include only controllers
                // from a particular package, with specific paths, using the ant() predicate.
                // .apis(RequestHandlerSelectors.basePackage("com.baeldung.web.controller"))
                // .paths(PathSelectors.ant("/foos/*"))
                .apis(RequestHandlerSelectors.basePackage("son.controller"))
                .paths(PathSelectors.any())
                .build();
    }
}
