/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectofinalprograii;

import java.util.Date;
import javax.swing.ComboBoxModel;

/**
 *
 * @author dcasc
 */
public class Usuarios {
    private String nombre;
    private String usuario;
    private String apellido;
    private String contrasena;
    private Date nacimiento;
    private String tipocuenta;

    public Usuarios() {
        
    }

    public Usuarios(String nombre, String usuario, String apellido, String contrasena, Date nacimiento, String tipocuenta) {
        this.nombre = nombre;
        this.usuario = usuario;
        this.apellido = apellido;
        this.contrasena = contrasena;
        this.nacimiento = nacimiento;
        this.tipocuenta = tipocuenta;
    }


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

    public Date getNacimiento() {
        return nacimiento;
    }

    public void setNacimiento(Date nacimiento) {
        this.nacimiento = nacimiento;
    }

    public String getTipocuenta() {
        return tipocuenta;
    }

    public void setTipocuenta(String tipocuenta) {
        this.tipocuenta = tipocuenta;
    }

    @Override
    public String toString() {
        return nombre;
    }
    
}
