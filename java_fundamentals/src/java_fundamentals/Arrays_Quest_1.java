package java_fundamentals;

import java.util.Arrays;
import java.util.Scanner;

public class Arrays_Quest_1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the length of an array :");
		int n = sc.nextInt();
		int[] arr = new int[n];
		
		System.out.println("Enter the Array Elements :");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		
		System.out.println("Arary elements are :");
		for(int i =0; i<arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
		System.out.println("The sum of the Array are :");
        int sum =0;
        for(int i =0; i<arr.length; i++) {
        	sum +=arr[i];
        }
        System.out.println(sum);
      
        double avrg = sum / arr.length;
        System.out.println("The average of the array is :" + avrg);
        
	}

}

