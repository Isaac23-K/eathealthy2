package com.moringaschool.eathealthy.ui;

import android.content.Intent;
import android.os.Bundle;
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

    // Works on Views .
    @BindView(R.id.progressBar)
    ProgressBar mProgressBar;
    @BindView(R.id.errorTextView)
    TextView mErrorTextView;
    @BindView(R.id.recyclerView)
    RecyclerView mRecyclerView;
    @BindView(R.id.RecipeTextView)
    TextView mRecipeTextView;

    private RecipeListAdapter mAdapter;
    public List<Hit> hits;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recipes);
        ButterKnife.bind(this);

        Intent intent = getIntent();
        String recipes = intent.getStringExtra("recipes");

        RecipeApi client = RecipeClient.getClient();

        Call<RecipeSearch> call = client.getRecipe("recipes");

        call.enqueue(new Callback<RecipeSearch>() {
            @Override
            public void onResponse(retrofit2.Call<RecipeSearch> call, Response<RecipeSearch> response) {
                hideProgressBar();
                if (response.isSuccessful()) {
                    List<Hit> recipes = response.body().getHits();
                    recipes = response.body().getHits();
                    mAdapter = new RecipeListAdapter(Recipe.this, hits);
                    mRecyclerView.setAdapter(mAdapter);
                    RecyclerView.LayoutManager layoutManager =
                            new LinearLayoutManager(Recipe.this);
                    mRecyclerView.setLayoutManager(layoutManager);
                    mRecyclerView.setHasFixedSize(true);

                    showRecipes();
                } else {
                    showUnsuccessfulMessage();
                }
            }

            @Override
            public void onFailure(retrofit2.Call<RecipeSearch> call, Throwable t) {
                hideProgressBar();
                showFailureMessage();
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