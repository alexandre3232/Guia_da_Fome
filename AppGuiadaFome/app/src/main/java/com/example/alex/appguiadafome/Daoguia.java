package com.example.alex.appguiadafome;
import android.app.AlertDialog;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.widget.Toast;

import java.util.ArrayList;

/**
 * alexandre
 */

class DAOguia extends SQLiteOpenHelper {
    private static final String bd = "empresas.db";
    private static final int DB_VERSION = 1;
    public DAOguia(Context context) {
        super(context, bd, null, DB_VERSION);
    }
        SQLiteDatabase db = null;

        @Override
        public void onCreate (SQLiteDatabase db) {

            try {
                Guiadafome g = new Guiadafome();
                String sql = "CREATE TABLE " + g.getGuiadafome() + "( "
                        + g.getId() + "INTEGER PRIMARY KEY AUTOINCREMENT, "
                        + g.getNome() + "TEXT NOT NULL, "
                        + g.getEndereço()+ "TEXT NOT NULL, "
                        + g.getCidade()+ "TEXT NOT NULL, "
                        + g.getTelefone() + "TEXT NOT NULL, "
                        + g.getCategoria()+ "TEXT NOT NULL);";
                db.execSQL(sql);
               /* Toast.makeText(DAOguia.this,"Banco criado com sucesso.",Toast.LENGTH_SHORT).show();
                /*AlertDialog.Builder alerta = new AlertDialog.Builder(this);
                alerta.setMessage("Banco criado com sucesso!");
                alerta.setTitle("Alerta!!!");
                alerta.setNeutralButton("OK", null);*/

            } catch (Exception e) {
               /* Toast.makeText(DAOguia.this, "Erro.", Toast.LENGTH_SHORT).show();
                /*AlertDialog.Builder alerta1 = new AlertDialog.Builder(DAO_guia.this);
                alerta1.setMessage("Banco criado com sucesso!");
                alerta1.setTitle("Alerta!!!");
                alerta1.setNeutralButton("OK", null);*/
            }
        }

            @Override
            public void onUpgrade (SQLiteDatabase db,int oldVersion, int newVersion){
                String sql = "DROP TABLE IF EXISTS Guiadafome";
                db.execSQL(sql);
                onCreate(db);

    }


    }







