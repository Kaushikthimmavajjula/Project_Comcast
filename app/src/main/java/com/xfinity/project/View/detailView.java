package com.xfinity.project.View;

import android.os.Bundle;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;
import android.widget.TextView;

import com.xfinity.project.Model.RelatedTopics;
import com.xfinity.project.R;
import com.squareup.picasso.Picasso;

/**
 * Created by kaushikramesh on 7/18/18.
 */

public class detailView extends AppCompatActivity {

    RelatedTopics relatedTopics = new RelatedTopics();
    TextView title, description;
    ImageView image;
    ActionBar bar;
    String URL;
    String[] names;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.detail_view);

        title = (TextView) findViewById(R.id.detailViewTitle);
        description = (TextView) findViewById(R.id.detailDescriptionText);
        image = (ImageView)findViewById(R.id.detailImageView);
        bar = getSupportActionBar();
        relatedTopics =  (RelatedTopics) getIntent().getSerializableExtra("relatedTopics");

       if(relatedTopics != null){
           names = relatedTopics.getText().split("-");
           bar.setTitle(names[0]);
           title.setText(names[0]);
           description.setText(names[1]);
           URL = relatedTopics.getIcon().getURL();

           if(image !=null) {
               if(URL.equals("")) {
                   Picasso.with(this).load(R.drawable.image1).into(image);

               }
               else{
                   Picasso.with(this).load(URL).into(image);
               }
           }



       }



    }

}
