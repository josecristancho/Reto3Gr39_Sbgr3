package com.example.fest.Modelo.CasoUso;

import android.database.Cursor;


import com.example.fest.Modelo.Entidades.Sucursales;

import java.util.ArrayList;

public class CasoUsoSucursales {
    public ArrayList<Sucursales> llenarListaSucursales(Cursor cursor){
        ArrayList<Sucursales> list = new ArrayList<>();
        if(cursor.getCount() == 0){
            return list;
        }else{
            while (cursor.moveToNext()){
                Sucursales sucursales = new Sucursales(
                        cursor.getInt(0),
                        cursor.getString(1),
                        cursor.getString(2),
                        cursor.getString(3),
                        cursor.getBlob(4)
                );
                list.add(sucursales);
            }
            return list;
        }
    }
}
