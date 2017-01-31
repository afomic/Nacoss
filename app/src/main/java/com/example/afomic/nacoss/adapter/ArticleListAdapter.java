package com.example.afomic.nacoss.adapter;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

/**
 * Created by afomic on 14-Nov-16.
 */
public class ArticleListAdapter extends BaseAdapter {
    String[]articles={"Article 1: General Provision","Article 2: The Constitution","Article 3: The Executive Council","Article 4: The Legislation",
            "Article 5: Organs Of The Association","Article 6: Election","Article 7: Miscellaneous"};
    Context context;
    public ArticleListAdapter(Context context){
        this.context=context;
    }
    @Override
    public int getCount() {
        return articles.length;
    }

    @Override
    public String getItem(int position) {
        return articles[position];
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        TextView view=new TextView(context);
        view.setText(getItem(position));
        view.setPadding(12,12,12,12);
        return view;
    }
}
