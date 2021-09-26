/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author toliv
 */
public class Pasajero {
    private int id_pasajero;
    private String docu_clie;
    private String tipodocu_clie;
    private String nombre_clie;
    private String apellido_clie;
    private String fechanac_clie;
    private String direccion_clie;
    private String telefono_clie;
    
    public Pasajero() {
        
    }

    public Pasajero(int id_pasajero, String docu_clie, String tipodocu_clie, String nombre_clie, String apellido_clie, String fechanac_clie, String direccion_clie, String telefono_clie) {
        this.id_pasajero = id_pasajero;
        this.docu_clie = docu_clie;
        this.tipodocu_clie = tipodocu_clie;
        this.nombre_clie = nombre_clie;
        this.apellido_clie = apellido_clie;
        this.fechanac_clie = fechanac_clie;
        this.direccion_clie = direccion_clie;
        this.telefono_clie = telefono_clie;
    }

    public int getId_pasajero() {
        return id_pasajero;
    }

    public void setId_pasajero(int id_pasajero) {
        this.id_pasajero = id_pasajero;
    }

    public String getDocu_clie() {
        return docu_clie;
    }

    public void setDocu_clie(String docu_clie) {
        this.docu_clie = docu_clie;
    }

    public String getTipodocu_clie() {
        return tipodocu_clie;
    }

    public void setTipodocu_clie(String tipodocu_clie) {
        this.tipodocu_clie = tipodocu_clie;
    }

    public String getNombre_clie() {
        return nombre_clie;
    }

    public void setNombre_clie(String nombre_clie) {
        this.nombre_clie = nombre_clie;
    }

    public String getApellido_clie() {
        return apellido_clie;
    }

    public void setApellido_clie(String apellido_clie) {
        this.apellido_clie = apellido_clie;
    }

    public String getFechanac_clie() {
        return fechanac_clie;
    }

    public void setFechanac_clie(String fechanac_clie) {
        this.fechanac_clie = fechanac_clie;
    }

    public String getDireccion_clie() {
        return direccion_clie;
    }

    public void setDireccion_clie(String direccion_clie) {
        this.direccion_clie = direccion_clie;
    }

    public String getTelefono_clie() {
        return telefono_clie;
    }

    public void setTelefono_clie(String telefono_clie) {
        this.telefono_clie = telefono_clie;
    }
    
    
}
