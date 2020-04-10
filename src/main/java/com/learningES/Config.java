package com.learningES;

import java.net.InetAddress;
import java.net.UnknownHostException;

import org.elasticsearch.client.Client;
import org.elasticsearch.client.transport.TransportClient;
import org.elasticsearch.common.settings.Settings;
import org.elasticsearch.common.transport.TransportAddress;
import org.elasticsearch.transport.client.PreBuiltTransportClient;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.elasticsearch.core.ElasticsearchOperations;
import org.springframework.data.elasticsearch.core.ElasticsearchTemplate;
import org.springframework.data.elasticsearch.repository.config.EnableElasticsearchRepositories;

@Configuration
@EnableElasticsearchRepositories(basePackages = "com.learningES.repository")
@ComponentScan(basePackages = { "com.learningES.model.service" })
public class Config {

	@Bean
	public Client client() throws UnknownHostException {

		TransportClient client = new PreBuiltTransportClient(Settings.EMPTY);
		client.addTransportAddresses(new TransportAddress(InetAddress.getByName("127.0.0.1"), 9300));
		return client;

	}
	
	@Bean
	public ElasticsearchOperations elasticsearchTemplate() throws UnknownHostException {
		return new ElasticsearchTemplate(client());		
	}
}
