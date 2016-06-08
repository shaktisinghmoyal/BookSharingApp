package talentica.com.booksharingapp.data.network;

import com.android.volley.Request;

import org.json.JSONObject;

import java.util.List;

import rx.Observable;
import talentica.com.booksharingapp.data.entity.Book;
import talentica.com.booksharingapp.data.entity.JsonResponseMapper;

public class AbstractSearchImpl  extends BaseClassForMethods implements BaseURL, AbstractSearch {


    @Override
    public Observable<List<Book>> abstractSearch(String stringForSearch) {
        return Observable.create(subscriber -> {
            if (isThereInternetConnection()) {
                try {
                    JSONObject responseForAbstractSearch=VolleyApiRequest.createVolleyApiRequestObject(API_ABSTRACT_BOOK_SEARCH).VolleyJsonRequest(Request.Method.GET, null);
                    if (responseForAbstractSearch != null) {
                        subscriber.onNext(JsonResponseMapper.getRetrievedBookList(responseForAbstractSearch));
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
