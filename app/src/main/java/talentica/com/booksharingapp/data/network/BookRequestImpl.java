package talentica.com.booksharingapp.data.network;

import com.android.volley.Request;

import org.json.JSONObject;

import rx.Observable;
import talentica.com.booksharingapp.data.entity.JsonResponseMapper;

public class BookRequestImpl  extends BaseClassForMethods implements BaseURL, BookRequest   {

    @Override
    public Observable<Boolean> requestBook(int bookId) {
        return Observable.create(subscriber -> {
            if (isThereInternetConnection()) {
                try {
                    JSONObject responseForRequestBook=VolleyApiRequest.createVolleyApiRequestObject(API_BORROW_BOOK+"/"+bookId).VolleyJsonRequest(Request.Method.PUT, null);
                    if (responseForRequestBook != null) {
                        subscriber.onNext(JsonResponseMapper.getStatus(responseForRequestBook));
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
    public Observable<Boolean> approveRequestedBook(int bookId, int userId) {
        return Observable.create(subscriber -> {
            if (isThereInternetConnection()) {
                try {
                    JSONObject responseForApproveRequestBook=VolleyApiRequest.createVolleyApiRequestObject(API_LEND_BOOK+"/"+bookId+"/"+userId).VolleyJsonRequest(Request.Method.PUT, null);
                    if (responseForApproveRequestBook != null) {
                        subscriber.onNext(JsonResponseMapper.getStatus(responseForApproveRequestBook));
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
    public Observable<Boolean> rejectRequestedBook(int bookId, int userId) {
        return Observable.create(subscriber -> {
            if (isThereInternetConnection()) {
                try {
                    JSONObject responseForRejetRequestBook=VolleyApiRequest.createVolleyApiRequestObject(API_REJECT_REQUEST+"/"+bookId+"/"+userId).VolleyJsonRequest(Request.Method.PUT, null);
                    if (responseForRejetRequestBook != null) {
                        subscriber.onNext(JsonResponseMapper.getStatus(responseForRejetRequestBook));
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
