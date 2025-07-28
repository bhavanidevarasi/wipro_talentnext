package objectOriented;
import java.util.Scanner;
public class String7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string : ");
		String str = sc.next();
		char ch = 'x';
		if(str.charAt(0)== ch || str.charAt(str.length()-1)==ch) {
			System.out.println(str.substring(1,str.length()-1));
		}
		else {
			System.out.println(str);
		}

	}

}
