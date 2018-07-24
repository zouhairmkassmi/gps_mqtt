package com.gps.tn.entity;

import org.springframework.boot.autoconfigure.domain.EntityScan;

@EntityScan
public class Voiture {
  private Long id;
  private String longitude;
  private String altitude;
public Voiture(Long id, String longitude, String altitude) {
	super();
	this.id = id;
	this.longitude = longitude;
	this.altitude = altitude;
}
public Long getId() {
	return id;
}
public void setId(Long id) {
	this.id = id;
}
public String getLongitude() {
	return longitude;
}
public void setLongitude(String longitude) {
	this.longitude = longitude;
}
public String getAltitude() {
	return altitude;
}
public void setAltitude(String altitude) {
	this.altitude = altitude;
}
}
