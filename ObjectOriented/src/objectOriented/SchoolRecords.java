package objectOriented;


abstract class Person{
	private String name;
	private int age;
	public Person(String nam, int ag) {
		this.name = nam;
		this.age=ag;
	}
	 public String getname() {
		 return name;
	 }
	 public int getage() {
		 return age;
	 }
	 public void setname(String name){
		 this.name=name;
	 }
	 public void setage(int age) {
		 this.age = age;
	 }
	 abstract void displayDetails();
}
class Student extends Person{
    
	private int rno;
	private int marks;
	public Student(String name, int age,int rn, int mar) {
		super(name,age);
		this.rno = rn;
		this.marks=mar;
	}
	public int getrno() {
		return rno;
	}
	public int getmarks() {
		return marks;
	}
	public void setrno(int rno) {
		this.rno=rno;
	}
	public void setmarks(int marks) {
		this.marks=marks;
	}
	
	
	@Override
	void displayDetails() {
	   System.out.println("Student name -> " + getname());
	   System.out.println("Student age -> " + getage());
	   System.out.println("Student rno -> " + getrno());
	   System.out.println("Student marks -> " + getmarks());
	   
	     
	}
	void getMarks() {
		if(marks >= 90 && marks<=100 ) {
			System.out.println("A");
		}
		else if(marks >= 80 && marks <=89) {
			System.out.println("B");
		}
		else if(marks >= 70 && marks <=79) {
			System.out.println("C");
		}
		else {
			System.out.println("D");
		}
	}
	
}
public class SchoolRecords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student stu = new Student("bhavani", 20, 27, 96);
		stu.displayDetails();
		stu.getMarks();
		
		

	}

}

