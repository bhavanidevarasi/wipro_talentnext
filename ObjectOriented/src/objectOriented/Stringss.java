package objectOriented;
import java.util.Scanner;
 public class Stringss {
 public static void main(String [] args) {
	Scanner str = new Scanner(System.in);
	System.out.println("Enter the Original String : ");
	String original = str.next();
	String pal = new StringBuilder(original).reverse().toString();
	pal.toLowerCase();
	if(original.equals(pal)) {
		System.out.println(pal + " is a plaindrome ");
	}
	else {
		System.out.println(pal + " is not a plaindrome ");
	}
}
}
