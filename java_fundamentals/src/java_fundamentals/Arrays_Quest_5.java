package java_fundamentals;
import java.util.Arrays;

public class Arrays_Quest_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int [] arr = {12, 34, 89, 46, 1, 56, 90, 340};
       Arrays.sort(arr);
       int min_1 = arr[0];
       int min_2 = arr[1];
       int max_1 = arr[arr.length-1];
       int max_2 = arr[arr.length-2];
       System.out.println("The first smallest element is : " + min_1);
       System.out.println("The first second smallest element is : " + min_2);
       System.out.println("The first largest element is : " + max_1);
       System.out.println("The first second largest element is : " + max_2);
	}

}
