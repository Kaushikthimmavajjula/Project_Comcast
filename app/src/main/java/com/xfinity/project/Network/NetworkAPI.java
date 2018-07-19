package com.xfinity.project.Network;

import com.xfinity.project.BuildConfig;
import com.xfinity.project.Model.MainModel;
import com.xfinity.project.Utils;

import retrofit2.Call;
import retrofit2.http.GET;

/**
 * Created by kaushikramesh on 7/16/18.
 */

public interface NetworkAPI {

    @GET(BuildConfig.VAR)
    Call<MainModel> getResponse();
}
