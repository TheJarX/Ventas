package com.example.administrador.myapplication.Entities;

public class Producto {

    int idProducto,Stock;
    Double Precio;
    String Descripcion;

    public Producto() {
    }

    public Producto(int idProducto, int stock, Double precio, String descripcion) {
        this.idProducto = idProducto;
        Stock = stock;
        Precio = precio;
        Descripcion = descripcion;
    }

    public int getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(int idProducto) {
        this.idProducto = idProducto;
    }

    public int getStock() {
        return Stock;
    }

    public void setStock(int stock) {
        Stock = stock;
    }

    public Double getPrecio() {
        return Precio;
    }

    public void setPrecio(Double precio) {
        Precio = precio;
    }

    public String getDescripcion() {
        return Descripcion;
    }

    public void setDescripcion(String descripcion) {
        Descripcion = descripcion;
    }
}
