package com.afomic.nacoss.activities;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.net.Uri;
import android.os.Bundle;
import android.support.design.widget.CollapsingToolbarLayout;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Gravity;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.afomic.nacoss.R;
import com.afomic.nacoss.data.Constants;
import com.afomic.nacoss.data.ExcoData;
import com.afomic.nacoss.data.ParliamentarianData;
import com.afomic.nacoss.model.Exco;


/**
 * Created by afomic on 19-Oct-16.
 *
 */
public class ExcoViewerActivity extends AppCompatActivity {
    Toolbar toolbar;
    int position;
    CollapsingToolbarLayout excoCollapsingToolbar;
    TextView excoLevel,excoPhoneNumnber,excoOption,excoOffice,excoEmail;
    ImageView excoPicture;
    Exco item;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.exco_detail);
        //setting up the toolbar
        toolbar=(Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        //adding the name of exco_detail as title of the collapsing toolbar
        FloatingActionButton fab=(FloatingActionButton) findViewById(R.id.fab);
        excoCollapsingToolbar=(CollapsingToolbarLayout) findViewById(R.id.exco_collapsing_toolbar);
        excoCollapsingToolbar.setExpandedTitleGravity(Gravity.BOTTOM);
        fab.setRippleColor(Color.YELLOW);







        //getting referencing to all the view use
        excoLevel=(TextView) findViewById(R.id.exco_level);
        excoEmail=(TextView) findViewById(R.id.exco_email);
        excoPhoneNumnber=(TextView) findViewById(R.id.exco_phone);
        excoOffice=(TextView) findViewById(R.id.exco_office);
        excoOption=(TextView) findViewById(R.id.exco_department);
        excoPicture=(ImageView) findViewById(R.id.exco_image);
        TextView excoTitle=(TextView) findViewById(R.id.exco_title);

        //get the position of the exco pressed;
        Bundle passedData=getIntent().getExtras();
        position=passedData.getInt(Constants.POSITION,0);
        String type=passedData.getString(Constants.TYPE);
        //get the exco object at the position pressed

        if(type.equals(Constants.EXCO)){
            item= ExcoData.getExco(position);
            excoTitle.setText("Office");
        }else {
            item= ParliamentarianData.getparliamentary(position);
            excoTitle.setText("Post");
        }

        //setting the value of the views on exco detail page
        excoLevel.setText(item.getLevel());
        excoCollapsingToolbar.setTitle(item.getName());
        excoOption.setText(item.getDepartment());
        excoOffice.setText(item.getPost());
        excoPhoneNumnber.setText(item.getTelephoneNumber());
        excoEmail.setText(item.getEmail());
        Bitmap bit=item.getBitmap(this);
        if(bit==null){
            excoPicture.setImageResource(R.drawable.user);
        }else {
            excoPicture.setImageBitmap(bit);
        }

        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Intent.ACTION_DIAL);
                intent.setData(Uri.parse("tel:" + item.getTelephoneNumber()));
                if (intent.resolveActivity(getPackageManager()) != null) {
                    startActivity(intent);
                }

            }
        });



    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if(item.getItemId()==android.R.id.home){
            this.onBackPressed();
        }
        return super.onOptionsItemSelected(item);
    }
}
