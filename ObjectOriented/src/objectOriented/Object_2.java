package objectOriented;

public class Object_2 {
	//int num1;
	//int num2;
	static int powerInt(int num1, int num2) {
		return (int) Math.pow(num1, num2);
	}
	static double powerDouble(double num1, int num2) {
		return (double) Math.pow(num1, num2);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Object_2 num = new Object_2();
	  // int jkk = num.powerInt(2,3);
	    //double kll = num.powerDouble(2, 0);
	    System.out.println(powerInt(2,5));
	    System.out.println(powerDouble(2,3));

	}

}
