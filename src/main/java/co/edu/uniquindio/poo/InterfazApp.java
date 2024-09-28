package co.edu.uniquindio.poo;

import javax.swing.JOptionPane;

public class InterfazApp {
    Modulo metodos = new Modulo();

    public void manejarEstudianteSeleccion(String seleccionEstudiante2, Biblioteca biblioteca, InterfazApp interfaz,
            Estudiante estudianteSesion) {
        switch (seleccionEstudiante2) {
            case "Libros":
                for (Libro libro : biblioteca.getLibros()) {
                    metodos.mostrarMensaje(libro.toString() + "\n");
                }
                break;
            case "Prestamos":
                for (Prestamo prestamo : biblioteca.getPrestamos()) {
                    if (prestamo.getEstudiante().equals(estudianteSesion)) {
                        metodos.mostrarMensaje(prestamo.toString() + "\n");
                    }
                }
                break;

        }
    }

    public void estudianteInicio(Biblioteca biblioteca, InterfazApp interfaz) {
        String[] inicioEstudiantes = { "", "Ingresar id" };
        String seleccionEstudiante = (String) JOptionPane.showInputDialog(null, "Seleccione una opción",
                "Menú Principal",
                JOptionPane.PLAIN_MESSAGE, null, inicioEstudiantes, inicioEstudiantes[0]);
        switch (seleccionEstudiante) {
            case "Ingresar id":
                Estudiante estudianteSesion = null;

                boolean centinela = true;

                String idEstudianteABuscar = metodos.ingresarStringMensaje("Ingrese el id del estudiante");
                
                for (Estudiante estudiante : biblioteca.getEstudiantes()) {
                    if (estudiante.getCedula().equals(idEstudianteABuscar)) {

                        estudianteSesion = estudiante;
                        manejarEstudianteSeleccion(seleccionEstudiante, biblioteca, interfaz, estudianteSesion);
                        centinela = false;
                    }
                }
                if(centinela){
                    metodos.mostrarMensaje("Estudiante no encontrado");
                }
                
                break;
        }
    }

    public void manejarSeleccion(String seleccion, Biblioteca biblioteca, InterfazApp interfaz) {
        switch (seleccion) {
            case "Libros":
                interfaz.manejarLibros(biblioteca);
                break;
            case "Prestamo":
                interfaz.manejarPrestamos(biblioteca);
                break;
            case "Estudiantes":
                interfaz.manejarEstudiantes(biblioteca);
                break;
            case "Bibliotecarios":
                interfaz.manejarBibliotecarios(biblioteca);
                break;

        }
    }

    public void manejarLibros(Biblioteca biblioteca) {
        String[] opciones = { "", "Ver Libros", "Agregar Libro", "Eliminar Libro", "Volver" };
        String seleccion = (String) JOptionPane.showInputDialog(null, "Seleccione una opción", "Gestión de Libros",
                JOptionPane.PLAIN_MESSAGE, null, opciones, opciones[0]);
        switch (seleccion) {
            case "Ver Libros":
                for (Libro libro : biblioteca.getLibros()) {
                    metodos.mostrarMensaje(libro.toString() + "\n");
                }
                break;
            case "Agregar Libro":
                biblioteca.ingresarLibros();
                break;
            case "Eliminar Libro":
                biblioteca.eliminarlibro();
                break;
        }
    }

    public void manejarPrestamos(Biblioteca biblioteca) {
        String[] opciones = { "", "Ver Prestamos", "Ver un prestamo", "Agregar Prestamo", "Eliminar Prestamo",
                "Volver" };
        String seleccion = (String) JOptionPane.showInputDialog(null, "Seleccione una opción", "Gestion de prestamos",
                JOptionPane.PLAIN_MESSAGE, null, opciones, opciones[0]);
        switch (seleccion) {
            case "Ver Prestamos":
                for (Prestamo prestamo : biblioteca.getPrestamos()) {
                    metodos.mostrarMensaje(prestamo.toString() + "\n");
                }
                break;
            case "Ver un prestamo":
                biblioteca.mostrarUnPrestamo();
                break;
            case "Agregar Prestamo":
                biblioteca.ingresarPrestamo();
                break;
            case "Eliminar Prestamo":
                break;

        }
    }

    public void manejarEstudiantes(Biblioteca biblioteca) {
        String[] opciones = { "", "Ver Estudiantes", "Ver Estudiante", "Agregar Estudiante", "Eliminar Estudiante",
                "Ver Estudiante Con Mas Prestamos" };
        String seleccion = (String) JOptionPane.showInputDialog(null, "Sellecione una opcion", "Gestion de estudinates",
                JOptionPane.PLAIN_MESSAGE, null, opciones, opciones[0]);
        switch (seleccion) {
            case "Ver Estudiantes":
                for (Estudiante estudiante : biblioteca.getEstudiantes()) {
                    metodos.mostrarMensaje(estudiante.toString() + "\n");
                }
            case "Ver Estudiante":
                biblioteca.verEstudiante();
                break;
            case "Agregar Estudiante":
                biblioteca.ingresarEstudiantes();
                break;
            case "Eliminar Estudiante":
                biblioteca.eliminarEstudiante();
                break;
            case "Ver Estudiante Con Mas Prestamos":
                biblioteca.estudianteConMasPrestamos();
                break;
        }
    }

    public void manejarBibliotecarios(Biblioteca biblioteca) {
        String[] opciones = { "", "Ver Bibliotecarios", "Ver Bibliotecario", "Agregar Bibliotecario", "Calcular Nomina",
                "Obtener Sueldo", "Eliminar bibliotecario" };
        String seleccion = (String) JOptionPane.showInputDialog(null, "Selecicone una opcion", "Gestion bibliotecarios",
                JOptionPane.PLAIN_MESSAGE, null, opciones, opciones[0]);
        switch (seleccion) {
            case "Ver Bibliotecarios":
                for (Bibliotecario bibliotecario : biblioteca.getBibliotecarios()) {
                    metodos.mostrarMensaje(bibliotecario.toString() + "\n");
                }
                break;
            case "Ver Bibliotecario":
                biblioteca.verBibliotecario();
                break;
            case "Agregar Bibliotecario":
                biblioteca.ingresarBibliotecarios();
                break;
            case "Calcular Nomina":
                biblioteca.nominaTotalDeBibliotecarios();
                break;
            case "Obtener Sueldo":
                biblioteca.verSalarioBibliotecario();
                break;

            case "Eliminar bibliotecario":
                biblioteca.eliminarBibliotecario();
                break;
        }
    }
}
