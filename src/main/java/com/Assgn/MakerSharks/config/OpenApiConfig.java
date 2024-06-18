package com.Assgn.MakerSharks.config;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.info.License;

@OpenAPIDefinition(
		info = @Info(
				title = "User API",
				description = "MakerSharks Assignment",
				summary = "This API will register and fetch user details",
				contact = @Contact(
						name = "Sanidhya",
						email = "sanidhya2may@gmail.com"
						),
				license = @License(
						name = "License no."
						),
				version = "v1"
				)

		)

public class OpenApiConfig {

}
