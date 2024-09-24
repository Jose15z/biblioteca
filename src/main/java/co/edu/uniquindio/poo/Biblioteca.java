package co.edu.uniquindio.poo;

import java.util.Collection;
import java.util.LinkedList;

public class Biblioteca {
    private String nombre;
    private Collection<Libro> libros;
    private Collection<Bibliotecario> bibliotecarios;
    private Collection<Prestamo> prestamos;
    private Collection<Estudiante> estudiantes;
    public Biblioteca(String nombre){
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

    public void estudianteConMasPrestamos(){
        int mayorCantidadPrestamos = 0; 
        String estudianteConMasPrestamos = "";
        for(Estudiante estudiante: estudiantes){
            if(estudiante.getPrestamos().size()> mayorCantidadPrestamos){
                mayorCantidadPrestamos = estudiante.getPrestamos().size();
            }
        }
        System.out.println("El estudante con mas prestamos es: " + estudianteConMasPrestamos + "\nCon una cantidad de : " + mayorCantidadPrestamos + " Libros");
    }

    @Override
    public String toString() {
        return "Biblioteca [nombre=" + nombre + ", libros=" + libros + ", bibliotecarios=" + bibliotecarios
                + ", prestamos=" + prestamos + ", estudiantes=" + estudiantes + "]";
    }

    public Collection<Estudiante> getEstudiantes() {
        return estudiantes;
    }

    public void setEstudiantes(Collection<Estudiante> estudiantes) {
        this.estudiantes = estudiantes;
    }
    
}
