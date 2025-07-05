package java_fundamentals;
import java.util.Scanner;
public class Quest_18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of rows: ");
        if (!sc.hasNextInt()) {
            System.out.println("Please enter an integer number");
        } else {
            int n = sc.nextInt();
            System.out.println("Using for loop:");
            for (int i = 1; i <= n; i++) {
                for (int j = 1; j <= i; j++) {
                    System.out.print("* ");
                }
                System.out.println();
            }

            System.out.println("\nUsing while loop:");
            int i = 1;
            while (i <= n) {
                int j = 1;
                while (j <= i) {
                    System.out.print("* ");
                    j++;
                }
                System.out.println();
                i++;
            }
        }

	}

}
