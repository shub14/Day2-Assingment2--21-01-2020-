package assingment;

import java.util.Comparator;
public class SortById implements Comparator<Book>{

	@Override
	public int compare(Book arg1, Book arg2) {
			int cm= arg1.getId()-arg2.getId();
		
		return cm;
	}
	

}
