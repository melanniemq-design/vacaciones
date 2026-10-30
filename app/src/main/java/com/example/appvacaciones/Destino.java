package com.example.appvacaciones;

public class Destino {
    private String nombre;
    private String ubicacion;
    private String duracion;
    private String precio;
    private int imagenResId;

    public Destino(String nombre, String ubicacion, String duracion, String precio, int imagenResId) {
        this.nombre = nombre;
        this.ubicacion = ubicacion;
        this.duracion = duracion;
        this.precio = precio;
        this.imagenResId = imagenResId;
    }

    public String getNombre() {
        return nombre;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public String getDuracion() {
        return duracion;
    }

    public String getPrecio() {
        return precio;
    }

    public int getImagenResId() {
        return imagenResId;
    }
}