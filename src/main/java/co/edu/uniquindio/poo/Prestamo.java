package co.edu.uniquindio.poo;

import java.time.LocalDate;
import java.util.Collection;
import java.util.LinkedList;

public class Prestamo {

    private Estudiante estudiante;
    private Bibliotecario bibliotecarioAux;
    private LocalDate fechaPrestamo;
    private LocalDate fechaEntrega;
    private double costoDia;
    private String codigo;
    private Collection<DetallePrestamo> detallePrestamos;
    public Prestamo(Estudiante estudiante,  Bibliotecario bibliotecarioAux,  LocalDate fechaPrestamo,  LocalDate fechaEntrega, double costoDia, String codigo){
        this.estudiante = estudiante;
        this.bibliotecarioAux = bibliotecarioAux; 
        this.fechaPrestamo = fechaPrestamo;
        this.fechaEntrega = fechaEntrega;
        this.costoDia = costoDia;
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
        return costoDia;
    }
    public void setCosto(double costo) {
        this.costoDia = costo;
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
                + fechaEntrega + ", costo=" + costoDia + ", codigo=" + codigo + ", detallePrestamos=" + detallePrestamos
                + "]";
    }
    public void determinarCosto(){
       int cantidadDias = fechaEntrega.until(fechaPrestamo).getDays();
        for(DetallePrestamo detallePrestamo : detallePrestamos){
            detallePrestamo.setSubtotal(costoDia * cantidadDias);
        }
    }
    
}
