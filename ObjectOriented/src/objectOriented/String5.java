package objectOriented;
import java.util.Scanner;
public class String5 {

	public static void main(String[] args) {
		Scanner str  = new Scanner(System.in);
		System.out.println("enter the String : ");
		String s = str.next();
		String sub = s.substring(1, s.length()-1);
		System.out.println(sub);

	}

}
