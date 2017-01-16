package th.co.tac.api.otp.config;

import javax.annotation.PostConstruct;

import org.glassfish.jersey.server.ResourceConfig;
import org.glassfish.jersey.server.wadl.internal.WadlResource;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import io.swagger.jaxrs.config.BeanConfig;
import io.swagger.jaxrs.listing.ApiListingResource;
import io.swagger.jaxrs.listing.SwaggerSerializers;
import th.co.tac.api.otp.controller.ApiController;

@Component
public class JerseyConfig extends ResourceConfig {

	@Value("${spring.jersey.application-path:/api}")
	private String apiPath;

	public JerseyConfig() {
		this.registerEndpoints();
	}

	@PostConstruct
	public void init() {
		
		this.configureSwagger();
	}

	private void registerEndpoints() {
		this.register(ApiController.class);
		this.register(WadlResource.class);
	}
	
	private void configureSwagger() {
		this.register(ApiListingResource.class);
		this.register(SwaggerSerializers.class);

		BeanConfig config = new BeanConfig();
		config.setVersion("1.0.0-SNAPSHOT");
		config.setSchemes(new String[] { "http", "https" });
		config.setBasePath(this.apiPath);
		config.setResourcePackage("th.co.tac.api.otp.controller");
		config.setPrettyPrint(true);
		config.setScan(true);
	}

}
