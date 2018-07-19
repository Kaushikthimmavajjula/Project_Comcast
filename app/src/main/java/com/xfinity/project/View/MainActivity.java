package com.xfinity.project.View;

import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewStub;
import android.widget.AdapterView;
import android.widget.CompoundButton;
import android.widget.GridView;
import android.widget.ListView;
import android.widget.ToggleButton;

import com.xfinity.project.Adapters.GridViewAdpater;
import com.xfinity.project.Adapters.ListViewAdapter;
import com.xfinity.project.Model.Icon;
import com.xfinity.project.Model.MainModel;
import com.xfinity.project.Model.RelatedTopics;
import com.xfinity.project.Network.NetworkService;
import com.xfinity.project.Presenter.Presenter;
import com.xfinity.project.Presenter.PresenterInterface;
import com.xfinity.project.R;
import com.xfinity.project.application.ServiceInitiator;


import java.io.Serializable;
import java.util.ArrayList;

import retrofit2.Response;

public class MainActivity extends AppCompatActivity {

    private ViewStub gridStub;
    private ViewStub listStub;
    private ListView listView;
    private GridView gridView;
    private ToggleButton toggler;
    private ListViewAdapter listViewAdapter;
    private GridViewAdpater gridViewAdpater;
    private NetworkService service;
    private PresenterInterface presenter;
    private ArrayList<RelatedTopics> relatedTopicses;
    private RelatedTopics relatedTopics;
    private Icon icon;
    private int currentViewMode =0;
    static final int VIEW_MODE_LISTVIEW = 0;
    static final int VIEW_MODE_GRIDVIEW = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listStub = (ViewStub) findViewById(R.id.toggleViewList);
        gridStub = (ViewStub) findViewById(R.id.toggleViewGrid);
        toggler = (ToggleButton) findViewById(R.id.toggler);

        listStub.inflate();
        gridStub.inflate();

        listView = (ListView) findViewById(R.id.listView);
        gridView = (GridView) findViewById(R.id.gridView);
        service = ((ServiceInitiator)getApplication()).getNetworkService();
        presenter = new Presenter(this,service);
        presenter.loadData();

        toggler.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    setViewmode(VIEW_MODE_GRIDVIEW);
                    listStub.setVisibility(View.GONE);
                    gridStub.setVisibility(View.VISIBLE);
                    setAdapters(relatedTopicses);
                } else {
                    setViewmode(VIEW_MODE_LISTVIEW);
                    listStub.setVisibility(View.VISIBLE);
                    gridStub.setVisibility(View.GONE);
                    setAdapters(relatedTopicses);
                }
            }
        });

        listView.setOnItemClickListener(onItemClickListener);
        gridView.setOnItemClickListener(onItemClickListener);

    }

    public void showResults(Response<MainModel> response) {
        try {
            relatedTopicses = response.body().getRelatedTopics();
            setViewmode(VIEW_MODE_LISTVIEW);
            setAdapters(relatedTopicses);


        }

        catch (Exception e) {

            ArrayList<RelatedTopics> errorList = getDeffaultList();
            setViewmode(VIEW_MODE_LISTVIEW);
            setAdapters(errorList);

        }

    }
    public void showFailure(Throwable throwable){

        ArrayList<RelatedTopics> errorList = getDeffaultList();
        setViewmode(VIEW_MODE_LISTVIEW);
        setAdapters(errorList);
    }

    public void setViewmode(int VIEW_MODE){
        SharedPreferences sharedPreferences =  getSharedPreferences("ViewMode", MODE_PRIVATE);
        currentViewMode = sharedPreferences.getInt("currentViewMode", VIEW_MODE);
    }
    public ArrayList<RelatedTopics> getDeffaultList(){
        relatedTopics.setFirstURL("Doest Not Exist");
        icon.setHeight("");
        icon.setURL("");
        icon.setWidth("");
        relatedTopics.setIcon(icon);
        relatedTopics.setText("Error Occured");
        relatedTopics.setResult("Error Occurred");
        relatedTopicses.add(relatedTopics);
        return relatedTopicses;
    }

    public void setAdapters(ArrayList<RelatedTopics> list){

        if(VIEW_MODE_LISTVIEW == currentViewMode){
            listViewAdapter = new ListViewAdapter(this,R.layout.list_item,list);
            listView.setAdapter(listViewAdapter);
        }
        else{
            gridViewAdpater = new GridViewAdpater(this,R.layout.grid_item,list);
            gridView.setAdapter(gridViewAdpater);
        }
    }

    AdapterView.OnItemClickListener onItemClickListener = new AdapterView.OnItemClickListener(){

        @Override
        public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
            Intent detailItem = new Intent (MainActivity.this, detailView.class);
            detailItem.putExtra("relatedTopics", (Serializable) relatedTopicses.get(i));
            startActivity(detailItem);
        }
    };

}
