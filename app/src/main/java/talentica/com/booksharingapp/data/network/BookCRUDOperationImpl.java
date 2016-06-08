package talentica.com.booksharingapp.data.network;

import com.android.volley.Request;

import org.json.JSONObject;

import java.util.List;

import rx.Observable;
import talentica.com.booksharingapp.data.entity.Book;
import talentica.com.booksharingapp.data.entity.JsonForBook;
import talentica.com.booksharingapp.data.entity.JsonResponseMapper;

public class BookCRUDOperationImpl extends BaseClassForMethods implements BaseURL, BookCRUDOperation {

    @Override
    public  Observable<Boolean>  createBook(Book book) {

        return Observable.create(subscriber -> {
            if (isThereInternetConnection()) {
                try {
                    JSONObject responseForCreateBook=VolleyApiRequest.createVolleyApiRequestObject(API_CRUDE_ON_BOOK).VolleyJsonRequest(Request.Method.POST, JsonForBook.getJsonObjectOfBook(book));
                    if (responseForCreateBook != null) {
                        subscriber.onNext(JsonResponseMapper.getStatus(responseForCreateBook));
                        subscriber.onCompleted();
                    } else {
                        subscriber.onError(new Exception());
                    }
                } catch (Exception e) {
                    subscriber.onError(new Exception(e.getCause()));
                }
            } else {
                subscriber.onError(new Exception());
            }
        });


    }

    @Override
    public  Observable<Boolean>  updateBook(int bookId) {

        return Observable.create(subscriber -> {
            if (isThereInternetConnection()) {
                try {
                    JSONObject responseForUpdateBook=VolleyApiRequest.createVolleyApiRequestObject(API_CRUDE_ON_BOOK+"/"+bookId).VolleyJsonRequest(Request.Method.PUT, JsonForBook.getJsonObjectOfBook(bookId));
                    if (responseForUpdateBook != null) {
                        subscriber.onNext(JsonResponseMapper.getStatus(responseForUpdateBook));
                        subscriber.onCompleted();
                    } else {
                        subscriber.onError(new Exception());
                    }
                } catch (Exception e) {
                    subscriber.onError(new Exception(e.getCause()));
                }
            } else {
                subscriber.onError(new Exception());
            }
        });
    }

    @Override
    public Observable<Boolean> deleteBook(int bookId) {
        return Observable.create(subscriber -> {
            if (isThereInternetConnection()) {
                try {
                    JSONObject responseForDeleteBook=VolleyApiRequest.createVolleyApiRequestObject(API_CRUDE_ON_BOOK+"/"+bookId).VolleyJsonRequest(Request.Method.DELETE, JsonForBook.getJsonObjectOfBook(bookId));
                    if (responseForDeleteBook != null) {
                        subscriber.onNext(JsonResponseMapper.getStatus(responseForDeleteBook));
                        subscriber.onCompleted();
                    } else {
                        subscriber.onError(new Exception());
                    }
                } catch (Exception e) {
                    subscriber.onError(new Exception(e.getCause()));
                }
            } else {
                subscriber.onError(new Exception());
            }
        });
    }


    @Override
    public Observable<Book> retrieveBook(int bookId) {
        return Observable.create(subscriber -> {
            if (isThereInternetConnection()) {
                try {
                    JSONObject responseForRetrieveBook=VolleyApiRequest.createVolleyApiRequestObject(API_CRUDE_ON_BOOK+"/"+bookId).VolleyJsonRequest(Request.Method.GET, null);
                    if (responseForRetrieveBook != null) {
                          subscriber.onNext(JsonResponseMapper.getRetrievedBook(responseForRetrieveBook));
                        subscriber.onCompleted();
                    } else {
                        subscriber.onError(new Exception());
                    }
                } catch (Exception e) {
                    subscriber.onError(new Exception(e.getCause()));
                }
            } else {
                subscriber.onError(new Exception());
            }
        });
    }


    @Override
    public Observable<List<Book>> retrieveBookList() {
        return Observable.create(subscriber -> {
            if (isThereInternetConnection()) {
                try {
                    JSONObject responseForRetrieveBookList=VolleyApiRequest.createVolleyApiRequestObject(API_CRUDE_ON_BOOK).VolleyJsonRequest(Request.Method.GET, null);
                    if (responseForRetrieveBookList != null) {
                           subscriber.onNext(JsonResponseMapper.getRetrievedBookList(responseForRetrieveBookList));
                        subscriber.onCompleted();
                    } else {
                        subscriber.onError(new Exception());
                    }
                } catch (Exception e) {
                    subscriber.onError(new Exception(e.getCause()));
                }
            } else {
                subscriber.onError(new Exception());
            }
        });
    }




}
