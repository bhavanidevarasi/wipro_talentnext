package exception_handling;
import java.util.Scanner;

import java.util.InputMismatchException;
public class ArrayElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of elements in the array : ");
		int n = sc.nextInt();
		int array[] = new int[n];
		try {
		
			System.out.println("Enter the elements in the array : ");
			for(int i =0; i<n; i++) {
				try {
				array[i]=sc.nextInt();
				}catch(NumberFormatException e) {
					System.out.println("java.lang.NumberFormatException");
					return;
				}
			}
		}catch(NumberFormatException e) {
			System.out.println("java.lang.NumberFormatException");
		}catch(InputMismatchException e) {
            System.out.println("java.lang.NumberFormatException");
        }
		try {
			System.out.println("Enter the index of the array element you want to access : ");
			int index = sc.nextInt();
			System.out.println("The array element at index " + index+ " is " + array[index]);
			System.out.println("The array element successfully accessed");
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("java.lang.ArrayIndexOutOfBoundsException");
		}
	}

}
