package objectOriented;
import java.util.Scanner;
public class String8 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string : ");
		String s = sc.next();
		int star = s.indexOf('*');
		//int n1 = s.indexOf(n+1);
		//int n2 = s.indexOf(n-1);
		String str = s.substring(0, star-1).concat(s.substring(star+2,s.length()));
		System.out.println(str);
		

	}

}
