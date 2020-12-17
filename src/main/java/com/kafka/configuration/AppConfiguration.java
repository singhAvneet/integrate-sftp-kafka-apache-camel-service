package com.kafka.configuration;

import org.apache.camel.component.kafka.KafkaConfiguration;
import org.apache.camel.component.kafka.KafkaEndpoint;
import org.apache.kafka.common.serialization.StringSerializer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;
import org.springframework.schemaregistry.serializer.WrapperKafkaAvroSerializer;

import io.confluent.kafka.serializers.subject.TopicRecordNameStrategy;

import java.util.UUID;


@Configuration
class AppConfiguration {

	@Autowired
	private Environment env;

	@Bean
	public KafkaConfiguration kafkaConfiguration() {
		final SchemaRegistryKafkaConfiguration configuration = new SchemaRegistryKafkaConfiguration();
		configuration.setBrokers(  env.getProperty("kafka.host")+":"+ env.getProperty("kafka.port"));
		configuration.setSchemaRegistryURL("http://"+env.getProperty("SchemaRegistry.host")+":"+env.getProperty("SchemaRegistry.port"));
		configuration.setAutoRegisterSchemas(true);
		configuration.setTopic(env.getProperty("kafka.topic"));
		configuration.setAutoCommitEnable(false);
		configuration.setMaxPollIntervalMs(3000L);
		configuration.setAcks("all");
		configuration.setGroupId("group-id1");
		configuration.setValueSubjectNameStrategy(TopicRecordNameStrategy.class.getCanonicalName());
		configuration.setKeySerializerClass(WrapperKafkaAvroSerializer.class.getCanonicalName());
		configuration.setSerializerClass(WrapperKafkaAvroSerializer.class.getCanonicalName());
		configuration.setKey(String.valueOf(UUID.randomUUID()));

		return configuration;
	}

	@Bean
	public KafkaEndpoint kafkaEndpoint(final KafkaConfiguration configuration) {
		final KafkaEndpoint kafkaEndpoint = new KafkaEndpoint();
		kafkaEndpoint.setConfiguration(configuration);
		return kafkaEndpoint;
	}

}
