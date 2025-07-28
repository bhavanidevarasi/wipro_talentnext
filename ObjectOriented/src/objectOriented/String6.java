package objectOriented;
import java.util.Scanner;
public class String6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string1 : ");
		String s1 = sc.next();
		System.out.println("Enter the string2 : ");
		String s2 = sc.next();
		int result = s1.compareTo(s2);
		if(result > 0) {
			System.out.println(s1.concat(s2).concat(s1));
		}
		else if (result< 0) {
			System.out.println(s2.concat(s1).concat(s2));
		}

	}

}
