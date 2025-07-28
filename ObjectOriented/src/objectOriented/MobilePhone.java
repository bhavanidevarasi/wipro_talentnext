package objectOriented;
import java.util.ArrayList;
import java.util.Scanner;

class Contact{
	private String name;
	private int phn_no;
	
	public Contact(String nu, int na) {
		this.name = nu;
		this.phn_no=na;
	}
	public String getname() {
		return name;
	}
	public int getphn_no() {
		return phn_no;
	}
	public void setname(String name) {
		this.name=name;
	}
	public void setphn_no(int phm) {
		this.phn_no=phm;
	}
	
	void displayContact() {
		System.out.println("Name : " + name + " Phone Number : " + phn_no);
	}
	
}
//addContact(Contact contact)

//displayAllContacts()

//searchContactByName(String name)
class Mobiles{
	ArrayList<Contact> details = new ArrayList<>();
	void addContact(Contact contacts) {
		details.add(contacts);

	}
	void displayAllContacts() {
		for(Contact c1 : details ) {
			c1.displayContact();
		}
	}
	void searchByName(String sn) {
		boolean found = false;
		for(Contact c : details) {
			if(c.getname().equalsIgnoreCase(sn)) {
				c.displayContact();
				found = true;
			}
		}
		if(!found) {
			System.out.println("No name found based on " + sn);
		}
	}
	
	
	
}
public class MobilePhone {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		Mobiles phone = new Mobiles();
		
		System.out.println("Welcome To Mobile Contact Manager");
		while(true) {
			System.out.println("1.Add New Contact");
			System.out.println("2.Display All Contacts");
			System.out.println("3.Search By Name");
			System.out.println("4.Exit");
			int choice = sc.nextInt();
			
			switch(choice) {
			case 1:
				System.out.println("Enter Contact Name : ");
				 String name =sc.next();
				System.out.println("Enter Contact Number : ");
			      int phn_no =	sc.nextInt();
				phone.addContact(new Contact (name, phn_no));
				break;
			case 2:
				phone.displayAllContacts();
				break;
			case 3:
				System.out.println("Enter Contact Name : ");
				 String name1 =sc.next();
				phone.searchByName(name1);
				break;
			case 4:
				System.out.println("Exiting!!!");
				break;
				
			default:
				System.out.println("Invalid Choice1");
			}
		}

	}

}
