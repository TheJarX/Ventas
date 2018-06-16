package com.example.administrador.myapplication.Entities;

public class Venta {

    int idVenta,idCliente,Fecha;

    public Venta() {

    }
    public Venta(int idVenta, int idCliente, int fecha) {
        this.idVenta = idVenta;
        this.idCliente = idCliente;
        Fecha = fecha;
    }

    public int getIdVenta() {
        return idVenta;
    }

    public void setIdVenta(int idVenta) {
        this.idVenta = idVenta;
    }

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public int getFecha() {
        return Fecha;
    }

    public void setFecha(int fecha) {
        Fecha = fecha;
    }
}
