package talentica.com.booksharingapp.data.network;

import com.android.volley.Request;

import org.json.JSONObject;

import java.util.List;

import rx.Observable;
import talentica.com.booksharingapp.data.entity.Book;
import talentica.com.booksharingapp.data.entity.JsonResponseMapper;

public class BookSearchImpl extends BaseClassForMethods implements BaseURL, BookSearch  {
    @Override
    public Observable<List<Book>> searchBookByTag(String Tag) {
        return Observable.create(subscriber -> {
            if (isThereInternetConnection()) {
                try {
                    JSONObject responseForSearchBookByTag=VolleyApiRequest.createVolleyApiRequestObject(API_BOOK_SEARCH_BY_TAG).VolleyJsonRequest(Request.Method.GET, null);
                    if (responseForSearchBookByTag != null) {
                        subscriber.onNext(JsonResponseMapper.getRetrievedBookList(responseForSearchBookByTag));
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
    public Observable<List<Book>> searchBookByAuther(String Auther) {
        return Observable.create(subscriber -> {
            if (isThereInternetConnection()) {
                try {
                    JSONObject responseForSearchBookByAuther=VolleyApiRequest.createVolleyApiRequestObject(API_BOOK_SEARCH_BY_AUTHOR).VolleyJsonRequest(Request.Method.GET, null);
                    if (responseForSearchBookByAuther != null) {
                        subscriber.onNext(JsonResponseMapper.getRetrievedBookList(responseForSearchBookByAuther));
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
    public Observable<List<Book>> searchBooByLikeName(String LikeName) {
        return Observable.create(subscriber -> {
            if (isThereInternetConnection()) {
                try {
                    JSONObject responseForSearchBooByLikeName=VolleyApiRequest.createVolleyApiRequestObject(API_BOOK_SEARCH_BY_NAME).VolleyJsonRequest(Request.Method.GET, null);
                    if (responseForSearchBooByLikeName != null) {
                        subscriber.onNext(JsonResponseMapper.getRetrievedBookList(responseForSearchBooByLikeName));
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
