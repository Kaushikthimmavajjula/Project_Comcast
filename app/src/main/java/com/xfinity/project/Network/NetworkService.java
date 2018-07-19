package com.xfinity.project.Network;

import java.io.IOException;

import okhttp3.OkHttpClient;
import okhttp3.Interceptor;
import okhttp3.Request;
import okhttp3.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import retrofit2.adapter.rxjava.RxJavaCallAdapterFactory;
/**
 * Created by kaushikramesh on 7/16/18.
 */

public class NetworkService {

    private static String baseURL = "http://api.duckduckgo.com";
    private NetworkAPI networkAPI;
    private OkHttpClient okHttpClient;


    public NetworkService(){
        this(baseURL);
    }

    public NetworkService(String baseUrl){
        okHttpClient = buildClient();
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(baseUrl)
                .addConverterFactory(GsonConverterFactory.create())
                .addCallAdapterFactory(RxJavaCallAdapterFactory.create())
                .client(okHttpClient)
                .build();

        networkAPI = retrofit.create(NetworkAPI.class);
    }

    public NetworkAPI getAPI(){
        return networkAPI;
    }

    public OkHttpClient buildClient(){

        OkHttpClient.Builder builder = new OkHttpClient.Builder();

        builder.addInterceptor(new Interceptor() {
            @Override
            public Response intercept(Chain chain) throws IOException {
                Response response = chain.proceed(chain.request());
                return response;
            }
        });

        builder.addInterceptor(new Interceptor() {
            @Override
            public Response intercept(Chain chain) throws IOException {
                Request request = chain.request().newBuilder().addHeader("Accept", "application/json").build();
                return chain.proceed(request);
            }
        });

        return  builder.build();
    }


}
