package exception_handling;
import java.util.Scanner;
public class MathOperation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
            if (args.length != 5) {
                throw new ArrayIndexOutOfBoundsException("Please enter exactly 5 integers.");
            }

            int[] numbers = new int[5];
            int sum = 0;

          
            for (int i = 0; i < 5; i++) {
                numbers[i] = Integer.parseInt(args[i]);  
                sum += numbers[i];
            }

            double average = sum / 5.0;  

            System.out.println("Sum = " + sum);
            System.out.println("Average = " + average);

        } catch (NumberFormatException e) {
            System.out.println("NumberFormatException: Please enter only integer values.");
        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException: " + e.getMessage());
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Unexpected Exception: " + e.getMessage());
        }
	}

}
