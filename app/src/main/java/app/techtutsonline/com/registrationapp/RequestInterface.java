package app.techtutsonline.com.registrationapp;

/**
 * Created by surender on 08-08-2016.
 */
import app.techtutsonline.com.registrationapp.ServerRequest;
import app.techtutsonline.com.registrationapp.ServerResponse;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.POST;

public interface RequestInterface {

    @POST("login-register/")
    Call<ServerResponse> operation(@Body ServerRequest request);

}