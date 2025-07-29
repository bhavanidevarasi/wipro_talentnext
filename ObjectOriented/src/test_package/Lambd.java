package test_package;
@FunctionalInterface
interface Test{
	int myfunction(int a, int b, int c);
}
public class Lambd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test t1 = (a, b, c) -> a + b + c;
		Test t2 = (a,b,c) -> a*b*c;
		int add = t1.myfunction(2,3 , 5);
		int mul = t2.myfunction(2, 4, 10);
		System.out.println("Addition :  " + add);
		System.out.println("Multiplication : " + mul);
		

	}

}
