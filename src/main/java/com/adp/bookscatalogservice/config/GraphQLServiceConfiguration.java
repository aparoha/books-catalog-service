package com.adp.bookscatalogservice.config;

import com.adp.bookscatalogservice.service.BooksCatalogService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.graphql.execution.RuntimeWiringConfigurer;

@Configuration
public class GraphQLServiceConfiguration {

    @Bean
    public RuntimeWiringConfigurer runtimeWiringConfigurer(BooksCatalogService bookCatalogService) {
        return builder -> {
            builder.type(
                    "Query",
                    wiring ->
                            wiring
                                    .dataFetcher("fetchBooks", environment -> bookCatalogService.fetchBooks()));
            builder.type(
                    "Book",
                    wiring ->
                            wiring.dataFetcher("ratings", env -> bookCatalogService.fetchRatings(env.getSource())));
        };
    }
}
