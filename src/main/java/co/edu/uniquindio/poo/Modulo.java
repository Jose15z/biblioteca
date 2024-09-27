package co.edu.uniquindio.poo;
import javax.swing.JOptionPane;
import java.util.InputMismatchException;
import java.time.LocalDate;
public class Modulo {
    public  String ingresarStringMensaje(String mensaje) {
        return JOptionPane.showInputDialog(mensaje);
    }
    // Método para ingresar un entero
    public int ingresarEntero(String mensaje) {
        int entero = 0;
        boolean repetir = true;
        while (repetir) {
            try {
                String stringentero = ingresarStringMensaje(mensaje);
                entero = Integer.parseInt(stringentero);
                repetir = false;
            } catch (InputMismatchException e) {
                JOptionPane.showMessageDialog(null, "Error, no ingreso real");
                repetir = true;
            }
        }
        return entero;
    }public double ingresarDouble(String mensaje) {
        double real = 0;
        boolean repetir = true;
        while (repetir) {
            try {
                String stringdouble = ingresarStringMensaje(mensaje);
                real = Double.parseDouble(stringdouble);
                repetir = false;
            } catch (InputMismatchException e) {
                JOptionPane.showMessageDialog(null, "Error, no ingreso real");
                repetir = true;
            }
        }
        return real;
    }
    public boolean ingresarEstado(){
        boolean estado = true;
        int n = JOptionPane.showConfirmDialog(
            null,
            "¿Esta disponible el libro?",
            "confirmar estado",
            JOptionPane.YES_NO_OPTION);
            if (n == JOptionPane.NO_OPTION){
                estado = false;
            }
        return estado;
    }
    public LocalDate ingresarFecha(String mensaje){
        mostrarMensaje(mensaje);
        int dia = ingresarEntero("Ingrese el dia");
        int mes = ingresarEntero("Ingrese el mes");
        int año = ingresarEntero("Ingrese el año");
        LocalDate fecha = LocalDate.of(año, mes, dia);
        return fecha;
    }

    public void mostrarMensaje(String mensaje){
        JOptionPane.showMessageDialog(null, mensaje);
    }
    public void mostrarMensaje(int mensaje){
        JOptionPane.showMessageDialog(null, mensaje);
    }
    public void mostrarMensaje(double mensaje){
        JOptionPane.showMessageDialog(null, mensaje);
    }


    public Libro ingresarLibro(){

        String titulo = ingresarStringMensaje("Ingrese el titullo de libro"); 
        String codigo = ingresarStringMensaje("Ingrese el codigo de el libro " + titulo);
        String isbn = ingresarStringMensaje("Ingrese el isbn de el libro " + titulo);
        String autor = ingresarStringMensaje("Ingrese el autor de el libro " + titulo);
        String editorial = ingresarStringMensaje("Ingrese la editorial de el libro " + titulo);
        LocalDate fechaPublicacion = ingresarFecha("Ingrese la fecha de publicacion del libro");
        boolean estado = ingresarEstado();
        int unidadesDisponibles = 0;
        if(estado){
            ingresarEntero("Ingrese la cantidad de unidades disponibles");
        }
        double valor = ingresarDouble("Ingrese el valor del libro");
        Libro libro = new Libro(titulo, codigo, isbn, autor, editorial, fechaPublicacion, estado, unidadesDisponibles, valor);
        return libro;
    }


    
}
