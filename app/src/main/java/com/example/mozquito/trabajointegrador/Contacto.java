package com.example.mozquito.trabajointegrador;

public class Contacto {

    private int telefono;
    private String nombre;
    private String apellido;

    public Contacto(int telefono, String nombre, String apellido) {
        this.telefono = telefono;
        this.nombre = nombre;
        this.apellido = apellido;
    }

    public Contacto() {
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
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
}
