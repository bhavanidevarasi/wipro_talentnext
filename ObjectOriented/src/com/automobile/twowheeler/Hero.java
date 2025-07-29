package com.automobile.twowheeler;
import com.automobile.Vehicle;
 public class Hero extends Vehicle {
	 public String ModelName;
	 public String RegistrationNumber;
	 public String OwnerName;
	 public int Speed;
	public Hero(String mn, String rn, String on,int spe){
		 ModelName = mn;
		 RegistrationNumber = rn;
		 OwnerName = on;
		 Speed = spe;
		 
	 }

	@Override
	public String getModelName() {
		return ModelName;
	}

	@Override
	public String getRegistrationNumber() {
	   return RegistrationNumber;
	}

	@Override
	public String getOwnerName() {
	    return OwnerName;
	}
	public int getSpeed() {
		return Speed;
	}
	public void radio() {
		System.out.println("They play the radio");
	}

}
