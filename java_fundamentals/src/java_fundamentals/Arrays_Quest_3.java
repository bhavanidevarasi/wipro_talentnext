package java_fundamentals;
import java.util.Arrays;
import java.util.Scanner;
public class Arrays_Quest_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int [] arr = {12, 34, 2, 4, 5};
		for(int i =0; i<arr.length; i++) {
		int array;
		array= arr[i];
		System.out.println(array);
		}
       System.out.println("Enter a number : ");
       int n = sc.nextInt();
       int index = -1; 

       for (int i = 0; i < arr.length; i++) {
           if (arr[i] == n) {
               index = i;
               break; 
           }
       }

       if (index != -1) {
           System.out.println("Number found at index: " + index);
       } else {
           System.out.println("-1");
       }
       
	}

}
