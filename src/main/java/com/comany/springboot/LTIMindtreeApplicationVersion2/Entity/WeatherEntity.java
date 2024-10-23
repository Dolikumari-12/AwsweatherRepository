package com.comany.springboot.LTIMindtreeApplicationVersion2.Entity;

import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBTable;


	@DynamoDBTable(tableName = "WeatherData")
	public class WeatherEntity {
		 
		    private String id;
		   
		    private String Data;
		    
		    private String city;
			
		    public WeatherEntity(String id, String city, String Data) {
				super();
				this.id = id;
				this.city = city;
				this.Data = Data;
			}
			public String getCity() {
				return city;
			}
			public void setCity(String city) {
				this.city = city;
			}
			public WeatherEntity() {}
			public String getId() {
				return id;
			}
			public void setId(String id) {
				this.id = id;
			}
			public String getData() {
				return Data;
			}
			public void setData(String data) {
				Data = data;
			}
		    
		    
	}
