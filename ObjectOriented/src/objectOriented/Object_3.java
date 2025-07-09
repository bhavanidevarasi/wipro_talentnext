package objectOriented;

public class Object_3 {
	static class Author{
		private String name;
		private String emailid;
		private char gender;
		
		public Author(String name, String emailid, char gender) {
			this.name = name;
			this.emailid = emailid;
			this.gender = gender;
		}
		
		public String toString() {
			return name + " (" + gender + "), " + emailid;
		}
	}
	
	static class Book{
		private String name;
		private Author author;
		private int qtyinstck;
		private double price;
		public Book(String name, Author author, int qtyinstck, double price) {
			this.name=name;
			this.author = author;
			this.qtyinstck=qtyinstck;
			this.price = price;
		}
		
		public void display() {
			System.out.println("Book name-> " + name);
			System.out.println("Author name-> " + author);
			System.out.println("Quantity in stock-> " + qtyinstck);
			System.out.println("Price-> " + price);
		}
		
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Author author = new Author("franz kafka", "franzz@gmail", 'M');
		Book book = new Book("metamorphosis", author, 90, 300);
		book.display();
	
     
	}

}
