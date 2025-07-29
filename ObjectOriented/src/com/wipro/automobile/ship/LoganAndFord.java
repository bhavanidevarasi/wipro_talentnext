package com.wipro.automobile.ship;
import com.automobile.Vehicle;
import com.automobile.fourwheeler.Logan;
import com.automobile.fourwheeler.Ford;
public class LoganAndFord {

	public static void main(String[] args) {
		Logan log = new Logan("Lambo","Ap 2849","Bhavani");
		Ford car = new Ford("Ford28","KA 4688","Asthaa");
		System.out.println("Logan Car");
		System.out.println("ModelName" + log.ModelName);
		System.out.println("RegistrationNumber" + log.RegistrationNumber);
		System.out.println("OwnerName" + log.OwnerName);
		System.out.println(log.Speed());
		System.out.println(log.GPS());
		System.out.println();
		System.out.println("Ford Car");
		System.out.println("ModelName" + car.ModelName);
		System.out.println("RegistrationNumber" + car.RegistrationNumber);
		System.out.println("OwnerName" + car.OwnerName);
		System.out.println(car.speed());
		System.out.println(car.tempControl());
		

	}

}
