
import java.util.ArrayList;
import java.util.Collection;

import com.eisgroup.javaexam.library.Book;
import com.eisgroup.javaexam.library.Library;

public class Customer implements Library {
	
	Collection<Book> knyga = new ArrayList<Book>();
	
	@Override
	public Collection<Book> findByAuthor(String arg0) {
		return null;
	}

	@Override
	public Book findByTitle(String arg0) {
		return null;
	}

	@Override
	public Collection<Book> getBooksSortedByPageCount() {
		return null;
	}

	@Override
	public int getNumberOfBooks() {
		return knyga.size();
	}

	@Override
	public void takeABook(Book arg0) {
		if (arg0 != knyga) knyga.add(arg0);
		
	}
}
