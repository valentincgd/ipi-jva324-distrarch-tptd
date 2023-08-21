package com.ipi.jva324.commande;

import com.ipi.jva324.commande.model.Commande;
import com.ipi.jva324.commande.service.CommandeProduitService;
import com.ipi.jva324.commande.service.CommandeProduitServiceLocalImpl;
import com.ipi.jva324.commande.service.CommandeProduitServiceRestHalImpl;
import com.ipi.jva324.stock.model.ProduitEnStock;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.web.servlet.WebMvcAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.data.rest.webmvc.config.RepositoryRestConfigurer;
import org.springframework.web.client.RestTemplate;

@Configuration
public class CommandeProduitLocalConfiguration {

	@Primary
	@Bean
	public CommandeProduitService commandeProduitServiceTest() {
		return new CommandeProduitServiceLocalImpl();
	}

}
