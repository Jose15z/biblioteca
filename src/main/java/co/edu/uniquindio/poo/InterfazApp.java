package co.edu.uniquindio.poo;
import javax.swing.JOptionPane;
public class InterfazApp {
    Modulo metodos = new Modulo();
    public void manejarSeleccion(String seleccion, Biblioteca biblioteca, InterfazApp interfaz) {
        switch (seleccion) {
            case "Libros":
                interfaz.manejarLibros(biblioteca);
            case "Prestamo":

            case "Estudiantes":

            case "Bibliotecarios":

        
        }
    }
    public void manejarLibros(Biblioteca biblioteca){
        String[] opciones = { "", "Ver Libros", "Agregar Libro", "Eliminar Libro",  "Volver" };
        String seleccion = (String) JOptionPane.showInputDialog(null, "Seleccione una opción", "Gestión de Grupos", JOptionPane.PLAIN_MESSAGE, null, opciones, opciones[0]);
        switch (seleccion) {
            case "Ver Libros":
                for(Libro libro: biblioteca.getLibros()){
                    metodos.mostrarMensaje(libro.toString() + "\n");
                }
            case "Agregar Libro":
                
         
        }
    }
}
