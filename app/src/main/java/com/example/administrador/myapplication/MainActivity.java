package com.example.administrador.myapplication;


import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.example.administrador.myapplication.MenusContextuales.MenuContextualClientes;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void Listar(View v){
        Intent i = new Intent(getApplicationContext(),MenuContextualClientes.class);

        startActivity(i);



    }




}
