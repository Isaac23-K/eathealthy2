package com.moringaschool.eathealthy.network;

import com.moringaschool.eathealthy.models.RecipeSearch;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface RecipeApi {
    @GET("api/recipes/v2")
    Call<RecipeSearch> getRecipe(
             @Query("q") String q,
             @Query("app_id") String app_id,
             @Query("EDAMAM_API_Key") String EDAMAM_API_Key
    );

}
