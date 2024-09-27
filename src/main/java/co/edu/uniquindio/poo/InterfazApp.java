package co.edu.uniquindio.poo;
import javax.swing.JOptionPane;
public class InterfazApp {
    Modulo metodos = new Modulo();
    public void manejarSeleccion(String seleccion, Biblioteca biblioteca, InterfazApp interfaz) {
        switch (seleccion) {
            case "Libros":
                interfaz.manejarLibros(biblioteca);
            case "Prestamo":
                interfaz.manejarPrestamos(biblioteca);
            case "Estudiantes":

            case "Bibliotecarios":

        
        }
    }
    public void manejarLibros(Biblioteca biblioteca){
        String[] opciones = { "", "Ver Libros", "Agregar Libro", "Eliminar Libro",  "Volver" };
        String seleccion = (String) JOptionPane.showInputDialog(null, "Seleccione una opción", "Gestión de Libros", JOptionPane.PLAIN_MESSAGE, null, opciones, opciones[0]);
        switch (seleccion) {
            case "Ver Libros":
                for(Libro libro: biblioteca.getLibros()){
                    metodos.mostrarMensaje(libro.toString() + "\n");
                    }
            case "Agregar Libro":
                    biblioteca.ingresarLibros();
            case "Eliminar Libro":
                    biblioteca.eliminarlibro();
        }
    }

    public void manejarPrestamos(Biblioteca biblioteca){
        String[] opciones = {"", "Ver Prestamos", "Ver un prestamo", "Agregar Prestamo", "Eliminar Prestamo", "Volver"};
        String seleccion = (String) JOptionPane.showInputDialog(null, "Seleccione una opción", "Gestion de prestamos", JOptionPane.PLAIN_MESSAGE, null, opciones, opciones[0]);
        switch (seleccion) {
            case "Ver Prestamos":
                for(Prestamo prestamo: biblioteca.getPrestamos()){
                    metodos.mostrarMensaje(prestamo.toString() + "\n");
                }
            case "Ver un prestamo":
                biblioteca.mostrarUnPrestamo();
            case "Agregar Prestamo":

            case "Eliminar Prestamo":
            
        }
    }

    public void manejarEstudiantes(Biblioteca biblioteca){
        String[] opciones = {"", "Ver Estudiantes",  "Ver Estudiante", "Agregar Estudiante","Eliminar Estudiante", "Ver Estudiante Con Mas Prestamos"};
        String seleccion = (String) JOptionPane.showInputDialog(null, "Sellecione una opcion", "Gestion de estudinates", JOptionPane.PLAIN_MESSAGE, null, opciones, opciones[0]);
        switch (seleccion) {
            case "Ver Estudiantes":
                for (Estudiante estudiante : biblioteca.getEstudiantes()) {
                    metodos.mostrarMensaje(estudiante.toString() + "\n");
                }
            case "Ver Estudiante":

            case "Agregar Estudiante": 

            case "Eliminar Estudiante": 

            case "Ver Estudiante Con Mas Prestamos":
                biblioteca.estudianteConMasPrestamos();
                
                
        }
    }
}
