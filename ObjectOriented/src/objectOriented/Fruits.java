package objectOriented;
import java.util.Scanner;
class Fruit{
	public String name;
	public String taste;
	public String size;

   public void eat() {
	  
	   System.out.println("The " + name + " tastes " + taste + "\n" + " Their size is " + size );
	
}
}
class Apple extends Fruit{
	public Apple(String app, String akk, String add) {
		this.name = app;
		this.taste = akk;
		this.size = add;
	}
	@Override
	public void eat() {

		   System.out.println(name + " tastes sweet and " + taste + "\n" + " Their size is " + size );	
	}
	
}

class Orange extends Fruit{
	public Orange(String all, String srr, String bjj) {
		this.name=all;
		this.taste=srr;
		this.size=bjj;
	}
	@Override
	public void eat() {
		  
		   System.out.println("The " + name + " tastes " + taste + "\n" + " Their size is " + size );
		
	}
}
	
public class Fruits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner fruit = new Scanner(System.in);
		System.out.println("Enter fruit one : ");
		String name = fruit.next();
		String taste = fruit.next();
		String size = fruit.next();
		System.out.println("Enter fruit two : ");
		String name1 = fruit.next();
		String taste1 = fruit.next();
		String size1 = fruit.next();
		
		Fruit f1 = new Apple(name, taste,size);
		Fruit f2 = new Orange(name1, taste1, size1);
	    f1.eat();
	    f2.eat();
		

	}

}
