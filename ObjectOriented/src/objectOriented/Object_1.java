package objectOriented;
import java.util.Scanner;
public class Object_1 {
     int height, weight, depth;
     public Object_1(int h, int w, int d) {
    	 weight = w;
    	 height = h;
    	 depth = d;
    	 
     }
     int volume() {
    	 return weight*height*depth;
     }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		Scanner cll = new Scanner(System.in);
		System.out.println("Enter the weight : ");
		int w = cll.nextInt();
		System.out.println("Enter the height : ");
		int h = cll.nextInt();
		System.out.println("Enter the depth : ");
		int d = cll.nextInt();
		Object_1 box = new Object_1(w, h, d);
		System.out.println(box.volume());
		

	}

}
