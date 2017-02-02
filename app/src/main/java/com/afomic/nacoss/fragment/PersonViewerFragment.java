package com.afomic.nacoss.fragment;

import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.Toast;

import com.afomic.nacoss.R;
import com.afomic.nacoss.activities.ExcoViewerActivity;
import com.afomic.nacoss.activities.LecturerDetail;
import com.afomic.nacoss.adapter.PersonAdapter;
import com.afomic.nacoss.data.Constants;
import com.afomic.nacoss.util.GridSpacingItemDecoration;

/**
 * Created by afomic on 17-Oct-16.
 */
public class PersonViewerFragment extends Fragment {
    RecyclerView grid;
    String type;

    public static PersonViewerFragment getInstance(String type){
        PersonViewerFragment fragment=new PersonViewerFragment();
        Bundle arg=new Bundle();
        arg.putString(Constants.TYPE,type);
        fragment.setArguments(arg);
        return fragment;
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        type=getArguments().getString(Constants.TYPE);
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.person_viewer,container,false);
        grid=(RecyclerView) view.findViewById(R.id.person_grid);
        int screenWidth= getResources().getConfiguration().screenWidthDp;

        if(screenWidth<=320){
            RecyclerView.LayoutManager mLayoutManager = new GridLayoutManager(getActivity(), 2);
            grid.setLayoutManager(mLayoutManager);
            grid.addItemDecoration(new GridSpacingItemDecoration(2, dpToPx(5), true));
        } else if( screenWidth>320&&screenWidth<600){
            Toast.makeText(getActivity(),"Screen width: 0"+screenWidth,Toast.LENGTH_SHORT).show();
            RecyclerView.LayoutManager mLayoutManager = new GridLayoutManager(getActivity(),3);
            grid.addItemDecoration(new GridSpacingItemDecoration(3, dpToPx(5), true));
            grid.setLayoutManager(mLayoutManager);
        }else if(screenWidth>=600&&screenWidth<800){
            RecyclerView.LayoutManager mLayoutManager = new GridLayoutManager(getActivity(),4);
            grid.setLayoutManager(mLayoutManager);
            grid.addItemDecoration(new GridSpacingItemDecoration(4, dpToPx(5), true));
        }else{
            RecyclerView.LayoutManager mLayoutManager = new GridLayoutManager(getActivity(),5);
            grid.setLayoutManager(mLayoutManager);
            grid.addItemDecoration(new GridSpacingItemDecoration(4, dpToPx(5), true));
        }



        grid.setItemAnimator(new DefaultItemAnimator());


        final PersonAdapter adapter=new PersonAdapter(getContext(),type);
        grid.setAdapter(adapter);

        return view;
    }
    private int dpToPx(int dp) {
        Resources r = getResources();
        return Math.round(TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, dp, r.getDisplayMetrics()));
    }
}
