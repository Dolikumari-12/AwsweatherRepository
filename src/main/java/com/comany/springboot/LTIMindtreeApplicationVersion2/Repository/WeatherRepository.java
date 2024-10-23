package com.comany.springboot.LTIMindtreeApplicationVersion2.Repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBMapper;
import com.comany.springboot.LTIMindtreeApplicationVersion2.Entity.WeatherEntity;
import com.comany.springboot.LTIMindtreeApplicationVersion2.dto.WeatherDataDto;

@Repository
public class WeatherRepository {

	@Autowired
	DynamoDBMapper dynamoDBMapper;
	
	 public void saveToDynamoDB(WeatherDataDto weatherData) {
	        dynamoDBMapper.save(weatherData);
	    }

}