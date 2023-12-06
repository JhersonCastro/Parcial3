/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.bibliotecafinal;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author IngSis
 */
public class Autor {
    private ArrayList<Libro> arrLibros;
    public String nombre, nacionalidad;
    public Date fechaNacimiento;

    public Autor(Libro libro, String nombre, String nacionalidad, Date fechaNacimiento) {
        this.arrLibros.add(libro);
        this.nombre = nombre;
        this.nacionalidad = nacionalidad;
        this.fechaNacimiento = fechaNacimiento;
    }
}
