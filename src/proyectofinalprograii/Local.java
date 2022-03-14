/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectofinalprograii;

import java.util.ArrayList;

/**
 *
 * @author dcasc
 */
public class Local {
    private String nombre;
    private float latitud;
    private float longitud;
    ArrayList <Area> areas =new ArrayList();

    public Local() {
    }

    public Local(String nombre, float latitud, float longitud) {
        this.nombre = nombre;
        this.latitud = latitud;
        this.longitud = longitud;
    }

    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public float getLatitud() {
        return latitud;
    }

    public void setLatitud(float latitud) {
        this.latitud = latitud;
    }

    public float getLongitud() {
        return longitud;
    }

    public void setLongitud(float longitud) {
        this.longitud = longitud;
    }

    public ArrayList<Area> getAreas() {
        return areas;
    }

    public void setAreas(ArrayList<Area> areas) {
        this.areas = areas;
    }

    @Override
    public String toString() {
        return nombre;
    }
    
    
    
}
