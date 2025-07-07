package encapsulation_Abstraction;

public class Question3 {

	public static void main(String[] args) {
		Author author = new Author("Sai Venkata Chandran","saivcmindala15@gmail.com",'M');
		Book book = new Book("My Thoughts",author,1000,100);
		System.out.println(
				"Book Name: " + book.getBookName() + "\nAuthor Name: " + book.getAuthor().getName() + "\nAuthor Email: " + book.getAuthor().getEmail() + "\nAuthor Gender: " + book.getAuthor().getGender() + "\nPrice: " + book.getPrice() + "\nQuantity: " + book.getQuantity()
				);

	}

}


class Author{
	private String name;
	private String email;
	private char gender;
	public Author(String name, String email, char gender) {
		this.name = name;
		this.email = email;
		this.gender = gender;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	public void setGender(char gender) {
		this.gender = gender;
	}
	
	public String getName() {
		return this.name;
	}
	
	public String getEmail() {
		return this.email;
	}
	
	public char getGender() {
		return this.gender;
	}
}

class Book{
	private String bookName;
	private Author author;
	private double price;
	private int qtyInStock;
	
	public Book(String bookName, Author author, double price, int qtyInStock) {
		this.bookName = bookName;
		this.author = author;
		this.price = price;
		this.qtyInStock = qtyInStock;
		
	}
	
	public void setBookName(String name) {
		this.bookName = name;
	}
	
	public void setAuthor(Author author) {
		this.author = author;
	}
	
	public void setPrice(int price) {
		this.price = price;
	}
	
	public void setQuantity(int quantity) {
		this.qtyInStock = quantity;
	}
	
	public String getBookName() {
		return this.bookName;
	}
	
	public Author getAuthor() {
		return this.author;
	}
	
	public double getPrice() {
		return this.price;
	}
	
	public int getQuantity() {
		return this.qtyInStock;
	}
}