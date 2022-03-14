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
    private boolean discapacidad;
    private int cantidadtrans;

    public Cliente() {
    }

    public Cliente(int identidad, boolean discapacidad, int cantidadtrans) {
        this.identidad = identidad;
        this.discapacidad = discapacidad;
        this.cantidadtrans = cantidadtrans;
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
    
    
}
