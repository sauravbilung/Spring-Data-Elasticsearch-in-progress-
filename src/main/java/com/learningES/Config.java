package com.learningES;

import org.elasticsearch.client.Client;
import org.elasticsearch.client.transport.TransportClient;
import org.elasticsearch.common.settings.Settings;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.elasticsearch.repository.config.EnableElasticsearchRepositories;

@Configuration
@EnableElasticsearchRepositories(basePackages = "com.learningES.repository")
@ComponentScan(basePackages = { "com.learningES.model.service" })
public class Config {

	// Elasticsearch installation directory
	@Value("${elasticsearch.home:D:\\ForWindows\\ELK Stack\\elasticsearch-7.6.2}")
	private String elasticsearchHome;

	// Elasticsearch cluster name. By default it is "elasticsearch"
	@Value("${elasticsearch.cluster.name:elasticsearch}")
	private String clusterName;

	@Bean
	public Client client() {
		Settings elasticsearch = Settings.builder().put("client.transport.sniff", true)
				.put("path.home", elasticsearchHome).put("cluster.name", clusterName).build();
		
		TransportClient client;
		return null;
	}
}
