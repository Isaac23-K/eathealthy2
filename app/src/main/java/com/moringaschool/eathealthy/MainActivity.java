package com.moringaschool.eathealthy;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.moringaschool.eathealthy.R;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    // @BindView(R.id.appNameTextView) TextView mAppNameTextView;
    @BindView(R.id.findRecipesButton)
    Button mFindsRecipesButton;
    @BindView(R.id.RecipeEditText)
    EditText mRecipeEditText;
    @BindView(R.id.contactsButton)
    Button mContactsButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

        mFindsRecipesButton.setOnClickListener(this);
        mContactsButton.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        if (v == mFindsRecipesButton) {
            String recipes = mRecipeEditText.getText().toString();
            Intent intent = new Intent(MainActivity.this, Recipe.class);
            intent.putExtra("recipes", recipes);
            startActivity(intent);
            Toast.makeText(MainActivity.this, recipes, Toast.LENGTH_SHORT).show();
        } else if (v == mContactsButton){
            Intent intent = new Intent(MainActivity.this, Contacts.class);
            startActivity(intent);
        }
    }



//    @Override
//    public boolean onCreateOptionsMenu(Menu menu) {
//        MenuInflater inflater = getMenuInflater();
//        inflater.inflate(R.menu.menu_root, menu);
//        return true;
//    }
}