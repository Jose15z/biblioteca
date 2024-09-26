package co.edu.uniquindio.poo;

import java.util.Collection;
import java.util.LinkedList;

public class Biblioteca {
    private String nombre;
    private double ganacia;
    private int cantidadLibros;
    private Collection<Libro> libros;
    private Collection<Bibliotecario> bibliotecarios;
    private Collection<Prestamo> prestamos;
    private Collection<Estudiante> estudiantes;
    private Modulo metodos = new Modulo();
    public Biblioteca(String nombre, double ganancia, int cantidadLibros) {
        this.nombre = nombre;
        libros = new LinkedList<>();
        bibliotecarios = new LinkedList<>();
        estudiantes = new LinkedList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Collection<Libro> getLibros() {
        return libros;
    }

    public void setLibros(Collection<Libro> libros) {
        this.libros = libros;
    }

    public Collection<Bibliotecario> getBibliotecarios() {
        return bibliotecarios;
    }

    public void setBibliotecarios(Collection<Bibliotecario> bibliotecarios) {
        this.bibliotecarios = bibliotecarios;
    }

    public Collection<Prestamo> getPrestamos() {
        return prestamos;
    }

    public void setPrestamos(Collection<Prestamo> prestamos) {
        this.prestamos = prestamos;
    }

    public Collection<Estudiante> getEstudiantes() {
        return estudiantes;
    }

    public void setEstudiantes(Collection<Estudiante> estudiantes) {
        this.estudiantes = estudiantes;
    }

    public double getGanacia() {
        return ganacia;
    }

    public void setGanacia(double ganacia) {
        this.ganacia = ganacia;
    }

    public int getCantidadLibros() {
        return cantidadLibros;
    }

    public void setCantidadLibros(int cantidadLibros) {
        this.cantidadLibros = cantidadLibros;
    }

    @Override
    public String toString() {
        return "Biblioteca [nombre=" + nombre + ", ganacia=" + ganacia + ", cantidadLibros=" + cantidadLibros
                + ", libros=" + libros + ", bibliotecarios=" + bibliotecarios + ", prestamos=" + prestamos
                + ", estudiantes=" + estudiantes + "]";
    }

    public void estudianteConMasPrestamos() {
        int mayorCantidadPrestamos = 0;
        String estudianteConMasPrestamos = "";
        for (Estudiante estudiante : estudiantes) {
            if (estudiante.getPrestamos().size() > mayorCantidadPrestamos) {
                mayorCantidadPrestamos = estudiante.getPrestamos().size();
                estudianteConMasPrestamos = estudiante.toString();
        }
        metodos.mostrarMensaje("El estudiante con mas prestamos es:\n:" + estudianteConMasPrestamos +  "\n con una cantidad de "+ mayorCantidadPrestamos + " prestamos");   
        }
    }

    public int determinarGanancias() {
        int ganacias = 0;
        for (Prestamo prestamo : prestamos) {
            ganacias += prestamo.getCosto();
        }
        return ganacias;
    }
}