package co.edu.uniquindio.poo;

import java.time.LocalDate;
import java.util.InputMismatchException;

import javax.swing.JOptionPane;

public class Modulo {

    //METODO PARA INGRESAR UN MENSAJE 
    public String ingresarStringMensaje(String mensaje) {
        return JOptionPane.showInputDialog(mensaje);
    }

    // METODO PARA INGRESAR UN ENTERO
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
    }

    //METODO PARA INGRESAR UN DOUBLE
    public double ingresarDouble(String mensaje) {
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

    //METODO PARA INGRESAR LA DISPONIBILIDAD DE UN LIBRO
    public boolean ingresarEstado() {
        boolean estado = true;
        int n = JOptionPane.showConfirmDialog(
                null,
                "¿Esta disponible el libro?",
                "confirmar estado",
                JOptionPane.YES_NO_OPTION);
        if (n == JOptionPane.NO_OPTION) {
            estado = false;
        }
        return estado;
    }

    //METODO PARA INGRESAR UNA FECHA
    public LocalDate ingresarFecha(String mensaje) {
        mostrarMensaje(mensaje);
        int dia = ingresarEntero("Ingrese el dia");
        int mes = ingresarEntero("Ingrese el mes");
        int año = ingresarEntero("Ingrese el año");
        LocalDate fecha = LocalDate.of(año, mes, dia);
        return fecha;
    }

    //METODO PARA MOSTRAR UN MENSAJE (PRINT) 
    public void mostrarMensaje(String mensaje) {
        JOptionPane.showMessageDialog(null, mensaje);
    }

}
