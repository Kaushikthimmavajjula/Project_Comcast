package com.xfinity.project.Fragments;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;
import com.xfinity.project.Adapters.ListViewAdapter;
import com.xfinity.project.Model.RelatedTopics;
import com.xfinity.project.R;

import java.util.ArrayList;

/**
 * Created by kaushikramesh on 7/19/18.
 */

public class DetailViewFragment extends Fragment {

    private static final String key = "relatedTopics";
    private RelatedTopics mRelatedTopics;
    TextView title, description;
    ImageView image;
    ActionBar bar;
    String URL;
    String[] names;

    public static DetailViewFragment newInstance(RelatedTopics relatedTopics){

        DetailViewFragment fragment = new DetailViewFragment();
        Bundle bundle = new Bundle();
        bundle.putSerializable(key,relatedTopics);
        fragment.setArguments(bundle);
        return fragment;
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){
        mRelatedTopics = (RelatedTopics) getArguments().getSerializable(key);
        View v = inflater.inflate(R.layout.fragment_detail_view,null);
        return v;
    }

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState){
        super.onViewCreated(view,savedInstanceState);

        title = (TextView) view.findViewById(R.id.detailViewTitle);
        description = (TextView) view.findViewById(R.id.detailDescriptionText);
        image = (ImageView)view.findViewById(R.id.detailImageView);
        if(mRelatedTopics != null){
            names = mRelatedTopics.getText().split("-");
            title.setText(names[0]);
            description.setText(names[1]);
            URL = mRelatedTopics.getIcon().getURL();
            if(image !=null) {
                if(URL.equals("")) {
                    Picasso.with(view.getContext()).load(R.drawable.image1).into(image);

                }
                else{
                    Picasso.with(view.getContext()).load(URL).into(image);
                }
            }



        }


    }
}
