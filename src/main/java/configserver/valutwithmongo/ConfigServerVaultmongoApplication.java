package configserver.valutwithmongo;

import configserver.valutwithmongo.configuration.EnableMongoConfigServer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableMongoConfigServer
public class ConfigServerVaultmongoApplication {

	public static void main(String[] args) {
		SpringApplication.run(ConfigServerVaultmongoApplication.class, args);
	}

}
