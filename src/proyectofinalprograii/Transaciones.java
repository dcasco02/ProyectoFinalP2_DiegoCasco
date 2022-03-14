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
public class Transaciones {
    private String tipo;
    private int tiempo;

    public Transaciones() {
    }

    public Transaciones(String tipo, int tiempo) {
        this.tipo = tipo;
        this.tiempo = tiempo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getTiempo() {
        return tiempo;
    }

    public void setTiempo(int tiempo) {
        this.tiempo = tiempo;
    }
    
}
