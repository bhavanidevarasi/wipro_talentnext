package objectOriented;


class Person{
	private String Member;
	public Person(String mem) {
		this.Member = mem;
	}
	
	public String getMember() {
		return Member;
	}
	public void setname(String name) {
		this.Member=name;
	}
}
class Employee extends Person{
	private double Annual_sal;
	private int Year_Started;
	private String insurance_no;
	public Employee(String name,double ann, int year, String insu) {
        super(name); 
        this.Annual_sal = ann;
        this.Year_Started = year;
        this.insurance_no= insu;
    }
	
	public double getAnnual_sal() {
		return Annual_sal;
	}
	public int getYear_Started() {
		return Year_Started;
	}
	public String getinsurance_no() {
		return insurance_no;
	}
	public void setAnnual_sal(double string) {
		this.Annual_sal= string;
	}
	public void setYear_Started(int year) {
		this.Year_Started= year;
	}
	public void setinsurance_no(String insu) {
		this.insurance_no= insu;
	}
	
}
public class Test_Employee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	//	Person naam = new Person("bhavani");
       Employee emp = new Employee("bhavani", 40000, 2025, "aadhuehjffh" );
       // naam.getMember();  
       System.out.println(emp.getMember());
       System.out.println(emp.getAnnual_sal());
       System.out.println(emp.getYear_Started());
       System.out.println(emp.getinsurance_no());
       emp.setname("Asthaa");
       emp.setAnnual_sal(45000);
       emp.setYear_Started(2025);
       emp.setinsurance_no("Insr2434");
       System.out.println(emp.getMember());
       System.out.println(emp.getAnnual_sal());
       System.out.println(emp.getYear_Started());
       System.out.println(emp.getinsurance_no());
       
	}

}
