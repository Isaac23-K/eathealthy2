package com.moringaschool.eathealthy.network;

import com.moringaschool.eathealthy.models.Recipe;
import com.moringaschool.eathealthy.models.RecipeSearch;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface RecipeApi {
    @GET("search?")
    Call<RecipeSearch> getRecipe(
             @Query("q") String q,
             @Query("app_id") String app_id,
             @Query("app_key") String app_key
    );
}
