package com.moringaschool.eathealthy;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import butterknife.BindView;
import butterknife.ButterKnife;

public class Recipe extends AppCompatActivity {
    @BindView(R.id.listView) ListView mListView ;
    @BindView(R.id.RecipeTextView) TextView mRecipeTextView;

    private String [] recipes = new String[] {"Cooking rice" , "Cooking chicken ", "Making eggs" , "Cooking beef"};

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recipes);
        ButterKnife.bind(this);

        ArrayAdapter adapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, recipes);
        mListView.setAdapter(adapter);

        mListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                String recipes = ((TextView)view).getText().toString();
                Toast.makeText(Recipe.this, recipes, Toast.LENGTH_LONG).show();
            }
        });

        Intent intent = getIntent();
        String recipes = intent.getStringExtra("recipes");
        mRecipeTextView.setText("These are some of the recipes :" + recipes);


    }

}