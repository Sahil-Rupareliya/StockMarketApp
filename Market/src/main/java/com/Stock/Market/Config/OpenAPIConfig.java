package com.example.StockWise.config;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.License;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class OpenAPIConfig {

    @Bean
    OpenAPI customOpenApi() {
        return new OpenAPI().info(
                new Info()
                        .title("Stock wise  API")
                        .version("v1")
                        .description("Streamline stock transactions, portfolios, and user management. Buy, sell, check portfolios, and access real-time stock data. " +
                                "**Created By Sahil Rupareliya**")
                        .termsOfService("https://springdoc.org/")
                        .license(
                                new License()
                                        .name("Source Code")
                                        .url("https://github.com/Sahil-Rupareliya/StcokMarketApp")
                        )
        );
    }

}
