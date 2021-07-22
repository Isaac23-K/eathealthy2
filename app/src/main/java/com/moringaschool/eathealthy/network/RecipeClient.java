package com.moringaschool.eathealthy.network;


import com.moringaschool.eathealthy.Constants;

import java.io.IOException;


import okhttp3.Interceptor;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import okhttp3.logging.HttpLoggingInterceptor;


import static com.moringaschool.eathealthy.Constants.EDAMAM_BASE_URL;


public class RecipeClient {
    private static Retrofit retrofit = null;
    public static RecipeApi getClient() {
        OkHttpClient.Builder okHttpClient = new OkHttpClient.Builder();
        if (retrofit == null) {
            HttpLoggingInterceptor httpLoggingInterceptor = new HttpLoggingInterceptor();
            httpLoggingInterceptor.level(HttpLoggingInterceptor.Level.BODY);
            okHttpClient.addInterceptor(httpLoggingInterceptor);
            okHttpClient.build();
        }
            retrofit = new Retrofit
                    .Builder()
                    .baseUrl(Constants.EDAMAM_BASE_URL)
                    .client(okHttpClient.build())
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();
        return retrofit.create(RecipeApi.class);
    }
}
