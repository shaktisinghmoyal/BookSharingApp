package talentica.com.booksharingapp.data.network;



public interface UserCRUDOperation extends BaseURL {

    //for user crud  operation
    String API_CREATE_USER = API_BASE_URL+API_SEPERATOR+"user";
    String API_RETRIEVE_USERS = API_BASE_URL+API_SEPERATOR+"users";
    String API_DELETE_USER_BY_ID  = API_BASE_URL+API_SEPERATOR+"user/id";
    String API_USER_DETAIL_BY_ID = API_DELETE_USER_BY_ID;
    String API_UPDATE_USER_BY_ID  = API_DELETE_USER_BY_ID;
    String API_DELETE_USER_BY_USERNAME  = API_BASE_URL+API_SEPERATOR+"user/username";
    String API_USER_DETAIL_BY_USERNAME = API_DELETE_USER_BY_USERNAME;
    String API_UPDATE_USER_BY_USERNAME  = API_DELETE_USER_BY_USERNAME;




}
