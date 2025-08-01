package wrapper;
import java.util.Scanner;
public class Binary_Format {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        System.out.print("Enter an integer between 1 and 255: ");
        int num = sc.nextInt();

       
        if (num < 1 && num > 255) {
            System.out.println("Invalid input. Please enter a number between 1 and 255.");
            return;
        }

        String binary = Integer.toBinaryString(num);
        String paddedBinary = String.format("%8s", binary).replace(' ', '0');

        System.out.println(paddedBinary);

	}

}
