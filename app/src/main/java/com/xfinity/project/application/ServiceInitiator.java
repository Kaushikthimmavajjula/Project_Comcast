package com.xfinity.project.application;

import android.app.Application;

import com.xfinity.project.Network.NetworkService;

/**
 * Created by kaushikramesh on 7/17/18.
 */

public class ServiceInitiator extends Application {

    private NetworkService networkService;

    @Override
    public void onCreate(){
        super.onCreate();
        networkService = new NetworkService();
    }

    public NetworkService getNetworkService(){
        return networkService;
    }
}
