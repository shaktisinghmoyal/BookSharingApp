package talentica.com.booksharingapp.data.network;

import java.util.List;

import rx.Observable;
import talentica.com.booksharingapp.data.entity.Book;

public interface BookCRUDOperation extends BaseURL {

    //for book crud operations
    String API_RETRIEVE_BOOKS = API_BASE_URL + API_SEPERATOR+"books";
    String API_CRUDE_ON_BOOK = API_BASE_URL + API_SEPERATOR+"book";

    Observable<Boolean> createBook(final Book book);
    Observable<Boolean> updateBook(final int bookId);
    Observable<Boolean> deleteBook(final int bookId);
    Observable<Book> retrieveBook(final int bookId);
    Observable<List<Book>> retrieveBookList();
}
