package es.estech.ejemploretrofit.API;

import es.estech.ejemploretrofit.Model.PokemonFeed;
import retrofit2.Call;
import retrofit2.http.GET;

public interface RestClient {
    @GET("pokemon")
    Call<PokemonFeed> getData();
}
