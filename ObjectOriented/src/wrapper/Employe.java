package wrapper;

class Employee implements Cloneable {
    int id;
    String name;
    double salary;

    Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

   
    public Object clone() throws CloneNotSupportedException {
        return super.clone();  
    }

    
    public String toString() {
        return "ID: " + id + ", Name: " + name + ", Salary: " + salary;
    }
}

public class Employe {
    public static void main(String[] args) throws CloneNotSupportedException {
       
        Employee emp1 = new Employee(101, "Bhavani", 50000);

        Employee emp2 = (Employee) emp1.clone();

        emp1.name = "Devarasi";
        emp1.salary = 60000;

        // Print both
        System.out.println("Original Employee: " + emp1);
        System.out.println("Cloned Employee  : " + emp2);
    }
}
