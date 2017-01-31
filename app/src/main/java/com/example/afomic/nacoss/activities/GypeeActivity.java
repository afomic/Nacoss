package com.example.afomic.nacoss.activities;


import android.os.Bundle;
import android.preference.Preference;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.widget.Toast;

import com.example.afomic.nacoss.R;
import com.example.afomic.nacoss.data.Constants;
import com.example.afomic.nacoss.data.PreferenceManager;
import com.example.afomic.nacoss.fragment.GypeeCalculateFragment;
import com.example.afomic.nacoss.fragment.GypeeResultFragment;
import com.example.afomic.nacoss.fragment.SetPasswordDialog;

/**
 * Created by afomic on 19-Oct-16.
 *
 */
public class GypeeActivity extends AppCompatActivity implements GypeeCalculateFragment.Callback {
    FragmentManager fm;
    Fragment fragment;
    int option,semester,level,totalPoint,totalUnit;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.gypee_activity);
        Toolbar toolbar=(Toolbar)findViewById(R.id.gypee_toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        Bundle bundle=getIntent().getExtras();
        option=bundle.getInt(Constants.OPTION, 0);
        semester=bundle.getInt(Constants.SEMESTER, 1);
        level=bundle.getInt(Constants.LEVEL, 1);
        totalUnit=bundle.getInt(Constants.TOTAL_UNIT,0);
        totalPoint=bundle.getInt(Constants.TOTAL_POINT, 0);
        fm=getSupportFragmentManager();
        fragment=fm.findFragmentById(R.id.gypee_container);
        if(fragment==null){
            GypeeCalculateFragment fragment1=GypeeCalculateFragment.getInstance(level,semester,option,totalPoint,totalUnit);
            fm.beginTransaction().add(R.id.gypee_container,fragment1).commit();
        }

    }

    @Override
    public void onDoneClick(int semester, int level, int option, double totalPoint, double totalUnit, double previousPoint, double previousUnit, String cgpa, String gpa) {
        GypeeResultFragment fragment1=GypeeResultFragment.getInstance(level,semester,previousPoint,previousUnit,totalPoint,totalUnit,option,gpa,cgpa);
        this.totalUnit=(int) totalUnit;
        this.totalPoint=(int) totalPoint;
        this.semester=semester;
        this.level=level;
        fm.beginTransaction().replace(R.id.gypee_container,fragment1).commit();
    }



}
