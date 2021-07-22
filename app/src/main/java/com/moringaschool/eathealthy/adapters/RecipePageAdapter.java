package com.moringaschool.eathealthy.adapters;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import com.moringaschool.eathealthy.models.Hit;
import com.moringaschool.eathealthy.ui.RecipeDetailFragment;

import org.jetbrains.annotations.NotNull;

import java.util.List;

public class RecipePageAdapter extends FragmentPagerAdapter {
    private List<Hit> mRecipes ;

    public RecipePageAdapter(@NonNull  FragmentManager fm, int behavior,List<Hit> recipes) {
        super(fm, behavior);
        mRecipes = recipes ;
    }

    @Override
    public Fragment getItem(int position) {
        return RecipeDetailFragment.newInstance(mRecipes.get(position));
    }

    @Override
    public int getCount() {
        return mRecipes.size();
    }

@Override
    public CharSequence getPageTitle(int position){
        return mRecipes.get(position).getRecipe().getLabel();
}
}
