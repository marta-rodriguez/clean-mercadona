package marta.rodriguez.mercadonaapp.mercadona.api;

import java.util.List;

import marta.rodriguez.mercadonaapp.mercadona.Constants;
import marta.rodriguez.mercadonaapp.mercadona.model.Supermarket;
import retrofit.RestAdapter;
import retrofit.http.GET;
import retrofit.http.Path;

/**
 * Created by marta.rodriguez on 28/05/14.
 */
public class ApiaryClient {

    private static SupermarketsApiInterface sSupermarketsService;

    public static SupermarketsApiInterface getSupermarketsApiClient() {
        if (sSupermarketsService == null) {
            RestAdapter restAdapter = new RestAdapter.Builder()
                    .setEndpoint(Constants.API_URL)
                    .setLogLevel(RestAdapter.LogLevel.FULL)
                    .build();

            sSupermarketsService = restAdapter.create(SupermarketsApiInterface.class);
        }

        return sSupermarketsService;
    }

    public interface SupermarketsApiInterface {
        @GET("/supermarkets/{province}")
        List<Supermarket> getSupermarkets(@Path("province") String province);
    }
}