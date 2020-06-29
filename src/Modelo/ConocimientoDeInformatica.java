/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author Chelo
 */
public class ConocimientoDeInformatica {
    private int id;
    private String nombre;

    public ConocimientoDeInformatica() {
    }

    public ConocimientoDeInformatica(int id, String nombre) {
        this.id = id;
        this.nombre = nombre;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "ConocimientoDeInformatica{" + "id=" + id + ", nombre=" + nombre + '}';
    }
    
    
    
    
}
