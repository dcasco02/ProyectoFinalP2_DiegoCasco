/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectofinalprograii;

/**
 *
 * @author dcasc
 */
public class Cliente {
    private String nombre;
    private int identidad;
    private String CorreoElec;
    private boolean discapacidad;
    private int cantidadtrans;
    private String tipotrans;
    
       
    public Cliente() {
    }

    public Cliente(String nombre, int identidad, String CorreoElec, boolean discapacidad, int cantidadtrans, String tipotrans) {
        this.nombre = nombre;
        this.identidad = identidad;
        this.CorreoElec = CorreoElec;
        this.discapacidad = discapacidad;
        this.cantidadtrans = cantidadtrans;
        this.tipotrans = tipotrans;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getIdentidad() {
        return identidad;
    }

    public void setIdentidad(int identidad) {
        this.identidad = identidad;
    }

    public boolean isDiscapacidad() {
        return discapacidad;
    }

    public void setDiscapacidad(boolean discapacidad) {
        this.discapacidad = discapacidad;
    }

    public int getCantidadtrans() {
        return cantidadtrans;
    }

    public void setCantidadtrans(int cantidadtrans) {
        this.cantidadtrans = cantidadtrans;
    }

    public String getTipotrans() {
        return tipotrans;
    }

    public void setTipotrans(String tipotrans) {
        this.tipotrans = tipotrans;
    }

    public String getCorreoElec() {
        return CorreoElec;
    }

    public void setCorreoElec(String CorreoElec) {
        this.CorreoElec = CorreoElec;
    }
    
    
}
