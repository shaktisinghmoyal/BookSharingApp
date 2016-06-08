package talentica.com.booksharingapp.data.network;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;

import talentica.com.booksharingapp.presentation.BookApplication;

public interface BaseURL {
    String API_BASE_URL = "http://ec2-52-38-174-68.us-west-2.compute.amazonaws.com:3000/api";
    String API_SEPERATOR="/";


}
