package co.edu.uniquindio.poo;

import java.time.LocalDate;
import java.util.Collection;

public class Prestamo {

    private Estudiante estudiante;
    private Bibliotecario bibliotecarioAux;
    private LocalDate fechaPrestamo;
    private LocalDate fechaEntrega;
    private double costo;
    private String codigo;
    private Collection<DetallePrestamo> detallePrestamos;

    //METODO CONSTRUCTOR DE LA CLASE Prestamo
    public Prestamo(Estudiante estudiante, Bibliotecario bibliotecarioAux, LocalDate fechaPrestamo, LocalDate fechaEntrega, String codigo, Collection<DetallePrestamo> detallePrestamos) {
        this.estudiante = estudiante;
        this.bibliotecarioAux = bibliotecarioAux;
        this.fechaPrestamo = fechaPrestamo;
        this.fechaEntrega = fechaEntrega;
        this.costo = 0;
        this.detallePrestamos = detallePrestamos;
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

    //METODO PARA CALCULAR EL COSTO TOTAL DE UN PRESTAMO SEGUN SUS DETALLES Y CANTIDAD DE DIAS
    public void determinarCosto() {
        double costoFinal = 0;
        int cantidadDias = fechaEntrega.until(fechaPrestamo).getDays();
        for (DetallePrestamo detallePrestamo : detallePrestamos) {
            costoFinal += detallePrestamo.calcularSubtotal() * cantidadDias;
        }
        setCosto(costoFinal);
    }

    @Override
    public String toString() {
        return "Prestamo [Estudiante = " + estudiante + ", fecha cuando se hizo el prestamo = " + fechaPrestamo
                + ", fecha de entrega de materiales = " + fechaEntrega + ", costo = " + costo + ", codigo = "
                + codigo + ", detalle de prestamos = " + detallePrestamos + "]";
    }

}
