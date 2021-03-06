package com.afomic.nacoss.fragment;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ExpandableListView;

import com.afomic.nacoss.R;
import com.afomic.nacoss.activities.CourseListActivity;
import com.afomic.nacoss.adapter.ExpendableListAdapter;
import com.afomic.nacoss.data.Constants;

/**
 * Created by afomic on 18-Oct-16.
 *
 */
public class CourseListFragment extends Fragment {
    ExpendableListAdapter adapter;
    ExpandableListView courseList;
    public static CourseListFragment getInstance(){
        CourseListFragment fragment=new CourseListFragment();
        return fragment;
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        setHasOptionsMenu(true);
        //inflate the courselist layout
        View v=inflater.inflate(R.layout.course_list_home,container,false);

        //creating an adapter for the expandable list view
        adapter= new ExpendableListAdapter(getContext());

        //initialize the expendable list view that will show the list of courses in each level
        courseList=(ExpandableListView)v.findViewById(R.id.exp_course_list);

        //set the adapater to control the expandable list view
        courseList.setAdapter(adapter);

        courseList.setOnChildClickListener(new ExpandableListView.OnChildClickListener() {
            @Override
            public boolean onChildClick(ExpandableListView parent, View v, int groupPosition, int childPosition, long id) {
                Intent intent=new Intent(getActivity(), CourseListActivity.class);
                childPosition++;
                intent.putExtra(Constants.LEVEL,groupPosition);
                intent.putExtra(Constants.OPTION,childPosition);
                startActivity(intent);
                return true;
            }
        });

        courseList.setOnGroupExpandListener(new ExpandableListView.OnGroupExpandListener() {
            int previousItem = -1;

            @Override
            public void onGroupExpand(int groupPosition) {
                if(groupPosition != previousItem )
                    courseList.collapseGroup(previousItem );
                previousItem = groupPosition;
            }
        });


        return v;
    }

    @Override
    public void onCreateOptionsMenu(Menu menu, MenuInflater inflater) {
        menu.clear();
    }
}
