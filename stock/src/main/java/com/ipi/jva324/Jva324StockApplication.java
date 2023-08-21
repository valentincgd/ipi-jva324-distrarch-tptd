package com.ipi.jva324;

import com.ipi.jva324.stock.model.ProduitEnStock;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.web.servlet.WebMvcAutoConfiguration;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.data.rest.webmvc.config.RepositoryRestConfigurer;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
@EnableDiscoveryClient
public class Jva324StockApplication {

	public static void main(String[] args) {
		SpringApplication.run(Jva324StockApplication.class, args);
	}


	@Bean
	@LoadBalanced
	public RestTemplate restTemplateStock() {
		return new RestTemplate();
	}

	@Bean
	public RepositoryRestConfigurer repositoryRestConfigurerStock() {
		return RepositoryRestConfigurer.withConfig(config -> {
			config.exposeIdsFor(ProduitEnStock.class);
		});
	}

	/**
	 * else can't resolve HTML views because no defaultViewResolver
	 * because no WebMvcAutoConfiguration even with @EnableWebMvc
	 */
	///@Configuration
	public class TriggeringWebMvcAutoConfiguration extends WebMvcAutoConfiguration {

		public TriggeringWebMvcAutoConfiguration() {

		}

	}

}
