package com.wipro.automobile.ship;
import com.automobile.Vehicle;
import com.automobile.twowheeler.Hero;
import com.automobile.twowheeler.Honda;
public class TestVehicle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Hero heroBike = new Hero("RoyalEnfield", "Ap 25102", "Bhavani",180);
		Honda obj1 = new Honda("Hondacar","KA 4647", "Astha", 150);
	
		System.out.println("Hero Bike:");
        System.out.println("Model: " + heroBike.getModelName());
        System.out.println("Reg No: " + heroBike.getRegistrationNumber());
        System.out.println("Owner: " + heroBike.getOwnerName());
        System.out.println("Speed: " + heroBike.getSpeed());
        heroBike.radio();
        System.out.println();
        System.out.println("Honda Car:");
        System.out.println("Model: " + obj1.getModelName());
        System.out.println("Reg No: " + obj1.getRegistrationNumber());
        System.out.println("Owner: " + obj1.getOwnerName());
        System.out.println("Speed: " + obj1.getSpeed());
        obj1.cdplayer();
		
		
		
		

	}

}
