package com.moringaschool.eathealthy.network;

import com.moringaschool.eathealthy.models.YelpBusinessesSearchResponse;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface YelpApi {
        @GET("businesses/search")
        Call<YelpBusinessesSearchResponse> getRecipe(
                @Query("location") String location,
                @Query("term") String term
        );
    }
