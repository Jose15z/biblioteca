package co.edu.uniquindio.poo;

public class DetallePrestamo {
    private int cantidad;
    private Libro libro;
    double subtotal;
    public DetallePrestamo(int cantidad, Libro libro){
        this.libro = libro; 
        this.cantidad = cantidad;
        this.subtotal = 0;
    }
    public int getCantidad() {
        return cantidad;
    }
    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
    public Libro getLibro() {
        return libro;
    }
    public void setLibro(Libro libro) {
        this.libro = libro;
    }
    public double getSubtotal() {
        return subtotal;
    }
    public void setSubtotal(double subtotal) {
        this.subtotal = subtotal;
    }
    
}
