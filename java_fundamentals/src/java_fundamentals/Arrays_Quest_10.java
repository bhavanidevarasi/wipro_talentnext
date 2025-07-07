package java_fundamentals;
import java.util.Scanner;
public class Arrays_Quest_10 {

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

        
        int[] result = new int[n];
        int index = 0;

        for(int i = 0; i < n; i++) {
            if(arr[i] % 2 == 0) {
                result[index++] = arr[i];
            }
        }

      
        for(int i = 0; i < n; i++) {
            if(arr[i] % 2 != 0) {
                result[index++] = arr[i];
            }
        }

        System.out.print("Resulting array: ");
        for(int i = 0; i < n; i++) {
            System.out.print(result[i] + " ");
        }

	}

}
