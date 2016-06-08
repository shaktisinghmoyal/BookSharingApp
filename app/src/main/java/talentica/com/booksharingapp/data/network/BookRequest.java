package talentica.com.booksharingapp.data.network;

import rx.Observable;

public interface BookRequest extends BaseURL {


    //for book request operations
    String API_MODULE_BOOK_REQUEST = API_BASE_URL + API_SEPERATOR+"book/request/";
    String API_BORROW_BOOK = API_MODULE_BOOK_REQUEST;
    String API_LEND_BOOK = API_MODULE_BOOK_REQUEST+"approve/";
    String API_REJECT_REQUEST = API_MODULE_BOOK_REQUEST+"reject/";

    Observable<Boolean> requestBook(final int bookId);
    Observable<Boolean> approveRequestedBook(final int bookId,final int userId);
    Observable<Boolean> rejectRequestedBook(final int bookId,final int userId);


}
