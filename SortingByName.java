package assingment;

import java.util.Comparator; 
public class SortingByName implements Comparator<Book>{
	@Override
	public int compare(Book b1,Book b2) {
		String name1=b1.getName();
		String name2=b2.getName();
		int c=name1.compareTo(name2);
		return c;
	}

}
