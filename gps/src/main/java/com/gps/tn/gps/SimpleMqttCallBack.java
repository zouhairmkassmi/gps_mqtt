package com.gps.tn.gps;

import org.eclipse.paho.client.mqttv3.IMqttDeliveryToken;
import org.eclipse.paho.client.mqttv3.MqttCallback;
import org.eclipse.paho.client.mqttv3.MqttMessage;
import org.springframework.beans.factory.annotation.Autowired;

import com.gps.tn.entity.Voiture;
import com.gps.tn.repository.VoitureRepository;

public class SimpleMqttCallBack implements MqttCallback {
   private Voiture voiture;
   private String message;
   @Autowired
   private VoitureRepository repository;
  public void connectionLost(Throwable throwable) {
    System.out.println("Connection to MQTT broker lost!");
  }

  public void messageArrived(String s, MqttMessage mqttMessage) throws Exception {
    System.out.println("Message received:\t"+ new String(mqttMessage.getPayload()) );
    //this.repository.save(this.devide(new String(mqttMessage.getPayload())));
  }

  public void deliveryComplete(IMqttDeliveryToken iMqttDeliveryToken) {
  }
  private Voiture devide(String msg) {
	  String[] words= msg.split("/");
	  this.voiture.setAltitude(words[0]);
	  this.voiture.setLongitude(words[1]);
	  return this.voiture;
  }
}
