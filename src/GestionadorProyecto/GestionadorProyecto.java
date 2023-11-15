/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */




/**
 *
 * @author Josue Rosales Velilla 
 * Comision 4-C
 * 
 */
package GestionadorProyecto;
import Proyecto.Proyecto;
import java.util.ArrayList;
import java.util.Comparator;

/**
 * Clase que gestiona proyectos.
 */
public class GestionadorProyecto {

    // Lista que almacena proyectos
    private ArrayList<Proyecto> listaProyectos = new ArrayList<>();

    // Método para agregar un proyecto a la lista
    public void agregarProyecto(Proyecto proyecto) {
        listaProyectos.add(proyecto);
    }

    // Método para eliminar un proyecto de la lista
    public void eliminarProyecto(Proyecto proyecto) {
        listaProyectos.remove(proyecto);
    }

    // Método para buscar un proyecto por nombre
    public Proyecto buscarProyectoPorNombre(String nombre) {
        for (Proyecto proyecto : listaProyectos) {
            if (proyecto.getNombre().equalsIgnoreCase(nombre)) {
                return proyecto;
            }
        }
        return null; // Devuelve null si no se encuentra el proyecto
    }

    // Método para buscar un proyecto por equipo asignado
    public Proyecto buscarProyectoPorEquipo(String equipo) {
        for (Proyecto proyecto : listaProyectos) {
            if (proyecto.getEquipoAsignado().equalsIgnoreCase(equipo)) {
                return proyecto;
            }
        }
        return null; // Devuelve null si no se encuentra el proyecto
    }

    // Método para buscar un proyecto por fecha de inicio
    public Proyecto buscarProyectoPorFechaInicio(String fechaInicio) {
        for (Proyecto proyecto : listaProyectos) {
            if (proyecto.getFechaInicio().equalsIgnoreCase(fechaInicio)) {
                return proyecto;
            }
        }
        return null; // Devuelve null si no se encuentra el proyecto
    }

    // Método para buscar un proyecto por fecha de finalización
    public Proyecto buscarProyectoPorFechaFinal(String fechaFinal) {
        for (Proyecto proyecto : listaProyectos) {
            if (proyecto.getFechaFinal().equalsIgnoreCase(fechaFinal)) {
                return proyecto;
            }
        }
        return null; // Devuelve null si no se encuentra el proyecto
    }

    // Método de búsqueda secuencial
    public Proyecto buscarProyectoSecuencial(String clave, String atributo) {
        for (Proyecto proyecto : listaProyectos) {
            String valor;
            switch (atributo) {
                case "nombre":
                    valor = proyecto.getNombre();
                    break;
                case "equipo":
                    valor = proyecto.getEquipoAsignado();
                    break;
                case "fechaInicio":
                    valor = proyecto.getFechaInicio();
                    break;
                case "fechaFinal":
                    valor = proyecto.getFechaFinal();
                    break;
                default:
                    valor = ""; // Valor por defecto para manejar atributos no reconocidos
            }

            if (valor.equalsIgnoreCase(clave)) {
                return proyecto;
            }
        }
        return null; // Devuelve null si no se encuentra el proyecto
    }

    // Método de búsqueda binaria (requiere lista ordenada por el atributo especificado)
    public Proyecto buscarProyectoBinario(String clave, String atributo) {
        // Asegurarse de que la lista esté ordenada
        ordenarProyectosPorAtributo(atributo);

        // Realizar búsqueda binaria
        int inicio = 0;
        int fin = listaProyectos.size() - 1;

        while (inicio <= fin) {
            int medio = inicio + (fin - inicio) / 2;
            String valorMedio;
            switch (atributo) {
                case "nombre":
                    valorMedio = listaProyectos.get(medio).getNombre();
                    break;
                case "equipo":
                    valorMedio = listaProyectos.get(medio).getEquipoAsignado();
                    break;
                case "fechaInicio":
                    valorMedio = listaProyectos.get(medio).getFechaInicio();
                    break;
                case "fechaFinal":
                    valorMedio = listaProyectos.get(medio).getFechaFinal();
                    break;
                default:
                    valorMedio = ""; // Valor por defecto para manejar atributos no reconocidos
            }

            int comparacion = valorMedio.compareToIgnoreCase(clave);

            if (comparacion == 0) {
                return listaProyectos.get(medio); // Elemento encontrado
            } else if (comparacion < 0) {
                inicio = medio + 1;
            } else {
                fin = medio - 1;
            }
        }

        return null; // Elemento no encontrado
    }

    // Método para listar todos los proyectos en la lista
    public void listarProyectos() {
        for (Proyecto proyecto : listaProyectos) {
            System.out.println("Nombre: " + proyecto.getNombre() +
                    ", Equipo Asignado: " + proyecto.getEquipoAsignado() +
                    ", Fecha de Inicio: " + proyecto.getFechaInicio() +
                    ", Fecha Final: " + proyecto.getFechaFinal());
        }
    }

    // Método para ordenar la lista de proyectos por un atributo específico
    public void ordenarProyectosPorAtributo(String atributo) {
        switch (atributo) {
            case "nombre":
                listaProyectos.sort(Comparator.comparing(Proyecto::getNombre));
                break;
            case "equipo":
                listaProyectos.sort(Comparator.comparing(Proyecto::getEquipoAsignado));
                break;
            case "fechaInicio":
                listaProyectos.sort(Comparator.comparing(Proyecto::getFechaInicio));
                break;
            case "fechaFinal":
                listaProyectos.sort(Comparator.comparing(Proyecto::getFechaFinal));
                break;
            default:
                // No realizar ordenación si el atributo no es reconocido
        }
    }
}