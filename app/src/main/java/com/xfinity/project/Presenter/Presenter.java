package com.xfinity.project.Presenter;

import com.xfinity.project.Model.MainModel;
import com.xfinity.project.Network.NetworkService;
import com.xfinity.project.View.MainActivity;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/**
 * Created by kaushikramesh on 7/17/18.
 */

public class Presenter implements PresenterInterface {

    private MainActivity activity;
    private NetworkService network;

    public Presenter(MainActivity activity, NetworkService network) {
        this.activity = activity;
        this.network = network;
    }


    @Override
    public void loadData() {

        Call<MainModel> call = network.getAPI().getResponse();
        call.enqueue(new Callback<MainModel>() {
            @Override
            public void onResponse(Call<MainModel> call, Response<MainModel> response) {
                activity.showResults(response);
            }

            @Override
            public void onFailure(Call<MainModel> call, Throwable t) {
                activity.showFailure(t);
            }
        });

    }
}
