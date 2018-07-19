package com.xfinity.project.Fragments;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;

import com.xfinity.project.Adapters.ListViewAdapter;
import com.xfinity.project.Model.RelatedTopics;
import com.xfinity.project.R;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by kaushikramesh on 7/19/18.
 */

public class ListFragment extends Fragment {

    private static final String key = "relatedTopics";
    private ArrayList<RelatedTopics> mRelatedTopics;

    OnFragmentInteractionListener mListener;

    public static ListFragment newInstance(ArrayList<RelatedTopics> relatedTopics) {

        ListFragment fragment = new ListFragment();
        Bundle bundle = new Bundle();
        bundle.putSerializable(key, relatedTopics);
        fragment.setArguments(bundle);
        return fragment;
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        mRelatedTopics = (ArrayList<RelatedTopics>) getArguments().getSerializable(key);
        View v = inflater.inflate(R.layout.fragment_list_view, null);
        return v;
    }

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        ListView listView = (ListView) view.findViewById(R.id.listView);
        ListViewAdapter listViewAdapter = new ListViewAdapter(view.getContext(), R.layout.list_item, mRelatedTopics);
        listView.setAdapter(listViewAdapter);
        listView.setOnItemClickListener(onListItemClickListener);

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
