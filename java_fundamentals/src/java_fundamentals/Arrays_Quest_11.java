package java_fundamentals;
import java.util.Scanner;
public class Arrays_Quest_11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

       
        System.out.print("Enter array size: ");
        int n = sc.nextInt();

        int[] arr = new int[n];


        System.out.println("Enter array elements:");
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        boolean only14 = true;
        for(int i = 0; i < n; i++) {
            if(arr[i] != 1 && arr[i] != 4) {
                only14 = false;
                break;
            }
        }

      
        System.out.println(only14);

	}

}
