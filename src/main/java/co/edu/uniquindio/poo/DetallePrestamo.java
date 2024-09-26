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
    public boolean verificarDisponibilidad(int cantidad, Libro libro){
        boolean estado = true;
        if(cantidad > libro.getUnidadesDisponibles()){
            estado = false;
        }
        return estado;
    }
    public double calcularSubtotal(){
        return cantidad * libro.getValor();
        
    }
        
}
