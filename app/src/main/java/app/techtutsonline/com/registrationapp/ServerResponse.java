package app.techtutsonline.com.registrationapp;

/**
 * Created by surender on 08-08-2016.
 */
public class ServerResponse {
    private String result;
    private String message;
    private User user;

    public String getResult() {
        return result;
    }

    public String getMessage() {
        return message;
    }

    public User getUser() {
        return user;
    }
}