package com.example.alex.appguiadafome;

import android.app.Activity;
import android.database.sqlite.SQLiteDatabase;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends Activity {

    private Spinner sp1;
    private Spinner sp2;
    private Button b1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Dao dao = new Dao(this);
        dao.inserir();
        dao.listar();
       // List<Guiadafome> lista = dao.busca();

        // Spinner categoria
       /* List<Guiadafome> opcao = new ArrayList<Guiadafome>();
        ArrayAdapter<> adaptador = new ArrayAdapter<>(this, android.R.layout.simple_spinner_item, opcao);
        Spinner sp1 = (Spinner)findViewById(R.id.spinner01);
        sp1.setAdapter(adaptador);

        //Spinner cidade

        /*List<String> opcao1 = new ArrayList<String>();
        ArrayAdapter adaptador1 = new ArrayAdapter(this, android.R.layout.simple_spinner_item, opcao1);
        Spinner sp2 = (Spinner)findViewById(R.id.spinner02);
        sp1.setAdapter(adaptador1);*/


        Button b1 = (Button) findViewById(R.id.botao1);


    }
}