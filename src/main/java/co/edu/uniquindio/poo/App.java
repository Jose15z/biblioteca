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
        while (continuar) {

            String[] usuarios = { "", "Estudiante", "Bibliotecario" };
            String usuarioEleccion = (String) JOptionPane.showInputDialog(null, "Seleccione el tipo de usuario",
                    "Menú Principal", JOptionPane.PLAIN_MESSAGE, null, usuarios, usuarios[0]);
            switch (usuarioEleccion) {
                case "Estudiante":
                    interfazApp.estudianteInicio(biblioteca, interfazApp);

                case "Bibliotecario":
                    String[] opcionesBibliotecario = { "", "Libros", "Prestamo", "Estudiantes", "Bibliotecarios",
                            "Salir" };
                    String seleccion = (String) JOptionPane.showInputDialog(null, "Seleccione una opción",
                            "Menú Principal",
                            JOptionPane.PLAIN_MESSAGE, null, opcionesBibliotecario, opcionesBibliotecario[0]);

                    interfazApp.manejarSeleccion(seleccion, biblioteca, interfazApp);

            }
        }

    }
}
