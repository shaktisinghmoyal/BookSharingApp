package talentica.com.booksharingapp.data.network;

import rx.Observable;

public interface MarkBookReturnOrLost extends BaseURL {
    //for book return and lost operations
    String API_RETURN_BOOK = API_BASE_URL+API_SEPERATOR+"book/return";
    String API_LOSt_BOOK = API_BASE_URL+API_SEPERATOR+"book/lost";


    Observable<Boolean> returnBook(final int bookId, final int userId);
    Observable<Boolean> lostBook(final int bookId);
}
