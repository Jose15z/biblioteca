package co.edu.uniquindio.poo;
import javax.swing.JOptionPane;
import java.util.InputMismatchException;
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
}
