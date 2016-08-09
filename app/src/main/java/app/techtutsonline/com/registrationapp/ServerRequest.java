package app.techtutsonline.com.registrationapp;

/**
 * Created by surender on 08-08-2016.
 */
public class ServerRequest {
    private String operation;
    private User user;

    public void setOperation(String operation) {
        this.operation = operation;
    }

    public void setUser(User user) {
        this.user = user;
    }
}