package assingment;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Iterator;

public class Main {
	
	public static void main(String[] args) {

	ArrayList<Book> books =new ArrayList<Book>();
	books.add(new Book(1,"Jumanji","Chris Van Allsburg"," Andersen Press Ltd",10));
	books.add(new Book(2,"The Perks of Being a Wallflower","Stephen Chbosky","MTV Books",16));
	books.add(new Book(3,"The Boy in the Striped Pyjamas","John Boyne","David Fickling Books",8));
	books.add(new Book(4,"The Book Thief","Markus Zusak","Knopf Books for Young Readers",11));
	books.add(new Book(5,"Paper Towns","John Green"," Dutton",12));
	
	System.out.println("choose sort type 1:By name, 2:By id,3:By quantity,4: By author,5: By publsiher ");
	Scanner input=new Scanner(System.in);
	int in= input.nextInt();
	switch(in) {
	case 1:
	System.out.println("Sorting by name");
	SortingByName n = new SortingByName();
	books.sort(n);
	System.out.println(books);
	break;
	
	case 2:
	System.out.println("Sorting by id");
	SortById i = new SortById();
	books.sort(i);
	System.out.println(books);
	break;
	
	case 3:
	System.out.println("Sorting by quantity");
	SortByQuantity q = new SortByQuantity();
	books.sort(q);
	System.out.println(books);
	break;
	
	case 4:
	System.out.println("Sorting by author");
	SortByAuthor a = new SortByAuthor();
	books.sort(a);
	System.out.println(books);
	break;
	
	case 5:
	System.out.println("Sorting by publisher");
	SortByPublisher p = new SortByPublisher();
	books.sort(p);
	System.out.println(books);
	break;
	
	default:
		System.out.println("exit");
	}
	
	
	}
}
