package com.gps.tn.gps;

import org.eclipse.paho.client.mqttv3.MqttException;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class GpsApplication {

	public static void main(String[] args) throws MqttException {
		SpringApplication.run(GpsApplication.class, args);
		new Subscriber().main(null);
		
	}
}
