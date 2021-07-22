package com.moringaschool.eathealthy.ui;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;
import android.os.Parcel;

import com.moringaschool.eathealthy.R;
import com.moringaschool.eathealthy.adapters.RecipePageAdapter;
import com.moringaschool.eathealthy.models.Hit;

import org.parceler.Parcels;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

public class RecipeDetailActivity extends AppCompatActivity {
    @BindView(R.id.viewPager) ViewPager mViewPager ;
    private RecipePageAdapter adapterViewPager ;
    List<Hit> mRecipes ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recipe_detail);
        ButterKnife.bind(this);

        mRecipes = Parcels.unwrap(getIntent().getParcelableExtra("newHits"));
        int startingPosition = getIntent().getIntExtra("position",0);

        adapterViewPager = new RecipePageAdapter(getSupportFragmentManager(), FragmentPagerAdapter.BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT,mRecipes);
        mViewPager.setAdapter(adapterViewPager);
        mViewPager.setCurrentItem(startingPosition);
    }
}