package java_fundamentals;
import java.util.Arrays;
import java.util.Scanner;
public class Arrays_Quest_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the array length :");
		int n = sc.nextInt();
		int [] arr = new int[n];
		System.out.println("Enter the array values :");
		for(int i =0; i<arr.length; i++) {
			arr[i]= sc.nextInt();
		}
		System.out.println("Arary elements are :");
		for(int i =0; i<arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
		Arrays.sort(arr);
		int min= arr[0];
		int max = arr[arr.length-1];
		System.out.println("The min ele is :" + min);
		System.out.println("The max ele is :" + max);

	}

}
