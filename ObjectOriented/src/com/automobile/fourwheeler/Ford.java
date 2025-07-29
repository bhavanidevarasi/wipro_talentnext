package com.automobile.fourwheeler;
import com.automobile.Vehicle;
public class Ford extends Vehicle {
	 public String ModelName;
	 public String RegistrationNumber;
	 public String OwnerName;
	 //public int Speed;
	public Ford(String mn, String rn, String on){
		 ModelName = mn;
		 RegistrationNumber = rn;
		 OwnerName = on;
		// Speed = spe;	 
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
	public int speed() {
		System.out.println("The speed of the ford ");
		return 135;
	}
	public int tempControl() {
		return 34;
	}
	
}
