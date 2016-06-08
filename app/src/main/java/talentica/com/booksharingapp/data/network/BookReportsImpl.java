package talentica.com.booksharingapp.data.network;

import com.android.volley.Request;

import org.json.JSONObject;

import java.util.List;

import rx.Observable;
import talentica.com.booksharingapp.data.entity.Book;
import talentica.com.booksharingapp.data.entity.JsonResponseMapper;

public class BookReportsImpl extends BaseClassForMethods implements BaseURL, BookReports  {
    @Override
    public Observable<List<Book>> recentlyAddedBookList() {
        return Observable.create(subscriber -> {
            if (isThereInternetConnection()) {
                try {
                    JSONObject responseForRetrieveBooks=VolleyApiRequest.createVolleyApiRequestObject(API_RECENTLY_ADDED_BOOK).VolleyJsonRequest(Request.Method.GET, null);
                    if (responseForRetrieveBooks != null) {
                        subscriber.onNext(JsonResponseMapper.getRetrievedBookList(responseForRetrieveBooks));
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
    public Observable<List<Book>> mostReadBookList() {
        return Observable.create(subscriber -> {
            if (isThereInternetConnection()) {
                try {
                    JSONObject responseForRetrieveBooks=VolleyApiRequest.createVolleyApiRequestObject(API_MOST_READ_BOOK).VolleyJsonRequest(Request.Method.GET, null);
                    if (responseForRetrieveBooks != null) {
                        subscriber.onNext(JsonResponseMapper.getRetrievedBookList(responseForRetrieveBooks));
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
