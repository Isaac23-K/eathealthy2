package com.moringaschool.eathealthy;

import android.content.Context;
import android.widget.ArrayAdapter;

public class RecipeArrayAdapter extends ArrayAdapter {
    private Context mContext;
    private String[] mRecipes;


    public RecipeArrayAdapter(Context mContext, int resource, String[] mRecipes) {
        super(mContext, resource);
        this.mContext = mContext ;
        this.mRecipes = mRecipes ;

    }
    @Override
    public Object getItem (int position ){
        String recipes = mRecipes [position];
        return String.format("%s \nServes great: %s",recipes);
    }
    @Override
    public int getCount(){
        return mRecipes.length;
    }
}
