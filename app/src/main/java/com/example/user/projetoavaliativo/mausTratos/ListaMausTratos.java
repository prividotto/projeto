package com.example.user.projetoavaliativo.mausTratos;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ListView;

import com.example.user.projetoavaliativo.R;
import com.example.user.projetoavaliativo.adapter.AdapterDenuncia;
import com.example.user.projetoavaliativo.modelo.MausTratos;

import java.util.ArrayList;
import java.util.List;

public class ListaMausTratos extends AppCompatActivity {


    AdapterDenuncia adapterDenuncia = new AdapterDenuncia();
    MausTratos mausTratos;

    List<MausTratos> listaMausTratos = new ArrayList<>();
    ListView lista;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista_maus_tratos);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);




    }

}
