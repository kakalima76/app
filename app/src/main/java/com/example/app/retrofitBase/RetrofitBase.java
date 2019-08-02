package com.example.app.retrofitBase;

import com.example.app.retrofitBase.services.ItemService;

import okhttp3.OkHttpClient;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class RetrofitBase {

    private final ItemService itemService;

    public RetrofitBase() {

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("https://ccu-leilao.herokuapp.com/")
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        itemService = retrofit.create(ItemService.class);

    }

    public ItemService getItemService() {
        return itemService;
    }
}
