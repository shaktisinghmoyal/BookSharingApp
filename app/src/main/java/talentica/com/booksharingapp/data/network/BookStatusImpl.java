package talentica.com.booksharingapp.data.network;

import com.android.volley.Request;

import org.json.JSONObject;

import rx.Observable;
import talentica.com.booksharingapp.data.entity.JsonResponseMapper;

public class BookStatusImpl extends BaseClassForMethods implements BaseURL, BookStatus  {
    @Override
    public Observable<String> bookStatus(int bookId) {
        return Observable.create(subscriber -> {
            if (isThereInternetConnection()) {
                try {
                    JSONObject responseForBookStatus=VolleyApiRequest.createVolleyApiRequestObject(API_BOOK_STATUS+"/"+bookId).VolleyJsonRequest(Request.Method.GET, null);
                    if (responseForBookStatus != null) {
                        subscriber.onNext(JsonResponseMapper.getBookStatus(responseForBookStatus));
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
