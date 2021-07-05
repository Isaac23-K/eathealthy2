package com.moringaschool.eathealthy;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    // @BindView(R.id.appNameTextView) TextView mAppNameTextView;
    @BindView(R.id.findRecipesButton)
    Button mFindsRecipesButton;
    @BindView(R.id.RecipeEditText)
    EditText mRecipeEditText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

        mFindsRecipesButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String recipes = mRecipeEditText.getText().toString();
                Intent intent = new Intent(MainActivity.this, Recipe.class);
                intent.putExtra("recipes", recipes);
                startActivity(intent);
            }
        });
    }

    @Override
    public void onClick(View v) {
        if (v == mFindsRecipesButton) {
            String recipes = mRecipeEditText.getText().toString();
            Intent intent = new Intent(MainActivity.this, Recipe.class);
            intent.putExtra("recipes", recipes);
            startActivity(intent);
            Toast.makeText(MainActivity.this, recipes, Toast.LENGTH_SHORT).show();

        }
    }
//    @Override
//    public boolean onCreateOptionsMenu(Menu menu) {
//        MenuInflater inflater = getMenuInflater();
//        inflater.inflate(R.menu.menu_root, menu);
//        return true;
//    }
}