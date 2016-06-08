package talentica.com.booksharingapp.data.network;

import java.util.List;

import rx.Observable;
import talentica.com.booksharingapp.data.entity.Book;

public interface UserReports extends BaseURL {

    //for user reports  operation
    String API_MODULE_USER_REPORTS = API_BASE_URL+API_SEPERATOR+"user/reports/";
    String API_REQUESTED_BOOKS = API_MODULE_USER_REPORTS+"requested-books";
    String API_BORROWED_BOOKS  = API_MODULE_USER_REPORTS+"borrowed-books";
    String API_LENT_BOOKS = API_MODULE_USER_REPORTS+"lent-books";
    String API_LOST_BOOKS  = API_MODULE_USER_REPORTS+"lost-books";
    String API_RETURNED_BOOKS  = API_MODULE_USER_REPORTS+"returned-books";




    Observable<List<Book>> requestedBooksByUser();
    Observable<List<Book>> borrowedBooksByUser();
    Observable<List<Book>> lentBooksByUser();
    Observable<List<Book>> lostBooksByUser();
    Observable<List<Book>> returnedBooksByUser();
}
