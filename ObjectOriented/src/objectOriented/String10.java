package objectOriented;
import java.util.Scanner;
public class String10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string : ");
		String str = sc.next();
		System.out.println("Enter the n value : ");
		int n = sc.nextInt();
		String sub = str.substring(n-1, str.length());
		for(int i =0; i<n; i++) {
			System.out.print(sub);
		}
		
				

	}

}
