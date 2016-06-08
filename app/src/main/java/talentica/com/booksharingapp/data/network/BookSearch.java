package talentica.com.booksharingapp.data.network;

import java.util.List;

import rx.Observable;
import talentica.com.booksharingapp.data.entity.Book;

public interface BookSearch extends BaseURL {
    //for book search  operations
    String API_MODULE_BOOK_SEARCH = API_BASE_URL + API_SEPERATOR+"book/search/";
    String API_BOOK_SEARCH_BY_TAG = API_MODULE_BOOK_SEARCH+"by-tags/";
    String API_BOOK_SEARCH_BY_AUTHOR = API_MODULE_BOOK_SEARCH+"by-author/";
    String API_BOOK_SEARCH_BY_NAME = API_MODULE_BOOK_SEARCH+"like-name/";


    Observable<List<Book>> searchBookByTag(final String Tag);
    Observable<List<Book>> searchBookByAuther(final String Auther);
    Observable<List<Book>> searchBooByLikeName(final String LikeName);
}
