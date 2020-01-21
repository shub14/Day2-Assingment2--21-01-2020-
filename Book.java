package assingment;

public class Book {
	
	private int id;
	private String name;
	private String author;
	private String publisher;
	private int quantity;
	
	public Book(){};
	public Book(int id, String name,String author,String publisher,int quantity) {
		this.setId(id);
		this.setName(name);
		this.setAuthor(author);
		this.setPublisher(publisher);
		this.setQuantity(quantity);
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getPublisher() {
		return publisher;
	}
	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	
	public String toString() {
		return "Book Id: "+id+"Book name: "+name+"Book author: "+author+"Book publisher: "+publisher+"Book quantity"+quantity;
	}
	
}
