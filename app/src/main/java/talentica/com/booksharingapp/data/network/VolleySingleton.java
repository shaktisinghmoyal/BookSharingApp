package talentica.com.booksharingapp.data.network;

import android.content.Context;
import android.text.TextUtils;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.toolbox.Volley;

public class VolleySingleton {
    private String TAG="VolleySingleton";
    private static VolleySingleton volleySingleton;
    private RequestQueue requestQueue;
    private static Context context;

    private VolleySingleton(Context context){
        this.context=context;
        requestQueue=getRequestQueue();

    }

    public static synchronized VolleySingleton getInstance(Context context){
        if(volleySingleton==null){

            volleySingleton= new VolleySingleton(context);
        }

        return volleySingleton;
    }

    public RequestQueue getRequestQueue(){
        if(requestQueue==null){
            requestQueue = Volley.newRequestQueue(context.getApplicationContext());
        }
        return requestQueue;
    }


    public <T> void addToRequestQueue(Request<T> req,String tag) {
        req.setTag(TextUtils.isEmpty(tag) ? TAG : tag);
        getRequestQueue().add(req);
    }

}
