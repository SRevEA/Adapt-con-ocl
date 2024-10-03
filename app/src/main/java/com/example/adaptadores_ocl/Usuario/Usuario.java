package com.example.adaptadores_ocl.Usuario;

public class Usuario {

    private String Nombre;
    private String Color;
    private String img;

    public String getColor() {
        return Color;
    }

    public void setColor(String color) {
        Color = color;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public Usuario(String color, String nombre, String img) {
        Color = color;
        Nombre = nombre;
        this.img = img;
    }
}
