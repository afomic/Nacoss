package com.afomic.nacoss.activities;

import android.graphics.Color;
import android.graphics.Typeface;
import android.os.Bundle;

import android.os.PersistableBundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.Gravity;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import com.afomic.nacoss.R;
import com.afomic.nacoss.adapter.navAdapter;
import com.afomic.nacoss.data.Constants;
import com.afomic.nacoss.data.GypeeCourseData;
import com.afomic.nacoss.fragment.AboutFragment;
import com.afomic.nacoss.fragment.FeedbackFragment;
import com.afomic.nacoss.fragment.HelpFragment;
import com.afomic.nacoss.fragment.HomeFragment;

public class MainActivity extends AppCompatActivity {
    FragmentManager fm;
    DrawerLayout drawerLayout;
    ListView navBar;
    LinearLayout layout;
    int privPosition;
    navAdapter adapter;
    boolean firstRun=true;
    int pos=0;
    int[] imageId={R.drawable.home,R.drawable.help,R.drawable.feedback,R.drawable.about};

    int[] pink={R.drawable.home_click,R.drawable.help_blue,R.drawable.feedback_click,R.drawable.info_pink};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Typeface roboto = Typeface.createFromAsset(getAssets(),"font/Lato-Regular.ttf");
        setContentView(R.layout.activity_main);
        GypeeCourseData.addData(this);
        drawerLayout=(DrawerLayout) findViewById(R.id.home);

        fm=getSupportFragmentManager();
        Fragment fragment=fm.findFragmentById(R.id.main_container);
        if(fragment==null){
            HomeFragment frag=HomeFragment.newInstance();
            fm.beginTransaction().add(R.id.main_container,frag).commit();
        }
        if(savedInstanceState!=null){
            pos=savedInstanceState.getInt(Constants.POSITION);
        }


        //initialize the drawer layout

        navBar=(ListView) findViewById(R.id.nav_list);
        adapter=new navAdapter(this);
        navBar.setAdapter(adapter);

        navBar.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                View v;
                ImageView icon;
                TextView navText;
                int firstCompletelyVisiblePos = navBar.getFirstVisiblePosition();
                if(firstRun){
                    layout=(LinearLayout)navBar.getChildAt(firstCompletelyVisiblePos);
                    firstRun=false;
                }

                if (layout != null) {
                    v = layout.getChildAt(0);
                    icon = (ImageView) layout.getChildAt(1);
                    navText = (TextView) layout.getChildAt(2);
                    v.setBackgroundColor(Color.WHITE);
                    icon.setImageResource(imageId[privPosition]);
                    navText.setTextColor(Color.GRAY);
                }
                privPosition = position;
                layout = (LinearLayout) view;
                v = layout.getChildAt(0);
                icon = (ImageView) layout.getChildAt(1);
                navText = (TextView) layout.getChildAt(2);
                v.setBackgroundColor(Color.argb(255,3, 169,244));
                icon.setImageResource(pink[position]);
                navText.setTextColor(Color.argb(255, 3,169, 244));
                supportInvalidateOptionsMenu();
                pos=position;
                switch (position) {
                    case 0:
                        HomeFragment fragment = HomeFragment.newInstance();
                        displayFragment(fragment);
                        break;
                    case 1:
                        HelpFragment fra=HelpFragment.newInstance();
                        displayFragment(fra);
                        break;
                    case 2:
                        FeedbackFragment fee=FeedbackFragment.newInstance();
                        displayFragment(fee);
                        break;
                    case 3:
                        AboutFragment about=AboutFragment.newInstance();
                        displayFragment(about);
                        break;

                }
            }
        });
        TextView team=(TextView) findViewById(R.id.team);
        team.setTypeface(roboto);


    }
    public void displayFragment(Fragment frag){
        drawerLayout.closeDrawers();
        Fragment fragment=fm.findFragmentById(R.id.main_container);
        if(fragment==null){
            fm.beginTransaction().add(R.id.main_container, frag).commit();
        }else {
            fm.beginTransaction().replace(R.id.main_container,frag).commit();
        }

    }

    @Override
    public boolean onPrepareOptionsMenu(Menu menu) {
        if(pos!=0){
            menu.clear();
        }
        return false;
    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putInt(Constants.POSITION,pos);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if(item.getItemId()==android.R.id.home){
            drawerLayout.openDrawer(Gravity.LEFT);
        }
        return false;
    }
}
