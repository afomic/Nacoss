package com.example.afomic.nacoss.activities;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;

import com.example.afomic.nacoss.R;
import com.example.afomic.nacoss.data.Constants;
import com.example.afomic.nacoss.fragment.CourseListDetailFragment;

/**
 * Created by afomic on 22-Oct-16.
 */
public class CourseListActivity extends AppCompatActivity{
    ViewPager pager;
    Toolbar toolbar;
    int level,option;
    String[] title={"Electives","Part One","Part Two","Part Three","Part Four","Part Five"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.single_activity_layout);
        FragmentManager fm=getSupportFragmentManager();
        toolbar=(Toolbar)findViewById(R.id.pager_toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        pager=(ViewPager)findViewById(R.id.single_pager);

        //get the data sent from the course list Fragment
        Bundle passedData=getIntent().getExtras();
        level=passedData.getInt(Constants.LEVEL);
        option=passedData.getInt(Constants.OPTION);
        setTitle(title[level]);

        pager.setAdapter(new FragmentPagerAdapter(fm) {
            @Override
            public Fragment getItem(int position) {
                return CourseListDetailFragment.getInstance(option,position);
            }

            @Override
            public int getCount() {
                return 6;
            }
        });
        pager.setOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

            }

            @Override
            public void onPageSelected(int position) {
                setTitle(title[position]);
            }

            @Override
            public void onPageScrollStateChanged(int state) {

            }
        });
        pager.setCurrentItem(level);


    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if(item.getItemId()==android.R.id.home){
            finish();
        }
        return true;
    }

}
