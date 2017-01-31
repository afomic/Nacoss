package com.example.afomic.nacoss.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentStatePagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;

import com.example.afomic.nacoss.R;
import com.example.afomic.nacoss.activities.MainActivity;

/**
 * Created by afomic on 13-Dec-16.
 * this is the fragment with hold all the
 */

public class HomeFragment extends Fragment {
    AppCompatActivity act;
    String[] title={"Profiles","TimeTable","Constitution","Gypee","Course List"};
    public static HomeFragment newInstance(){
        return new HomeFragment();
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        setHasOptionsMenu(true);
        super.onCreate(savedInstanceState);
        setRetainInstance(true);
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v=inflater.inflate(R.layout.home_layout,container,false);
        TabLayout mTabLayout=(TabLayout)v.findViewById(R.id.home_tab_layout);
        ViewPager pager=(ViewPager)v.findViewById(R.id.home_pager);
        Toolbar mToolbar=(Toolbar) v.findViewById(R.id.main_toolbar);
        act=(AppCompatActivity) getActivity();
        act.setSupportActionBar(mToolbar);
        // set up the ham burger icon
        act.getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        act.getSupportActionBar().setHomeAsUpIndicator(R.drawable.ic_hamburger);
        act.getSupportActionBar().setTitle("Home");
        //add executives detail profile fragment to the main activity
        pager.setAdapter(new FragmentStatePagerAdapter(getFragmentManager()) {
            @Override
            public Fragment getItem(int position) {
                act.supportInvalidateOptionsMenu();
                switch (position){
                    case 0:
                        return new ProfileFragment();
                    case 1:
                        return TimeTableFragment.getInstance();
                    case 2:
                        return ConstitutionFragment.getInstance();
                    case 3:
                        return GypeeFragment.getInstance();
                    case 4:
                        return CourseListFragment.getInstance();
                    default:
                        return null;
                }
            }

            @Override
            public int getCount() {
                return 5;
            }

            @Override
            public CharSequence getPageTitle(int position) {
                return title[position];
            }
        });
        mTabLayout.setupWithViewPager(pager);
        return v;
    }


}
