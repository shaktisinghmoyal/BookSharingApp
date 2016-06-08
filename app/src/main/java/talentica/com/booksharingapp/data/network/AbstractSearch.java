package talentica.com.booksharingapp.data.network;

import java.util.List;

import rx.Observable;
import talentica.com.booksharingapp.data.entity.Book;

public interface AbstractSearch  extends BaseURL {
    //for book abstract search  operation
    String API_ABSTRACT_BOOK_SEARCH = API_BASE_URL+API_SEPERATOR+"search";

    Observable<List<Book>> abstractSearch(final String stringForSearch);
}
