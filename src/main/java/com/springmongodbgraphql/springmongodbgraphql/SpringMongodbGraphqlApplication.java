package com.springmongodbgraphql.springmongodbgraphql;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@SpringBootApplication
@EnableMongoRepositories("com.springmongodbgraphql.repository")
@ComponentScan("com.springmongodbgraphql.*")
public class SpringMongodbGraphqlApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringMongodbGraphqlApplication.class, args);
	}

}
