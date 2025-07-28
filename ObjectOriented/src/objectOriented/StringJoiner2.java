package objectOriented;
import java.util.Scanner;
import java.util.StringJoiner;
public class StringJoiner2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner join = new Scanner(System.in);
		StringJoiner s1 = new StringJoiner("-", "[","]");
		StringJoiner s2 = new StringJoiner("-","{","}");
		System.out.println("Enter the no.of city names : ");
		int n = join.nextInt();
		join.nextLine();
		String[] array = new String[n];
		System.out.println("Enter the names : ");
		for(int i =0; i<n; i++) {
			array[i] = join.next();
		}
		for(int i =0; i<n; i++) {
			if(i<n/2) {
				s1.add(array[i]);
			}else {
				s2.add(array[i]);
			}
		}
		
	     StringJoiner origs1 = new StringJoiner("-");
	     for(int i =0; i<n/2;i++) {
	    	 origs1.add(array[i]);
	     }
	  
	    s1.merge(s2);
		System.out.println(s1);
		s2.merge(origs1);
		System.out.println(s2);

	}

}
