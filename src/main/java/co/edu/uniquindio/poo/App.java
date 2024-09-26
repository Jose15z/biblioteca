package co.edu.uniquindio.poo;
import javax.swing.JOptionPane;
/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) {
        Biblioteca biblioteca = new Biblioteca("UQ");
        InterfazApp interfazApp = new InterfazApp();
        boolean continuar = true;
        while(continuar){
            String[] opciones = {"", "Libros", "Prestamo", "Estudiantes", "Bibliotecarios"};
            String seleccion = (String) JOptionPane.showInputDialog(null, "Seleccione una opción", "Menú Principal", JOptionPane.PLAIN_MESSAGE, null, opciones, opciones[0]);

            //Casos en los que el programa finalizas
            if (seleccion == null || seleccion.equals("Salir")) {
                continuar = false;
            } 
            //Llamada al método que determina las acciones según la opción elegida
            else {
                interfazApp.manejarSeleccion(seleccion, biblioteca, interfazApp);
            }
        }
    }
}
