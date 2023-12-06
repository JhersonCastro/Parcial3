/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.bibliotecafinal;

import java.util.Date;
import java.util.concurrent.TimeUnit;

/**
 *
 * @author IngSis
 */
public class Prestamo {
    public Date fechaInicio, fechaFin;
    public Date calcularFechaFin(){
        long diffInMillies = Math.abs(fechaFin.getTime() - fechaInicio.getTime());
        long diff = TimeUnit.DAYS.convert(diffInMillies, TimeUnit.MILLISECONDS);
        return new Date(fechaInicio.getTime() + diffInMillies);
    }
    public void generarMulta(){
        
    }
}
