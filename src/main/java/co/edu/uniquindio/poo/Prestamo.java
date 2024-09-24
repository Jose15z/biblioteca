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
    private String codigo;
    private Collection<DetallePrestamo> detallePrestamos;
    public Prestamo(Estudiante estudiante,  Bibliotecario bibliotecarioAux,  LocalDate fechaPrestamo,  LocalDate fechaEntrega, double costo, String codigo){
        this.estudiante = estudiante;
        this.bibliotecarioAux = bibliotecarioAux; 
        this.fechaPrestamo = fechaPrestamo;
        this.fechaEntrega = fechaEntrega;
        this.costo = costo;
        detallePrestamos = new LinkedList<>();
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
    
    public String getCodigo() {
        return codigo;
    }
    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }
    public Collection<DetallePrestamo> getDetallePrestamos() {
        return detallePrestamos;
    }
    public void setDetallePrestamos(Collection<DetallePrestamo> detallePrestamos) {
        this.detallePrestamos = detallePrestamos;
    }
    @Override
    public String toString() {
        return "Prestamo [estudiante=" + estudiante + ", fechaPrestamo=" + fechaPrestamo + ", fechaEntrega="
                + fechaEntrega + ", costo=" + costo + ", codigo=" + codigo + ", detallePrestamos=" + detallePrestamos
                + "]";
    }
    
}
