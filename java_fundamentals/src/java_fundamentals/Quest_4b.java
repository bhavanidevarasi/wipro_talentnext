package java_fundamentals;
import java.util.Scanner;
public class Quest_4b {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first non-negative integer: ");
        int num1 = sc.nextInt();

        System.out.print("Enter second non-negative integer: ");
        int num2 = sc.nextInt();
  
        if (lastDigit(num1, num2)) {
            System.out.println("True - Same last digit");
        } else {
            System.out.println("False - Different last digits");
        }

        sc.close();
    }

    public static boolean lastDigit(int a, int b) {
        return (a % 10) == (b % 10);
    }
}
