package com.moringaschool.eathealthy.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import com.moringaschool.eathealthy.R;
import com.moringaschool.eathealthy.models.Hit;
import com.moringaschool.eathealthy.ui.Recipe;
import com.squareup.picasso.Picasso;

import butterknife.BindView;
import butterknife.ButterKnife;

import java.util.List;

public class RecipeListAdapter extends RecyclerView.Adapter<RecipeListAdapter.RecipeViewHolder> {
    private List<Hit> mHits;
    private Context mContext;

    public RecipeListAdapter (Context context, List<Hit>hits){
        mContext = context ;
        mHits = hits;

    }
    @Override
    public RecipeListAdapter.RecipeViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.activity_recipes, parent, false);
        RecipeViewHolder viewHolder = new RecipeViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(RecipeListAdapter.RecipeViewHolder holder, int position) {
    holder.bindRecipe(mHits.get(position));
    }

    @Override
    public int getItemCount() {
        return mHits.size();
    }

    public class RecipeViewHolder extends RecyclerView.ViewHolder{
//        @BindView(R.id.ImageView)
//        ImageView mRestaurantImageView;
//        @BindView(R.id.restaurantNameTextView)
//        TextView mNameTextView;
//        @BindView(R.id.categoryTextView) TextView mCategoryTextView;
//        @BindView(R.id.ratingTextView) TextView mRatingTextView;
            private Context mContext;


        public RecipeViewHolder(View itemView) {
            super(itemView);
            ButterKnife.bind(this,itemView);
            mContext = itemView.getContext();
        }

public void bindRecipe(Hit recipe){
   // Picasso.get().load(recipe.getImageUrl()).into();
}
    }
}
