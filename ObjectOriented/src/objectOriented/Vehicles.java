package objectOriented;
  import java.util.Scanner;
class Vehicle{
	public String brand;
	public int speed;
	public  Vehicle(String nn, int nj) {
		this.brand=nn;
		this.speed = nj;
	}
	void move() {
		System.out.println("The " + brand + " is moving at " + speed + "km/h");
	}
}
class Car extends Vehicle{

	public Car(String nn, int nj) {
		super(nn, nj);	
	}
	@Override
	void move() {
		System.out.println("The Car " + brand + " zooms at " + speed + "km/h");
	}
	
}
class Bike extends Vehicle{

	public Bike(String nn, int nj) {
		super(nn, nj);	
	}
	@Override
	void move() {
		System.out.println("The Bike " + brand + " rides at " + speed + "km/h");
	}
	
}
public class Vehicles {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter the car name : ");
      String name = sc.next();
      System.out.println("Enter the car speed : ");
      int speed = sc.nextInt();
      System.out.println("Enter the bike name : ");
      String name1 = sc.next();
      System.out.println("Enter the bike speed : ");
      int speed1 = sc.nextInt();
      Vehicle cs = new Car(name,speed);
      Vehicle bk = new Bike(name1,speed1);
      cs.move();
      bk.move();
      
      
	}

}
