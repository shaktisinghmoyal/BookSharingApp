package talentica.com.booksharingapp.data.network;

import rx.Observable;

public interface BookStatus extends BaseURL {

    //for book statuc  operation
    String API_BOOK_STATUS = API_BASE_URL+API_SEPERATOR+"book/status/";
    Observable<String> bookStatus(final int Id);

}
