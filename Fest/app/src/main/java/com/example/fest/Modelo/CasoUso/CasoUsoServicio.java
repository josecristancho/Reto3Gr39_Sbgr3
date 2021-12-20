package com.example.fest.Modelo.CasoUso;

import android.database.Cursor;

import com.example.fest.Modelo.Entidades.Servicios;

import java.util.ArrayList;

public class CasoUsoServicio {
    public ArrayList<Servicios> llenarListaServicios(Cursor cursor){
        ArrayList<Servicios> list = new ArrayList<>();
        if(cursor.getCount() == 0){
            return list;
        }else{
            while (cursor.moveToNext()){
                Servicios servicios = new Servicios(
                        cursor.getInt(0),
                        cursor.getString(1),
                        cursor.getString(2),
                        cursor.getString(3),
                        cursor.getBlob(4)
                );
                list.add(servicios);
            }
            return list;
        }
    }
}
