package talentica.com.booksharingapp.data.network;

import com.android.volley.Request;

import org.json.JSONObject;

import java.util.List;

import rx.Observable;
import talentica.com.booksharingapp.data.entity.Book;
import talentica.com.booksharingapp.data.entity.JsonResponseMapper;

public class UserReportsImpl extends BaseClassForMethods implements BaseURL, UserReports{
    @Override
    public Observable<List<Book>> requestedBooksByUser() {
        return Observable.create(subscriber -> {
            if (isThereInternetConnection()) {
                try {
                    JSONObject responseForRequestedBooksByUser=VolleyApiRequest.createVolleyApiRequestObject(API_REQUESTED_BOOKS).VolleyJsonRequest(Request.Method.GET, null);
                    if (responseForRequestedBooksByUser != null) {
                        subscriber.onNext(JsonResponseMapper.getRetrievedBookList(responseForRequestedBooksByUser));
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
    public Observable<List<Book>> borrowedBooksByUser() {
        return Observable.create(subscriber -> {
            if (isThereInternetConnection()) {
                try {
                    JSONObject responseForBorrowedBooksByUser=VolleyApiRequest.createVolleyApiRequestObject(API_BORROWED_BOOKS).VolleyJsonRequest(Request.Method.GET, null);
                    if (responseForBorrowedBooksByUser != null) {
                        subscriber.onNext(JsonResponseMapper.getRetrievedBookList(responseForBorrowedBooksByUser));
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
    public Observable<List<Book>> lentBooksByUser() {
        return Observable.create(subscriber -> {
            if (isThereInternetConnection()) {
                try {
                    JSONObject responseForLentBooksByUser=VolleyApiRequest.createVolleyApiRequestObject(API_LENT_BOOKS).VolleyJsonRequest(Request.Method.GET, null);
                    if (responseForLentBooksByUser != null) {
                        subscriber.onNext(JsonResponseMapper.getRetrievedBookList(responseForLentBooksByUser));
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
    public Observable<List<Book>> lostBooksByUser() {
        return Observable.create(subscriber -> {
            if (isThereInternetConnection()) {
                try {
                    JSONObject responseForLostBooksByUser=VolleyApiRequest.createVolleyApiRequestObject(API_LOST_BOOKS).VolleyJsonRequest(Request.Method.GET, null);
                    if (responseForLostBooksByUser != null) {
                        subscriber.onNext(JsonResponseMapper.getRetrievedBookList(responseForLostBooksByUser));
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
    public Observable<List<Book>> returnedBooksByUser() {
        return Observable.create(subscriber -> {
            if (isThereInternetConnection()) {
                try {
                    JSONObject responseForReturnedBooksByUser=VolleyApiRequest.createVolleyApiRequestObject(API_RETURNED_BOOKS).VolleyJsonRequest(Request.Method.GET, null);
                    if (responseForReturnedBooksByUser != null) {
                        subscriber.onNext(JsonResponseMapper.getRetrievedBookList(responseForReturnedBooksByUser));
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
