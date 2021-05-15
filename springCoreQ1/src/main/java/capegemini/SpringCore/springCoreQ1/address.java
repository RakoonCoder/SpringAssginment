package capegemini.SpringCore.springCoreQ1;

import org.springframework.stereotype.Component;

@Component
public class address {
  String street;
  String state;
  long zip;
  String country;
public String getStreet() {
	return street;
}
public void setStreet(String street) {
	this.street = street;
}
public String getState() {
	return state;
}
public void setState(String state) {
	this.state = state;
}
public long getZip() {
	return zip;
}
public void setZip(long zip) {
	this.zip = zip;
}
public String getCountry() {
	return country;
}
public void setCountry(String country) {
	this.country = country;
}
@Override
public String toString() {
	return "address [street=" + street + ", state=" + state + ", zip=" + zip + ", country=" + country + "]";
}
  
  
}
