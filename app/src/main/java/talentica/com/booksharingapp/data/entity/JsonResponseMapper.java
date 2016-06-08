package talentica.com.booksharingapp.data.entity;

import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.List;

public class JsonResponseMapper {

   public static boolean getStatus(JSONObject jsonObject) throws JSONException, IllegalAccessException{

       return jsonObject.getBoolean("status");
   }

    public static Book getRetrievedBook(JSONObject jsonObject) throws JSONException, IllegalAccessException{


        return new Book();
    }


    public static List<Book> getRetrievedBookList(JSONObject jsonObject) throws JSONException, IllegalAccessException{


        return new ArrayList<Book>();
    }

    public static String getBookStatus(JSONObject jsonObject) throws JSONException, IllegalAccessException{

        return "";
    }
}
