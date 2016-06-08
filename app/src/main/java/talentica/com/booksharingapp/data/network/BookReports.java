package talentica.com.booksharingapp.data.network;

import java.util.List;

import rx.Observable;
import talentica.com.booksharingapp.data.entity.Book;

public interface BookReports extends BaseURL {

    //for book report operations
    String API_RECENTLY_ADDED_BOOK = API_BASE_URL + API_SEPERATOR+"recently-added";
    String API_MOST_READ_BOOK = API_BASE_URL + API_SEPERATOR+"most-read";

    Observable<List<Book>> recentlyAddedBookList();
    Observable<List<Book>> mostReadBookList();

}
