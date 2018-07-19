package com.xfinity.project.Adapters;

import android.content.Context;
import android.support.annotation.LayoutRes;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;

import com.xfinity.project.Model.RelatedTopics;
import com.xfinity.project.R;
import com.squareup.picasso.Picasso;

import java.util.List;

/**
 * Created by kaushikramesh on 7/17/18.
 */

public class GridViewAdpater extends ArrayAdapter<RelatedTopics> {
    String URL = "";

    public GridViewAdpater(@NonNull Context context, @LayoutRes int resource, @NonNull List<RelatedTopics> objects) {
        super(context, resource, objects);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View v = convertView;

        if(v == null){

            LayoutInflater inflater = (LayoutInflater)getContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            v = inflater.inflate(R.layout.grid_item, null);
        }

        RelatedTopics relatedTopics = getItem(position);
        ImageView imageview = (ImageView) v.findViewById(R.id.gridItemImage);
        try {
             URL = relatedTopics.getIcon().getURL();
        }
        catch (NullPointerException e){
             URL = "";
        }
        if(imageview !=null) {
            if(URL.equals("")) {
                Picasso.with(v.getContext()).load(R.drawable.image1).into(imageview);

            }
            else{
                Picasso.with(v.getContext()).load(URL).into(imageview);
            }
        }

        return v;
    }


}
