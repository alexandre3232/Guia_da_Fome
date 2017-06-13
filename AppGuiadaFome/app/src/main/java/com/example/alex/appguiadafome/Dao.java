package com.example.alex.appguiadafome;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

import java.util.ArrayList;

/**
 * Created by alex on 13/06/2017.
 */

public class Dao {


    Context context;
    DAOguia dao;

    public Dao(Context context){
        this.context = context;
        DAOguia dao = new DAOguia(context);

    }

    public ArrayList<Guiadafome> listar(){

        SQLiteDatabase bd = dao.getReadableDatabase();
        ArrayList<Guiadafome> lista = new ArrayList<>();
        Guiadafome g = new Guiadafome();
        String selectQuery = "SELECT" +
                g.getId() + "," +
                g.getNome() + "," +
                g.getEndereço() + "," +
                g.getCidade() + "," +
                g.getTelefone() + "," +
                g.getCategoria() +"," +
                "FROM" + g.getGuiadafome();

        Cursor c = bd.rawQuery(selectQuery, null);

        Guiadafome guia;

        if(c.moveToFirst()){

            do {

                guia = new Guiadafome();
                guia.setId(c.getLong(0));
                guia.setNome(c.getString(1));
                guia.setEndereço(c.getString(2));
                guia.setCidade(c.getString(3));
                guia.setTelefone(c.getString(4));
                guia.setCategoria(c.getString(5));
                lista.add(guia);

            }while (c.moveToNext());{
                bd.close();

            }
        }
        return lista;

    }

    public long inserir(){
        DAOguia dao = new DAOguia(context);
        SQLiteDatabase bd = dao.getWritableDatabase();
        ContentValues valores = new ContentValues();
        Guiadafome g = new Guiadafome();
        valores.put(g.getNome(),"alexandre" );
        valores.put(g.getEndereço(),"taguatinga");
        valores.put(g.getCidade(),"df" );
        valores.put(g.getTelefone(),"33333333" );
        valores.put(g.getCidade(),"brasilis");
        valores.put(g.getCategoria(),"pizza" );
        long id = bd.insert(g.getGuiadafome(), null, valores);

        bd.close();
        return id;
    }

    public boolean alterar(){

        return true;
    }

    public boolean excluir(long id){

        return true;

    }


}
