package talentica.com.booksharingapp.data.network;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;

import talentica.com.booksharingapp.presentation.BookApplication;

public class BaseClassForMethods {

    boolean isThereInternetConnection() {
        boolean isConnected;

        ConnectivityManager connectivityManager =
                (ConnectivityManager) BookApplication.getAppContext().getSystemService(Context.CONNECTIVITY_SERVICE);
        NetworkInfo networkInfo = connectivityManager.getActiveNetworkInfo();
        isConnected = (networkInfo != null && networkInfo.isConnectedOrConnecting());

        return isConnected;
    }


}
