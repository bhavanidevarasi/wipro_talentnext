package com.automobile.fourwheeler;
import com.automobile.Vehicle;
public class Logan extends Vehicle{
     
	 public String ModelName;
	 public String RegistrationNumber;
	 public String OwnerName;
	
	public Logan(String mn, String rn, String on){
		 ModelName = mn;
		 RegistrationNumber = rn;
		 OwnerName = on;
		
		 
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
	public int Speed() {
		System.out.println("The speed of the vehicle is 120");
		return 120;
	}
	public String GPS() {
		return "near Locations";
	}

}
