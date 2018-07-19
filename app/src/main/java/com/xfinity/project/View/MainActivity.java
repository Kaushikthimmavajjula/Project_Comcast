package com.xfinity.project.View;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.widget.CompoundButton;
import android.widget.ToggleButton;

import com.xfinity.project.Fragments.DetailViewFragment;
import com.xfinity.project.Fragments.GridFragment;
import com.xfinity.project.Fragments.ListFragment;
import com.xfinity.project.Fragments.OnFragmentInteractionListener;
import com.xfinity.project.Model.Icon;
import com.xfinity.project.Model.MainModel;
import com.xfinity.project.Model.RelatedTopics;
import com.xfinity.project.Network.NetworkService;
import com.xfinity.project.Presenter.Presenter;
import com.xfinity.project.Presenter.PresenterInterface;
import com.xfinity.project.R;
import com.xfinity.project.application.ServiceInitiator;

import java.util.ArrayList;

import retrofit2.Response;

/**
 * Created by kaushikramesh on 7/19/18.
 */

public class MainActivity extends AppCompatActivity implements OnFragmentInteractionListener{

    private ToggleButton toggler;
    private NetworkService service;
    private PresenterInterface presenter;
    private ArrayList<RelatedTopics> relatedTopicses;
    private FragmentTransaction fragmentTransaction;
    private ListFragment mListFragment;
    private GridFragment mGridFragment;
    private DetailViewFragment mDetailViewFragment;
    private RelatedTopics relatedTopics;
    private Icon icon;
    private ActionBar actionBar;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mListFragment = new ListFragment();
        mGridFragment = new GridFragment();
        actionBar = getSupportActionBar();
        actionBar.show();
        service = ((ServiceInitiator)getApplication()).getNetworkService();
        presenter = new Presenter(this,service);
        presenter.loadData();
        if(findViewById(R.id.FrameLayoutRight) == null ){
            toggler = (ToggleButton) findViewById(R.id.toggler);
            toggler.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                    Fragment fragment = null;
                    if (isChecked) {

                        fragment = mGridFragment.newInstance(relatedTopicses);;

                    } else {

                        fragment = mListFragment.newInstance(relatedTopicses);

                    }

                    fragmentTransaction = getSupportFragmentManager().beginTransaction();
                    fragmentTransaction.replace(R.id.mainFrameLayout,fragment);
                    fragmentTransaction.commit();
                }
            });
        }


    }

    public void showResults(Response<MainModel> response) {
        try {
            relatedTopicses = response.body().getRelatedTopics();
            fragmentTransaction = getSupportFragmentManager().beginTransaction();
            Fragment fragment = new Fragment();
            fragment = mListFragment.newInstance(relatedTopicses);
            fragmentTransaction.replace(R.id.mainFrameLayout,fragment);
            fragmentTransaction.commit();

        }

        catch (Exception e) {

            ArrayList<RelatedTopics> errorList = getDeffaultList();

        }

    }
    public void showFailure(Throwable throwable){

        ArrayList<RelatedTopics> errorList = getDeffaultList();

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


    @Override
    public void onItemSelected(RelatedTopics relatedTopics) {

        fragmentTransaction = getSupportFragmentManager().beginTransaction();
        int container = R.id.mainFrameLayout;
        if(findViewById(R.id.FrameLayoutRight) != null ) {
            container = R.id.FrameLayoutRight;
        }
        Fragment fragment = new Fragment();
        fragment = mDetailViewFragment.newInstance(relatedTopics);
        fragmentTransaction.replace(container,fragment);
        if(findViewById(R.id.FrameLayoutRight)==null) {
            actionBar.setTitle(relatedTopics.getText().split("-")[0]);
            fragmentTransaction.addToBackStack(null);
        }
        fragmentTransaction.commit();
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        actionBar.setTitle(R.string.app_name);
    }
}
