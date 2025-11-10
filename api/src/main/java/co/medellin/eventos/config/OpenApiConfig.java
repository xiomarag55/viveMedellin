package co.medellin.eventos.config;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;
import org.springframework.context.annotation.Configuration;

@Configuration
@OpenAPIDefinition(
    info = @Info(
        title = "Vive Medellín API",
        description = "API para la gestión de eventos en Medellín",
        version = "1.0"
    )
)
public class OpenApiConfig {
}