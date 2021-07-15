package com.moringaschool.eathealthy.ui;

import android.content.Intent;
import android.os.Bundle;
import android.telecom.Call;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.moringaschool.eathealthy.R;
import com.moringaschool.eathealthy.adapters.RecipeListAdapter;
import com.moringaschool.eathealthy.models.Hit;
import com.moringaschool.eathealthy.models.RecipeSearch;
import com.moringaschool.eathealthy.network.RecipeApi;
import com.moringaschool.eathealthy.network.RecipeClient;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import retrofit2.Callback;
import retrofit2.Response;

public class Recipe extends AppCompatActivity {
    @BindView(R.id.listView) ListView mListView ;
    @BindView(R.id.RecipeTextView) TextView mRecipeTextView;

    //private String [] recipes = new String[] {"Cooking rice" , "Cooking chicken ", "Making eggs" , "Cooking beef"};

    private RecipeListAdapter mAdapter ;

    public List<Hit> recipeDetails;

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recipes);
        ButterKnife.bind(this);

        Intent intent = getIntent();
        String recipes = intent.getStringExtra("recipes");

        RecipeApi client = RecipeClient.getClient();

        Call<RecipeSearch> call = client.getRecipe(recipes, "recipes");

        call.enqueue(new Callback<RecipeSearch>() {
            @Override
            public void onResponse(retrofit2.Call<RecipeSearch> call, Response<RecipeSearch> response) {
                //hideProgressBar();
                if (response.isSuccessful()){
                    recipeDetails = response.body().getHits();
                    mAdapter = new RecipeListAdapter(recipeDetails,Recipe.this);
//                    mRecyclerView.setAdapter(mAdapter);
//                    RecyclerView.LayoutManager layoutManager =
//                            new LinearLayoutManager(RestaurantsActivity.this);
//                    mRecyclerView.setLayoutManager(layoutManager);
//                    mRecyclerView.setHasFixedSize(true);

                   // showRestaurants();
                } else {
                  //  showUnsuccessfulMessage();
                }
            }
            @Override
            public void onFailure(retrofit2.Call<RecipeSearch> call, Throwable t) {
           // hideProgressBar();
             //   showFailureMessage();
            }
        });

//        private void showFailureMessage() {
//            mErrorTextView.setText("Something went wrong. Please check your Internet connection and try again later");
//            mErrorTextView.setVisibility(View.VISIBLE);
//        }
//
//        private void showUnsuccessfulMessage() {
//            mErrorTextView.setText("Something went wrong. Please try again later");
//            mErrorTextView.setVisibility(View.VISIBLE);
//        }

//        ArrayAdapter adapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, recipes);
//        mListView.setAdapter(adapter);
//
//        mListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
//            @Override
//            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
//                String recipes = ((TextView)view).getText().toString();
//                Toast.makeText(Recipe.this, recipes, Toast.LENGTH_LONG).show();
//            }
//        });

//        Intent intent = getIntent();
//        String recipes = intent.getStringExtra("recipes");

  //      mRecipeTextView.setText("These are some of the recipes :" + recipes);


    }

}