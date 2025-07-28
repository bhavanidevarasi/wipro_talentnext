package objectOriented;
import java.util.Scanner;
public class String4 {

	public static void main(String[] args) {
		Scanner str = new Scanner(System.in);
		System.out.println("Enter The String : ");
		String s1 = str.next();
		int len = s1.length();
		if(len % 2 ==0) {
			System.out.println(s1.substring(0, len/2));
		}
		else {
			System.out.println("null");
		}

	}

}
