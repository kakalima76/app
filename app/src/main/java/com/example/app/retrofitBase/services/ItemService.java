package com.example.app.retrofitBase.services;

import com.example.app.retrofitBase.models.Item;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface ItemService {

    @GET("/lacre/contar")
    Call <Integer> Contar();

//    @GET("/lacre/contar")
//    Call <List<Item>> Contar();


}
