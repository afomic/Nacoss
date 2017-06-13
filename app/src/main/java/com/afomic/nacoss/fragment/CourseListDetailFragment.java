package com.afomic.nacoss.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ExpandableListView;
import android.widget.ImageView;
import android.widget.ListView;

import com.afomic.nacoss.R;
import com.afomic.nacoss.adapter.CourseListAdapter;
import com.afomic.nacoss.data.Constants;

/**
 * Created by afomic on 22-Oct-16.
 *
 */
public class CourseListDetailFragment extends Fragment {
    int level,option;
    public static CourseListDetailFragment getInstance(int option,int level){
        CourseListDetailFragment fragment=new CourseListDetailFragment();
        Bundle arg=new Bundle();
        arg.putInt(Constants.OPTION, option);
        arg.putInt(Constants.LEVEL,level);
        fragment.setArguments(arg);
        return fragment;

    }


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Bundle arg=getArguments();
        option=arg.getInt(Constants.OPTION);
        level=arg.getInt(Constants.LEVEL);
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View v=inflater.inflate(R.layout.course_list_detail,container,false);
        ExpandableListView courseList=(ExpandableListView) v.findViewById(R.id.course_list);
        // create two adapter for each of the list
        CourseListAdapter adapter=new CourseListAdapter(getActivity(),level,option);
        //set the adapter to each of the list view
        courseList.setAdapter(adapter);
        return v;
    }
}
