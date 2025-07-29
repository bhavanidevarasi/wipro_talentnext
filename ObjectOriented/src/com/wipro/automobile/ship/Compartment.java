package com.wipro.automobile.ship;

import java.util.Scanner;
class Volume{
	double height;
	 double width;
    double breadth;
    public double volume() {
    	return height*width*breadth;
    }
}
public class Compartment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		
		Volume vol = new Volume();
		System.out.println("Enter the breadth : ");
		vol.breadth=sc.nextDouble();
		System.out.println("Enter the height : ");
		vol.height=sc.nextDouble();
		System.out.println("Enter the width : ");
		vol.width=sc.nextDouble();
	    System.out.println(vol.volume());
	}

}
