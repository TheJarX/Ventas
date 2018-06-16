package com.example.administrador.myapplication.Entities;

public class Detalle {

    Integer idVenta,Fecha,idCliente;

    public Detalle() {
    }

    public Detalle(Integer idVenta, Integer fecha, Integer idCliente) {
        this.idVenta = idVenta;
        Fecha = fecha;
        this.idCliente = idCliente;
    }

    public Integer getIdVenta() {
        return idVenta;
    }

    public void setIdVenta(Integer idVenta) {
        this.idVenta = idVenta;
    }

    public Integer getFecha() {
        return Fecha;
    }

    public void setFecha(Integer fecha) {
        Fecha = fecha;
    }

    public Integer getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(Integer idCliente) {
        this.idCliente = idCliente;
    }
}
