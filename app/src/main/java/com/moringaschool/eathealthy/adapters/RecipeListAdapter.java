package com.moringaschool.eathealthy.adapters;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import com.moringaschool.eathealthy.R;
import com.moringaschool.eathealthy.models.Business;
import com.squareup.picasso.Picasso;

import org.parceler.Parcels;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;



public class RecipeListAdapter extends RecyclerView.Adapter<RecipeListAdapter.RecipeViewHolder> {
    private List<Business> mRecipes;
    private Context mContext;


    public RecipeListAdapter(List<Business> recipes, Context mContext) {
        this.mRecipes = recipes;
        this.mContext = mContext;
    }


    @Override
    public RecipeListAdapter.RecipeViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.recipe_list_item, parent, false);
        RecipeViewHolder viewHolder = new RecipeViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(RecipeViewHolder holder, int position) {
        holder.bindRecipe(mRecipes.get(position));

    }

    @Override
    public int getItemCount() {
        return mRecipes.size();
    }

    public class RecipeViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener{
        public TextView mRecipeTextView;
        @BindView(R.id.recipeImageView) ImageView mRecipeImageView;
        @BindView(R.id.recipeNameTextView) TextView mNameTextView;
       // @BindView(R.id.cuisineTypeTextView) TextView isaacCuisineType;
        @BindView(R.id.categoryTextView) TextView mCategoryTextView ;


        private Context mContext;

        public RecipeViewHolder(View itemView){
            super(itemView);
            ButterKnife.bind(this,itemView);
            mContext=itemView.getContext();
            itemView.setOnClickListener(this);


        }
        public void bindRecipe(Business recipe){
            Picasso.get().load(recipe.getImageUrl()).into(mRecipeImageView);
           mNameTextView.setText(recipe.getName());
           mCategoryTextView.setText(recipe.getCategories().get(0).getTitle());
           // isaacCuisineType.setText("Source: "+recipe.getRecipe().getSource());

        }

        @Override
        public void onClick(View v) {

        }

//        @Override
//        public void onClick(View v) {
//
//            int itemPosition = getLayoutPosition();
//            Intent intent = new Intent(mContext, RecipeDetailActivity.class);
//            intent.putExtra("position", itemPosition);
//            intent.putExtra("newHits", Parcels.wrap(adapterHits));
//            mContext.startActivity(intent);
//        }
    }

}
