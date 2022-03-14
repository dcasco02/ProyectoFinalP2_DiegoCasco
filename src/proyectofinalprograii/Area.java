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
public class Area {
    private String nombrearea;
    ArrayList transaciones =new ArrayList();
    ArrayList <Empleado> staff = new ArrayList();

    public Area() {
    }

    public Area(String nombrearea) {
        this.nombrearea = nombrearea;
    }
    
    public String getNombrearea() {
        return nombrearea;
    }

    public void setNombrearea(String nombrearea) {
        this.nombrearea = nombrearea;
    }

    public ArrayList getTransaciones() {
        return transaciones;
    }

    public void setTransaciones(ArrayList transaciones) {
        this.transaciones = transaciones;
    }

    public ArrayList<Empleado> getStaff() {
        return staff;
    }

    public void setStaff(ArrayList<Empleado> staff) {
        this.staff = staff;
    }

    @Override
    public String toString() {
        return nombrearea;
    }
    
    
}
