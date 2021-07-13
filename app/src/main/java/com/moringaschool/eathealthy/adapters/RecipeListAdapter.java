package com.moringaschool.eathealthy.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.recyclerview.widget.RecyclerView;

import com.moringaschool.eathealthy.R;
import com.moringaschool.eathealthy.ui.Recipe;

import java.util.List;

public class RecipeListAdapter extends RecyclerView.Adapter<RecipeListAdapter.RecipeViewHolder> {
    private List<Recipe>mRecipe;
    private Context mContext;

    public RecipeListAdapter (Context context, List<Recipe>recipe){
        mContext = context ;
        mRecipe = recipe ;

    }
    @Override
    public RecipeListAdapter.RecipeViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.activity_recipes, parent, false);
        RecipeViewHolder viewHolder = new RecipeViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(RecipeListAdapter.RecipeViewHolder holder, int position) {
    holder.bindRecipe(mRecipe.get(position));
    }

    @Override
    public int getItemCount() {
        return mRecipe.size();
    }
}
