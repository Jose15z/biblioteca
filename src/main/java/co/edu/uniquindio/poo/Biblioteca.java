package co.edu.uniquindio.poo;

import java.time.LocalDate;
import java.util.Collection;
import javax.swing.JOptionPane;
import java.util.LinkedList;

public class Biblioteca {

    private String nombre;
    private double ganacia;
    private int cantidadLibros;
    private Collection<Libro> libros;
    private Collection<Bibliotecario> bibliotecarios;
    private Collection<Prestamo> prestamos;
    private Collection<Estudiante> estudiantes;
    private Modulo metodos = new Modulo();

    public Biblioteca(String nombre) {
        this.nombre = nombre;
        libros = new LinkedList<>();
        bibliotecarios = new LinkedList<>();
        estudiantes = new LinkedList<>();
    }

    public void estudianteConMasPrestamos() {
        int mayorCantidadPrestamos = 0;
        String estudianteConMasPrestamos = "";
        for (Estudiante estudiante : estudiantes) {
            if (estudiante.getPrestamos().size() > mayorCantidadPrestamos) {
                mayorCantidadPrestamos = estudiante.getPrestamos().size();
                estudianteConMasPrestamos = estudiante.toString();
            }
            metodos.mostrarMensaje("El estudiante con mas prestamos es:\n:" + estudianteConMasPrestamos
                    + "\n con una cantidad de " + mayorCantidadPrestamos + " prestamos");
        }
    }

    public void verEstudiante() {
        String idEstudianteABuscar = metodos.ingresarStringMensaje("Ingrese el id del estudiante que desea ver");
        boolean estudianteNoEncontrado = true;
        for (Estudiante estudiante : estudiantes) {
            if (estudiante.getCedula().equals(idEstudianteABuscar)) {
                metodos.mostrarMensaje(estudiante.toString());
                estudianteNoEncontrado = false;
            }
        }
        if (estudianteNoEncontrado) {
            metodos.mostrarMensaje("Estudiante no encontrado");
        }
    }

    public boolean verificarEstudiante(String id) {
        boolean estaEstudiante = false;
        for (Estudiante estudiante : estudiantes) {
            if (estudiante.getCedula().equals(id)) {
                estaEstudiante = true;
            }
        }
        return estaEstudiante;
    }

    public Estudiante ingresarEstudiante() {
        String nombreEstudiante = metodos.ingresarStringMensaje("Ingrese el nombre del nuevo estudiante");
        String id = metodos.ingresarStringMensaje("Ingrese el numero de cedula de " + nombreEstudiante);
        String correo = metodos.ingresarStringMensaje("Ingrese el correo de " + nombreEstudiante);
        int edad = metodos.ingresarEntero("Ingrese la edad de " + nombreEstudiante);
        Estudiante estudiante = new Estudiante(nombreEstudiante, id, correo, edad);
        return estudiante;
    }

    public void eliminarEstudiante() {
        String idEstudianteABuscar = metodos.ingresarStringMensaje("Ingrese el id del estudiante quee desea eliminar");
        for (Estudiante estudiante : estudiantes) {
            if (estudiante.getCedula().equals(idEstudianteABuscar)) {
                estudiantes.remove(estudiante);
            }
        }
    }

    public void ingresarEstudiantes() {

        boolean centinela = true;
        while (centinela) {
            Estudiante estudiante = ingresarEstudiante();
            if (!verificarEstudiante(estudiante.getCedula())) {
                estudiantes.add(estudiante);
            }
            int respuesta = JOptionPane.showConfirmDialog(
                    null,
                    "¿Desea Ingresar Otro Estudiante?",
                    "Confirmar",
                    JOptionPane.YES_NO_OPTION);
            if (respuesta == JOptionPane.NO_OPTION) {
                centinela = false;
            }
        }
    }

    public int determinarGanancias() {
        int ganacias = 0;
        for (Prestamo prestamo : prestamos) {
            ganacias += prestamo.getCosto();
        }
        return ganacias;
    }

    public void verBibliotecario() {
        String idBibliotecarioABuscar = metodos.ingresarStringMensaje("Ingrese el id del bibliotecario que desea ver");
        boolean bibliotecarioNoEncontrado = true;
        for (Bibliotecario bibliotecario : bibliotecarios) {
            if (bibliotecario.getCedula().equals(idBibliotecarioABuscar)) {
                metodos.mostrarMensaje(bibliotecario.toString());
                bibliotecarioNoEncontrado = false;
            }
        }
        if (bibliotecarioNoEncontrado) {
            metodos.mostrarMensaje("Bibliotecario no encontrado");
        }
    }

    public boolean verificarBibliotecario(String id) {
        boolean estaBibliotecario = false;
        for (Bibliotecario bibliotecario : bibliotecarios) {
            if (bibliotecario.getCedula().equals(id)) {
                estaBibliotecario = true;
            }
        }
        return estaBibliotecario;
    }

    public Bibliotecario ingresarBibliotecario() {
        String nombreBibliotecario = metodos.ingresarStringMensaje("Ingrese el nombre del bibliotecario");
        String cedula = metodos.ingresarStringMensaje("Ingrese el id de el bibliotecario" + nombreBibliotecario);
        String correo = metodos.ingresarStringMensaje("Ingrese el correo de el bibliotecario " + nombreBibliotecario);
        String telfono = metodos.ingresarStringMensaje("Ingrese el telefono del bibliotecario " + nombreBibliotecario);
        double salario = metodos.ingresarDouble("Ingrese el salario base del biblotecario" + nombreBibliotecario);
        int antiguedad = metodos.ingresarEntero("Ingrese la antiguedad del bibliotecario " + nombreBibliotecario);
        Bibliotecario bibliotecario = new Bibliotecario(nombreBibliotecario, cedula, correo, telfono, salario,
                antiguedad);
        return bibliotecario;
    }

    public void ingresarBibliotecarios() {
        boolean centinela = true;
        while (centinela) {
            Bibliotecario bibliotecario = ingresarBibliotecario();
            if (!verificarBibliotecario(bibliotecario.getCedula())) {
                bibliotecarios.add(bibliotecario);
            }
            int respuesta = JOptionPane.showConfirmDialog(
                    null,
                    "¿Desea Ingresar Otro Bibliotecario?",
                    "Confirmar",
                    JOptionPane.YES_NO_OPTION);
            if (respuesta == JOptionPane.NO_OPTION) {
                centinela = false;
            }
        }
    }
    public void eliminarBibliotecario(){
        String idBibliotecarioAbuscar = metodos.ingresarStringMensaje("Ingrese el id de el bibliotecario que desea encontrar");
        boolean bibliotecarioNoEncontrado = true;
        for (Bibliotecario bibliotecario : bibliotecarios) {
            if(bibliotecario.getCedula().equals(idBibliotecarioAbuscar)){
                bibliotecarios.remove(bibliotecario);
                bibliotecarioNoEncontrado = false;
            }
        }
        if(bibliotecarioNoEncontrado){metodos.mostrarMensaje("Bibliotecario no encontrado");}


    }
    // un empleado gana el 20% del valor de cada préstamo que realice, más una
    // bonificación de un 2% de este total por cada año de antigüedad que tenga.
    public void determinarSalarioBiblotecario(Bibliotecario bibliotecario) {
            double bonificacion = bibliotecario.getAntiguedad() * (bibliotecario.getSalario() * 0.02);
            for (Prestamo prestamo : prestamos) {
                if (prestamo.getBibliotecarioAux().getCedula().equals(bibliotecario.getCedula())) {
                    bonificacion += prestamo.getCosto() * 0.2;
                }
                bibliotecario.setSalario(bibliotecario.getSalario() + bonificacion);
        }
    }

    public double nominaTotalDeBibliotecarios() {
        double totalAPagar = 0;
        for (Bibliotecario bibliotecario : bibliotecarios) {
            totalAPagar += bibliotecario.getSalario();
        }
        return totalAPagar;
    }

    public int unidadesLibroEnPrestamos(String titulo) {
        int catidadPrestamos = 0;
        for (Prestamo prestamo : prestamos) {
            for (DetallePrestamo detallePrestamo : prestamo.getDetallePrestamos()) {
                if (detallePrestamo.getLibro().getTitulo().equals(titulo)) {
                    catidadPrestamos += 1;
                }
            }
        }
        return catidadPrestamos;
    }

    public void eliminarlibro() {
        String codigoABuscar = metodos.ingresarStringMensaje("Ingrese el codigo del libro que desea eliminar");
        for (Libro libro : libros) {
            if (libro.getCodigo().equals(codigoABuscar)) {
                libros.remove(libro);
            }
        }
    }

    public Libro ingresarLibro() {

        String titulo = metodos.ingresarStringMensaje("Ingrese el titullo de libro");
        String codigo = metodos.ingresarStringMensaje("Ingrese el codigo de el libro " + titulo);
        String isbn = metodos.ingresarStringMensaje("Ingrese el isbn de el libro " + titulo);
        String autor = metodos.ingresarStringMensaje("Ingrese el autor de el libro " + titulo);
        String editorial = metodos.ingresarStringMensaje("Ingrese la editorial de el libro " + titulo);
        LocalDate fechaPublicacion = metodos.ingresarFecha("Ingrese la fecha de publicacion del libro");
        boolean estado = metodos.ingresarEstado();
        int unidadesDisponibles = 0;
        if (estado) {
            metodos.ingresarEntero("Ingrese la cantidad de unidades disponibles");
        }
        double valor = metodos.ingresarDouble("Ingrese el valor del libro");
        Libro libro = new Libro(titulo, codigo, isbn, autor, editorial, fechaPublicacion, estado, unidadesDisponibles,
                valor);
        return libro;
    }

    public void ingresarLibros() {
        boolean centinela = true;
        while (centinela) {
            libros.add(ingresarLibro());
            int respuesta = JOptionPane.showConfirmDialog(
                    null,
                    "¿Desea Ingresar Otro Libro?",
                    "Confirmar",
                    JOptionPane.YES_NO_OPTION);
            if (respuesta == JOptionPane.NO_OPTION) {
                centinela = false;
            }
        }
    }

    public void mostrarUnPrestamo() {
        String codigoPrestamoABuscar = metodos
                .ingresarStringMensaje("Ingrese el codigo del prestamo que desea mostrar");
        boolean noSeEncuentra = true;
        for (Prestamo prestamo : prestamos) {
            if (prestamo.getCodigo().equals(codigoPrestamoABuscar)) {
                metodos.mostrarMensaje(prestamo.toString());
                noSeEncuentra = false;
            }
        }
        if (noSeEncuentra) {
            metodos.mostrarMensaje("Libro no encontrado");
        }
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Collection<Libro> getLibros() {
        return libros;
    }

    public void setLibros(Collection<Libro> libros) {
        this.libros = libros;
    }

    public Collection<Bibliotecario> getBibliotecarios() {
        return bibliotecarios;
    }

    public void setBibliotecarios(Collection<Bibliotecario> bibliotecarios) {
        this.bibliotecarios = bibliotecarios;
    }

    public Collection<Prestamo> getPrestamos() {
        return prestamos;
    }

    public void setPrestamos(Collection<Prestamo> prestamos) {
        this.prestamos = prestamos;
    }

    public Collection<Estudiante> getEstudiantes() {
        return estudiantes;
    }

    public void setEstudiantes(Collection<Estudiante> estudiantes) {
        this.estudiantes = estudiantes;
    }

    public double getGanacia() {
        return ganacia;
    }

    public void setGanacia(double ganacia) {
        this.ganacia = ganacia;
    }

    public int getCantidadLibros() {
        return cantidadLibros;
    }

    public void setCantidadLibros(int cantidadLibros) {
        this.cantidadLibros = cantidadLibros;
    }

    @Override
    public String toString() {
        return "Biblioteca [Nombre = " + nombre + ", ganacia = " + ganacia + ", cantidad de Libros = " + cantidadLibros
                + ", libros = " + libros + ", bibliotecarios = " + bibliotecarios + ", prestamos = " + prestamos
                + ", estudiantes = " + estudiantes + "]";
    }
}
