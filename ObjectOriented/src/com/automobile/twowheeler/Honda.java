package com.automobile.twowheeler;
import com.automobile.Vehicle;
public class Honda extends Vehicle{
      
	 public String ModelName;
	 public String RegistrationNumber;
	 public String OwnerName;
	 public int Speed;
	public  Honda(String mn, String rn, String on,int spe){
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
      public void cdplayer() {
    	  System.out.println("this can control the automible cd player");
      }
}
