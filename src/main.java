/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author josue
 */


import GestionadorProyecto.GestionadorProyecto;
import Proyecto.Proyecto;

public class main {

    public static void main(String[] args) {
        // Crear una instancia del GestionadorProyecto
        GestionadorProyecto gestionador = new GestionadorProyecto();

        // Crear algunos proyectos
        Proyecto proyecto1 = new Proyecto("Proyecto1", "Equipo1", "2023-01-01", "2023-03-01");
        Proyecto proyecto2 = new Proyecto("Proyecto2", "Equipo2", "2023-02-01", "2023-04-01");
        Proyecto proyecto3 = new Proyecto("Proyecto3", "Equipo3", "2023-03-01", "2023-05-01");

        // Agregar proyectos al GestionadorProyecto
        gestionador.agregarProyecto(proyecto1);
        gestionador.agregarProyecto(proyecto2);
        gestionador.agregarProyecto(proyecto3);

        // Mostrar la lista de proyectos antes de cualquier operación
        System.out.println("Antes de la ordenación:");
        gestionador.listarProyectos();

        // Ejemplo de búsqueda secuencial por fecha de inicio
        String fechaInicioBusquedaSecuencial = "2023-02-01";
        Proyecto proyectoEncontradoSecuencial = gestionador.buscarProyectoSecuencial(fechaInicioBusquedaSecuencial, "fechaInicio");

        if (proyectoEncontradoSecuencial != null) {
            System.out.println("\nProyecto encontrado por fecha de inicio (secuencial) '" + fechaInicioBusquedaSecuencial + "': " +
                    proyectoEncontradoSecuencial.getNombre());
        } else {
            System.out.println("\nProyecto no encontrado por fecha de inicio (secuencial) '" + fechaInicioBusquedaSecuencial + "'");
        }

        // Ordenar por fecha de inicio usando el método general de ordenación
        gestionador.ordenarProyectosPorAtributo("fechaInicio");

        // Mostrar la lista de proyectos después de la ordenación por fecha de inicio
        System.out.println("\nDespués de la ordenación por fecha de inicio:");
        gestionador.listarProyectos();

        // Ejemplo de búsqueda binaria por fecha de inicio
        String fechaInicioBusquedaBinaria = "2023-02-01";
        Proyecto proyectoEncontradoBinaria = gestionador.buscarProyectoBinario(fechaInicioBusquedaBinaria, "fechaInicio");

        if (proyectoEncontradoBinaria != null) {
            System.out.println("\nProyecto encontrado por fecha de inicio (binaria) '" + fechaInicioBusquedaBinaria + "': " +
                    proyectoEncontradoBinaria.getNombre());
        } else {
            System.out.println("\nProyecto no encontrado por fecha de inicio (binaria) '" + fechaInicioBusquedaBinaria + "'");
        }
    }
}