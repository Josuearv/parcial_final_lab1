/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Proyecto;


/**
 *
 * @author josue
 * Parcial Final De laboratorio 
 */

public class Proyecto {

    private String nombre;
    private String equipoAsignado;
    private String fechaInicio;
    private String fechaFinal;

    public Proyecto(String nombre, String equipoAsignado, String fechaInicio, String fechaFinal) {
        this.nombre = nombre;
        this.equipoAsignado = equipoAsignado;
        this.fechaInicio = fechaInicio;
        this.fechaFinal = fechaFinal;
    }
    
     // En este apartado creare los getters y los setters de los atributos
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEquipoAsignado() {
        return equipoAsignado;
    }

    public void setEquipoAsignado(String equipoAsignado) {
        this.equipoAsignado = equipoAsignado;
    }

    public String getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(String fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public String getFechaFinal() {
        return fechaFinal;
    }

    public void setFechaFinal(String fechaFinal) {
        this.fechaFinal = fechaFinal;
    }
}
