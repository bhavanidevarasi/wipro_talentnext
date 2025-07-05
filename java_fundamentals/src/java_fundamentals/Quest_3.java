package java_fundamentals;

import java.util.Scanner;

public class Quest_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try(Scanner sc = new Scanner(System.in)){
			int num1 = sc.nextInt();
			int num2 = sc.nextInt();
			//int num = num1 + num2;
			System.out.println("The sum of " + num1 + " and " + num2 + " is " + (num1+num2));
		}

	}

}
