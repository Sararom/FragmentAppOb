package com.example.rafaj.fragmentapp;

import java.io.Serializable;

/**
 * Created by Sara on 15/4/2018.
 */

public class LosInstrumentosMortales implements Serializable{

    private int image;
    private String nombre;

    public LosInstrumentosMortales(String cnombre, int position){
        this.nombre=cnombre;

        if(position==0){
            image= R.drawable.hueso;
        }else if (position==1){
            image=R.drawable.ceniza;
        }else if (position==2){
            image=R.drawable.cristal;
        }else if (position==3){
            image=R.drawable.angelescaidos;
        }else if (position==4){
            image=R.drawable.almasperdidas;
        }
    }

    public int getImage(){return image;}

    public String getNombre(){return nombre;}
}
