package son.configuration;

import java.util.*;

import com.google.common.collect.Lists;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.google.common.base.Predicates;

import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.ParameterBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.schema.ModelRef;
import springfox.documentation.service.*;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spi.service.contexts.SecurityContext;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger.web.SecurityConfiguration;
import springfox.documentation.swagger.web.SecurityConfigurationBuilder;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

//@Configuration
//@EnableSwagger2
public class SwaggerConfig {

//    @Bean
//    public Docket api() {
//        return new Docket(DocumentationType.SWAGGER_2)
//                .apiInfo(new ApiInfoBuilder()
//                        .title("JSON Web Token Authentication API")
//                        .description("This is a sample JWT authentication service. ")
//                        .version("1.0.0")
//                        .license("MIT License").licenseUrl("http://opensource.org/licenses/MIT")
//                        .contact(new Contact(null, null, "mauriurraco@gmail.com"))
//                        .build())
////                .globalOperationParameters(Collections.singletonList(
////                        new ParameterBuilder()
////                                .name("Authorization Header")
////                                .modelRef(new ModelRef("string"))
////                                .parameterType("header")
//////                                .required(true)
////                                .hidden(true)
////                                .defaultValue("Bearer ")
////                                .build()
////                ))
//                .select()
////                .apis(RequestHandlerSelectors.any())
//                .apis(RequestHandlerSelectors.basePackage("son.controller"))
//                .paths(Predicates.not(PathSelectors.regex("/error")))
//                .build();
//
//    }
}
