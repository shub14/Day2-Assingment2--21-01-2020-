package assingment;

import java.util.Comparator;

public class SortByAuthor implements Comparator<Book> {

	@Override
	public int compare(Book arg0, Book arg1) {
		String auth1=arg0.getAuthor();
		String auth2=arg1.getAuthor();
		int c=auth1.compareTo(auth2);
		return c;
	}

}
