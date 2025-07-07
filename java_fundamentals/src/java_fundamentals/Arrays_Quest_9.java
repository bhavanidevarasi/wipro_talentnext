package java_fundamentals;
import java.util.Scanner;
public class Arrays_Quest_9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);

        // Input the size of the array
        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();

        int[] arr = new int[size];

        // Input array elements
        System.out.println("Enter the array elements:");
        for (int i = 0; i < size; i++) {
            arr[i] = scanner.nextInt();
        }

        int[] result = new int[size];
        int index = 0;

        // Copy non-10 elements to result array
        for (int i = 0; i < size; i++) {
            if (arr[i] != 10) {
                result[index] = arr[i];
                index++;
            }
        }

        // Print the result array
        System.out.print("Modified array: ");
        for (int i = 0; i < size; i++) {
            System.out.print(result[i] + " ");
        }
	}

}
