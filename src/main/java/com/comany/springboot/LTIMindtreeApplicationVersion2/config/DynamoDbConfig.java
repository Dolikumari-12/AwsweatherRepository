package com.comany.springboot.LTIMindtreeApplicationVersion2.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.amazonaws.auth.InstanceProfileCredentialsProvider;
import com.amazonaws.client.builder.AwsClientBuilder;
import com.amazonaws.services.dynamodbv2.AmazonDynamoDB;
import com.amazonaws.services.dynamodbv2.AmazonDynamoDBClientBuilder;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBMapper;

@Configuration
public class DynamoDbConfig {
	
	 @Value("${aws.dynamodb.endpoint}")
	    private String awsDynamoDBEndPoint;

	    @Bean
	    public AmazonDynamoDB amazonDynamoDB() {
	        AmazonDynamoDBClientBuilder builder = AmazonDynamoDBClientBuilder.standard()
	                .withCredentials(new InstanceProfileCredentialsProvider(false));

	        if (!awsDynamoDBEndPoint.isEmpty()) {
	            builder.withEndpointConfiguration(new AwsClientBuilder.EndpointConfiguration(awsDynamoDBEndPoint, "us-east-1"));
	        }

	        return builder.build();
	    }

	    @Bean
	    public DynamoDBMapper mapper(){
	        return new DynamoDBMapper(amazonDynamoDB());
	    }
	
	

	
	
}
