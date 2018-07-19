package com.xfinity.project.Fragments;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.ListView;

import com.xfinity.project.Adapters.GridViewAdpater;
import com.xfinity.project.Adapters.ListViewAdapter;
import com.xfinity.project.Model.RelatedTopics;
import com.xfinity.project.R;

import java.util.ArrayList;

/**
 * Created by kaushikramesh on 7/19/18.
 */

public class GridFragment extends Fragment {


        private static final String key = "relatedTopics";
        private ArrayList<RelatedTopics> mRelatedTopics;
        OnFragmentInteractionListener mListener;
        public static GridFragment newInstance(ArrayList<RelatedTopics>relatedTopics){

            GridFragment fragment = new GridFragment();
            Bundle bundle = new Bundle();
            bundle.putSerializable(key,relatedTopics);
            fragment.setArguments(bundle);
            return fragment;
        }


        @Override
        public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){
            mRelatedTopics = (ArrayList<RelatedTopics>) getArguments().getSerializable(key);
            View v = inflater.inflate(R.layout.fragment_grid_view,null);
            return v;
        }

        @Override
        public void onViewCreated(View view, Bundle savedInstanceState){
            super.onViewCreated(view,savedInstanceState);
            GridView gridView = (GridView) view.findViewById(R.id.gridView);
            GridViewAdpater gridViewAdapter = new GridViewAdpater(view.getContext(),R.layout.grid_item,mRelatedTopics);
            gridView.setAdapter(gridViewAdapter);
            gridView.setOnItemClickListener(onListItemClickListener);

        }
    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        try {
            mListener = (OnFragmentInteractionListener) context;
        } catch (ClassCastException e) {
            throw new ClassCastException(context.toString()
                    + " must implement OnFragmentInteractionListener");
        }

    }

    @Override
    public void onDetach() {
        super.onDetach();
        mListener = null;
    }

    AdapterView.OnItemClickListener onListItemClickListener = new AdapterView.OnItemClickListener(){
        @Override
        public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
            RelatedTopics item = (RelatedTopics) adapterView.getItemAtPosition(i);
            if(mListener!=null){
                mListener.onItemSelected(item);
            }
        }
    };

}
