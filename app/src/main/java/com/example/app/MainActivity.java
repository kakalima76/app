package com.example.app;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import com.example.app.retrofitBase.RetrofitBase;
import com.example.app.retrofitBase.models.Item;
import com.example.app.retrofitBase.services.ItemService;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {


    private final Context toast = this;
    private EditText lacre;
    private TextView processo;
    private TextView posicao;
    private Spinner grupo;
    private Button buscar;
    private Call<Integer> callAsync;
    private Integer count;



    @SuppressLint("ClickableViewAccessibility")
    @Override
    protected void onCreate(@androidx.annotation.Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        buscar = findViewById(R.id.Buscar);
        lacre = findViewById(R.id.Lacre);
        processo = findViewById(R.id.Processo);
        posicao = findViewById(R.id.Posicao);
        grupo = findViewById(R.id.Grupo);


        List<String> opcoes = new ArrayList<>(Arrays.asList("grupos",
                "ACESSÓRIO DE MA",
                "BOTIJÃO DE GÁS",
                "CADEIRA",
                "ELETRODOMÉSTICO",
                "ELETROELETRÔNICO",
                "FERRAMENTA",
                "MENDA",
                "MESA",
                "MÓDULO DE ALIMENTAÇÃO",
                "TRANSPORTE"
        ));


        grupo.setAdapter(new ArrayAdapter<>(this, android.R.layout.simple_spinner_dropdown_item, opcoes));

        final ItemService service;
        service = new RetrofitBase().getItemService();
        callAsync = service.Contar();
        callAsync.enqueue(new Callback<Integer>() {
            @Override
            public
            void onResponse(Call<Integer> call, Response<Integer> response) {
                String msg = response.body().toString();
                Toast.makeText(toast, msg, Toast.LENGTH_SHORT).show();
                posicao.setText(msg);
            }

            @Override
            public
            void onFailure(Call<Integer> call, Throwable t) {

            }
        });

    }

}
