package com.example.administrador.myapplication.Entities;

public class Cliente {

    Integer idCliente,Telefono;
    String Nombre,Direccion;

    public Cliente() {
    }

    public Cliente(Integer idCliente, Integer telefono, String nombre, String direccion) {
        this.idCliente = idCliente;
        Telefono = telefono;
        Nombre = nombre;
        Direccion = direccion;
    }

    public Integer getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(Integer idCliente) {
        this.idCliente = idCliente;
    }

    public Integer getTelefono() {
        return Telefono;
    }

    public void setTelefono(Integer telefono) {
        Telefono = telefono;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public String getDireccion() {
        return Direccion;
    }

    public void setDireccion(String direccion) {
        Direccion = direccion;
    }
}
