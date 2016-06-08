package talentica.com.booksharingapp.data.network;

import com.android.volley.Request;

import org.json.JSONObject;

import rx.Observable;
import talentica.com.booksharingapp.data.entity.JsonResponseMapper;

public class MarkBookReturnOrLostImpl extends BaseClassForMethods implements BaseURL, MarkBookReturnOrLost   {
    @Override
    public Observable<Boolean> returnBook(int bookId, int userId) {
        return Observable.create(subscriber -> {
            if (isThereInternetConnection()) {
                try {
                    JSONObject responseForBookStatus=VolleyApiRequest.createVolleyApiRequestObject(API_RETURN_BOOK+"/"+bookId+"/"+userId).VolleyJsonRequest(Request.Method.GET, null);
                    if (responseForBookStatus != null) {
                        subscriber.onNext(JsonResponseMapper.getStatus(responseForBookStatus));
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
    public Observable<Boolean> lostBook(int bookId) {
        return Observable.create(subscriber -> {
            if (isThereInternetConnection()) {
                try {
                    JSONObject responseForBookStatus=VolleyApiRequest.createVolleyApiRequestObject(API_LOSt_BOOK+"/"+bookId).VolleyJsonRequest(Request.Method.GET, null);
                    if (responseForBookStatus != null) {
                        subscriber.onNext(JsonResponseMapper.getStatus(responseForBookStatus));
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
