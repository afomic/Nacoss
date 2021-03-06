package com.afomic.nacoss.fragment;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.view.MenuItemCompat;
import android.support.v7.app.ActionBar;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.SearchView;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ExpandableListView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.afomic.nacoss.R;
import com.afomic.nacoss.activities.ConstitutionViewerActivity;
import com.afomic.nacoss.adapter.ConstitutionAdapter;
import com.afomic.nacoss.adapter.SearchAdapter;
import com.afomic.nacoss.data.Constants;

/**
 * Created by afomic on 17-Oct-16.
 *
 */
public class ConstitutionFragment extends Fragment {
    ExpandableListView constitutionList;
    SearchView constitutionSearch;
    LinearLayout searchLayout;
    RecyclerView constitutionSearchList;
    SearchAdapter searchAdapter;
    ConstitutionAdapter adapter;
    MenuItem item;
    public static ConstitutionFragment getInstance(){
        return new ConstitutionFragment();
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        searchAdapter=new SearchAdapter(getActivity());
        setHasOptionsMenu(true);

    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        //inflate the constitution layout
        View view  =inflater.inflate(R.layout.constitution_home,container,false);
        //initiate the list view
        searchLayout=(LinearLayout) view.findViewById(R.id.con_search_layout);
        constitutionSearchList=(RecyclerView) view.findViewById(R.id.con_search_recycler);
        constitutionList =(ExpandableListView)view.findViewById(R.id.lv_constitution);
        TextView emptyView=(TextView) view.findViewById(R.id.empty_search_view);
        adapter=new ConstitutionAdapter(getContext());
        constitutionList.setAdapter(adapter);
        //set the adapter for the searchList
        RecyclerView.LayoutManager layoutManager=new LinearLayoutManager(getActivity());
        constitutionSearchList.setLayoutManager(layoutManager);
        constitutionSearchList.setAdapter(searchAdapter);
        //setting onclick listener to each of the list


        constitutionList.setOnChildClickListener(new ExpandableListView.OnChildClickListener() {
            @Override
            public boolean onChildClick(ExpandableListView parent, View v, int groupPosition, int childPosition, long id) {
                Intent intent=new Intent(getActivity(), ConstitutionViewerActivity.class);
                intent.putExtra(Constants.SECTION,childPosition);
                intent.putExtra(Constants.ARTICLE,groupPosition);
                intent.putExtra(Constants.SIZE,adapter.getChildrenCount(groupPosition));
                startActivity(intent);
                return true;
            }
        });
        constitutionList.setOnGroupExpandListener(new ExpandableListView.OnGroupExpandListener() {
            int previousItem = -1;

            @Override
            public void onGroupExpand(int groupPosition) {
                if(groupPosition != previousItem )
                    constitutionList.collapseGroup(previousItem );
                    previousItem = groupPosition;
            }
        });
        //override on back pressed so as to return to the expandable listview when back is pressed and searchLayout is on

        return view;
    }

    @Override
    public void onCreateOptionsMenu(Menu menu, MenuInflater inflater) {
        menu.clear();
       inflater.inflate(R.menu.menu_constitution,menu);
       item =menu.findItem(R.id.menu_con_search);
        constitutionSearch=(SearchView) MenuItemCompat.getActionView(item);
        constitutionSearch.setLayoutParams(new ActionBar.LayoutParams(Gravity.RIGHT));
        constitutionSearch.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
            @Override
            public boolean onQueryTextSubmit(String query) {
                return false;
            }

            @Override
            public boolean onQueryTextChange(String newText) {
                searchLayout.setVisibility(View.VISIBLE);
                constitutionList.setVisibility(View.GONE);
                searchAdapter.setString(newText);
                return true;
            }
        });

    }

    @Override
    public void onPause() {
        if(searchLayout.isShown()){
            searchLayout.setVisibility(View.GONE);
            constitutionList.setVisibility(View.VISIBLE);
            item.collapseActionView();
            constitutionSearch.onActionViewCollapsed();

        }
        super.onPause();
    }
}
