package com.moringaschool.eathealthy.ui;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.moringaschool.eathealthy.Constants;
import com.moringaschool.eathealthy.R;
import com.moringaschool.eathealthy.RecipeArrayAdapter;
import com.moringaschool.eathealthy.adapters.RecipeListAdapter;
import com.moringaschool.eathealthy.models.Hit;
import com.moringaschool.eathealthy.models.RecipeSearch;
import com.moringaschool.eathealthy.network.RecipeApi;
import com.moringaschool.eathealthy.network.RecipeClient;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class Recipe extends AppCompatActivity {

    private static final String TAG = Recipe.class.getSimpleName();
    // Works on Views .
    @BindView(R.id.progressBar) ProgressBar mProgressBar;
    @BindView(R.id.errorTextView) TextView mErrorTextView;
    @BindView(R.id.recyclerView) RecyclerView mRecyclerView;
   // @BindView(R.id.RecipeTextView) TextView mRecipeTextView;

    private RecipeListAdapter mRecipeListAdapter;
    private List<Hit> recipeDetails;
   // private String mRecentSearch;
   // private SharedPreferences mSharedPreferences;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recipes);
        ButterKnife.bind(this);
        Intent intent = getIntent();
        Log.e("TAG","after intent");



        String recipe = intent.getStringExtra("recipes");


        RecipeApi client = RecipeClient.getClient();
        Call<RecipeSearch> call = client.getRecipe(recipe, "02acd894", "1e6f185f777cbd377b4d8be8552a80aa");
        Log.e("TAG","after call");
        call.enqueue(new Callback<RecipeSearch>() {
            @Override
            public void onResponse(Call<RecipeSearch> call, Response<RecipeSearch> response) {
                hideProgressBar();
                Log.e("TAG","Inside onResponse");
                if (response.isSuccessful()){
                    recipeDetails = response.body().getHits();
                    mRecipeListAdapter = new RecipeListAdapter(recipeDetails,Recipe.this);
                    mRecyclerView.setAdapter(mRecipeListAdapter);
                    RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(Recipe.this);
                    mRecyclerView.setLayoutManager(layoutManager);
                    mRecyclerView.setHasFixedSize(true);
                    Log.e(TAG, "onResponse :" + recipeDetails );
                    showRecipes();
                } else {
                    showFailureMessage();
                }
            }

            @Override
            public void onFailure(Call<RecipeSearch> call, Throwable t) {
            hideProgressBar();
            showUnsuccessfulMessage();
            Log.e(TAG, "onFailure : failing terribly", t);
            }
        });
    }
    private void showFailureMessage() {
        mErrorTextView.setText("Something went wrong. Please check your Internet connection and try again later");
        mErrorTextView.setVisibility(View.VISIBLE);
    }

    private void showUnsuccessfulMessage() {
        mErrorTextView.setText("Something went wrong. Please try again later");
        mErrorTextView.setVisibility(View.VISIBLE);
    }

    private void showRecipes() {
        mRecyclerView.setVisibility(View.VISIBLE);
    }

    private void hideProgressBar() {
        mProgressBar.setVisibility(View.GONE);
    }
}