package talentica.com.booksharingapp.data.network;

public interface Authentication extends BaseURL {



    //for authenticate operations
    String API_MODULE_AUTHENTICATE = API_BASE_URL + API_SEPERATOR+"authenticate/";
    String API_AUTHENTICATE_LOGIN = API_MODULE_AUTHENTICATE+"login";
    String API_AUTHENTICATE_LOGOUT = API_MODULE_AUTHENTICATE+"logout";
}
