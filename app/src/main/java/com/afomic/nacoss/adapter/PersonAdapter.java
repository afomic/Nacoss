package com.afomic.nacoss.adapter;

import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.afomic.nacoss.R;
import com.afomic.nacoss.activities.ExcoViewerActivity;
import com.afomic.nacoss.activities.LecturerDetail;
import com.afomic.nacoss.data.Constants;
import com.afomic.nacoss.data.ExcoData;
import com.afomic.nacoss.data.LecturerData;
import com.afomic.nacoss.data.ParliamentarianData;
import com.afomic.nacoss.model.Exco;
import com.afomic.nacoss.model.Lecturer;

import java.util.ArrayList;

/**
 * Created by afomic on 17-Oct-16.
 *
 */
public class PersonAdapter extends RecyclerView.Adapter<PersonAdapter.Holder> {

    ArrayList<Lecturer> lecturers;
    ArrayList<Exco> excos;
    Context context;
    boolean isExcoPage;
    String type;
    boolean isLecturePage;
    public PersonAdapter(Context context,String type ){
        this.context=context;
        this.type=type;
        isExcoPage=type.equals(Constants.EXCO);
        isLecturePage=type.equals(Constants.LECTURER);
        if(isExcoPage){
            excos= ExcoData.getExcos();
        }else if(isLecturePage){
            lecturers= LecturerData.getLecturers();
        }else {
            excos= ParliamentarianData.getparliamentarys();
        }
    }

    @Override
    public Holder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v=LayoutInflater.from(context).inflate(R.layout.person_layout,parent,false);
        return new Holder(v);
    }

    @Override
    public void onBindViewHolder(Holder holder, int position) {

        if (isLecturePage){
            Lecturer item= (Lecturer) getItem(position);
            holder.personName.setText(item.getName());
            holder.personPicture.setImageBitmap(item.getBitmap(context));
            holder.personDescription.setText(item.getRoomNumber());
            Bitmap bitmap=item.getBitmap(context);
            if(bitmap!=null){
                holder.personPicture.setImageBitmap(bitmap);
            }
            else {
                holder.personPicture.setImageResource(R.drawable.user);
            }
        } else{
            Exco item= (Exco) getItem(position);
            holder.personName.setText(item.getName());
            Bitmap bitmap=item.getBitmap(context);
            if(bitmap!=null){
                holder.personPicture.setImageBitmap(bitmap);
            }
            else {
                holder.personPicture.setImageResource(R.drawable.user);
            }
            holder.personDescription.setText(item.getPost());
        }
        holder.container.setOnClickListener(new Onclick(position));
        holder.personPicture.setOnClickListener(new Onclick(position));

    }

    @Override
    public int getItemCount() {
        if(isLecturePage){
            return lecturers.size();
        }else {
            return excos.size();
        }

    }
    public Object getItem(int position) {

        if(isLecturePage){
            return lecturers.get(position);
        }else {
            return excos.get(position);
        }
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }


    public class Holder extends RecyclerView.ViewHolder{
        TextView personName, personDescription;
        ImageView personPicture;
        RelativeLayout container;
        public Holder(View itemView) {
            super(itemView);
            container=(RelativeLayout) itemView.findViewById(R.id.person_container);
            personDescription=(TextView)itemView.findViewById(R.id.tv_person_description);
            personName=(TextView) itemView.findViewById(R.id.tv_person_name);
            personPicture=(ImageView) itemView.findViewById(R.id.iv_person_image);
        }


    }
    public class Onclick implements View.OnClickListener{
        int position;
        public Onclick(int position){
           this.position=position;
        }

        @Override
        public void onClick(View v) {
            Intent intent = null;
            if (isLecturePage) {
                intent = new Intent(context, LecturerDetail.class);
            } else {
                intent = new Intent(context, ExcoViewerActivity.class);
                intent.putExtra(Constants.TYPE,type);
            }

            intent.putExtra(Constants.POSITION, position);
            context.startActivity(intent);
        }
    }


}
