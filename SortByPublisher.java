package assingment;

import java.util.Comparator;

public class SortByPublisher implements Comparator<Book> {

	@Override
	public int compare(Book arg0, Book arg1) {
		// TODO Auto-generated method stub
		String pub1=arg0.getPublisher();
		String pub2=arg1.getPublisher();
		int c=pub1.compareTo(pub2);
		return c;
		
	}

}
