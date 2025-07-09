package objectOriented;

class Animal{
	public void eat() {
		System.out.println("Animals eat other animals");
	}
	public void sleep() {
		System.out.println("Animals sleep a alot");
	}
}
class Bird extends Animal {
	@Override
	public void eat() {
		System.out.println("Birds don't eat animals");
	}
	@Override
	public void sleep() {
		System.out.println("Birds sleeps less");
	}
	public void fly() {
		System.out.println("The birds nature is to fly");
	}
}
public class Inheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal ans = new Animal();
		ans.eat();
		ans.sleep();
		Bird crow = new Bird();
		crow.eat();
		crow.sleep();
		crow.fly();
		

	}

}
