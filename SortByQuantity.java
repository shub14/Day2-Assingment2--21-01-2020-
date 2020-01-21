package assingment;

import java.util.Comparator;
public class SortByQuantity implements Comparator<Book> {

	@Override
	public int compare(Book arg0, Book arg1) {
		int com= arg0.getQuantity()-arg1.getQuantity();
		return com;
	}

}
