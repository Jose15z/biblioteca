package co.edu.uniquindio.poo;

import java.time.LocalDate;
import java.util.Collection;
import java.util.LinkedList;

public class Prestamo {

    private Estudiante estudiante;
    private Bibliotecario bibliotecarioAux;
    private LocalDate fechaPrestamo;
    private LocalDate fechaEntrega;
    private double costo;
    private Collection<Libro> librosPrestados;
    public Prestamo(Estudiante estudiante,  Bibliotecario bibliotecarioAux,  LocalDate fechaPrestamo,  LocalDate fechaEntrega, double costo){
        this.estudiante = estudiante;
        this.bibliotecarioAux = bibliotecarioAux; 
        this.fechaPrestamo = fechaPrestamo;
        this.fechaEntrega = fechaEntrega;
        this.costo = costo;
        librosPrestados = new LinkedList<>();
    }
    public Estudiante getEstudiante() {
        return estudiante;
    }
    public void setEstudiante(Estudiante estudiante) {
        this.estudiante = estudiante;
    }
    public Bibliotecario getBibliotecarioAux() {
        return bibliotecarioAux;
    }
    public void setBibliotecarioAux(Bibliotecario bibliotecarioAux) {
        this.bibliotecarioAux = bibliotecarioAux;
    }
    public LocalDate getFechaPrestamo() {
        return fechaPrestamo;
    }
    public void setFechaPrestamo(LocalDate fechaPrestamo) {
        this.fechaPrestamo = fechaPrestamo;
    }
    public LocalDate getFechaEntrega() {
        return fechaEntrega;
    }
    public void setFechaEntrega(LocalDate fechaEntrega) {
        this.fechaEntrega = fechaEntrega;
    }
    public double getCosto() {
        return costo;
    }
    public void setCosto(double costo) {
        this.costo = costo;
    }
    public Collection<Libro> getLibrosPrestados() {
        return librosPrestados;
    }
    public void setLibrosPrestados(Collection<Libro> librosPrestados) {
        this.librosPrestados = librosPrestados;
    }
    
}
