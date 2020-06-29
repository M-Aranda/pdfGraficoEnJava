/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.util.Date;
import java.util.List;

/**
 *
 * @author Chelo
 */
public class Curriculum {
    
    private int id;
    private String nombre, apellido, rut;
    private Date fechaNacimiento;
    private String nacionalidad, estadoCivil;
    private boolean esHombre;
    private String telefono, correo, direccion,  nivelDeEstudio, ocupación, disponibilidad;

    public Curriculum() {
    }

    public Curriculum(int id, String nombre, String apellido, String rut, Date fechaNacimiento, String nacionalidad, String estadoCivil, boolean esHombre, String telefono, String correo, String direccion, String nivelDeEstudio, String ocupación, String disponibilidad) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.rut = rut;
        this.fechaNacimiento = fechaNacimiento;
        this.nacionalidad = nacionalidad;
        this.estadoCivil = estadoCivil;
        this.esHombre = esHombre;
        this.telefono = telefono;
        this.correo = correo;
        this.direccion = direccion;
        this.nivelDeEstudio = nivelDeEstudio;
        this.ocupación = ocupación;
        this.disponibilidad = disponibilidad;

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

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getRut() {
        return rut;
    }

    public void setRut(String rut) {
        this.rut = rut;
    }

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    public String getEstadoCivil() {
        return estadoCivil;
    }

    public void setEstadoCivil(String estadoCivil) {
        this.estadoCivil = estadoCivil;
    }

    public boolean isEsHombre() {
        return esHombre;
    }

    public void setEsHombre(boolean esHombre) {
        this.esHombre = esHombre;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getNivelDeEstudio() {
        return nivelDeEstudio;
    }

    public void setNivelDeEstudio(String nivelDeEstudio) {
        this.nivelDeEstudio = nivelDeEstudio;
    }

    public String getOcupación() {
        return ocupación;
    }

    public void setOcupación(String ocupación) {
        this.ocupación = ocupación;
    }

    public String getDisponibilidad() {
        return disponibilidad;
    }

    public void setDisponibilidad(String disponibilidad) {
        this.disponibilidad = disponibilidad;
    }

   
    @Override
    public String toString() {
        return "Curriculum{" + "id=" + id + ", nombre=" + nombre + ", apellido=" + apellido + ", rut=" + rut + ", fechaNacimiento=" + fechaNacimiento + ", nacionalidad=" + nacionalidad + ", estadoCivil=" + estadoCivil + ", esHombre=" + esHombre + ", telefono=" + telefono + ", correo=" + correo + ", direccion=" + direccion + ", nivelDeEstudio=" + nivelDeEstudio + ", ocupaci\u00f3n=" + ocupación + ", disponibilidad=" + disponibilidad + " '}";
    }

   
   
    
    
}
