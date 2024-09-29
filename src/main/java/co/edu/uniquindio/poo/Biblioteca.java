package co.edu.uniquindio.poo;

import java.time.LocalDate;
import java.util.Collection;
import java.util.LinkedList;

import javax.swing.JOptionPane;

public class Biblioteca {

    private String nombre;
    private double ganacia;
    private int cantidadLibros;
    private Collection<Libro> libros;
    private Collection<Bibliotecario> bibliotecarios;
    private Collection<Prestamo> prestamos;
    private Collection<Estudiante> estudiantes;
    private Modulo metodos = new Modulo();

    //CONSTRUCTOR DE LA CLASE Biblioteca
    public Biblioteca(String nombre) {

        this.nombre = nombre;
        libros = new LinkedList<>();
        bibliotecarios = new LinkedList<>();
        estudiantes = new LinkedList<>();

    }

    //METODO PARA OBTENER ESTUDIANTE CON MAS PRESTAMOS Y SU CANTIDAD DE PRESTAMOS DE LA BIBLIOTECA
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

    //METODO PARA BUSCAR UN ESTUDIANTE SEGÚN SU NUMERO DE CEDULA (ID)
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

    //METODO PARA VERIFICAR SI UN ESTUDIANTE YA ESTA REGISTRADO EN LA BIBLIOTECA
    public boolean verificarEstudiante(String id) {
        boolean estaEstudiante = false;
        for (Estudiante estudiante : estudiantes) {
            if (estudiante.getCedula().equals(id)) {
                estaEstudiante = true;
            }
        }
        return estaEstudiante;
    }

    //METODO PARA INGRESAR UN ESTUDIANTE A LA BIBLIOTECA
    public Estudiante ingresarEstudiante() {
        String nombreEstudiante = metodos.ingresarStringMensaje("Ingrese el nombre del nuevo estudiante");
        String id = metodos.ingresarStringMensaje("Ingrese el numero de cedula de " + nombreEstudiante);
        String correo = metodos.ingresarStringMensaje("Ingrese el correo de " + nombreEstudiante);
        int edad = metodos.ingresarEntero("Ingrese la edad de " + nombreEstudiante);
        Estudiante estudiante = new Estudiante(nombreEstudiante, id, correo, edad);
        return estudiante;
    }

    //METODO PARA ELIMINAR UN ESTUDIANTE DE LA BIBLIOTECA
    public void eliminarEstudiante() {
        String idEstudianteABuscar = metodos.ingresarStringMensaje("Ingrese el id del estudiante quee desea eliminar");
        for (Estudiante estudiante : estudiantes) {
            if (estudiante.getCedula().equals(idEstudianteABuscar)) {
                estudiantes.remove(estudiante);
            }
        }
    }

    //METODO EN CICLO QUE PREGUNTA SI SE DESEA AGREGAR MAS ESTUDIANTES DESPUES HABER INGRESADO UNO PREVIAMENTE
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

    //METODO PARA BUSCAR UN BIBLIOTECARIO SEGÚN SU NUMERO DE CEDULA (ID)
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

    //METODO PARA VERIFICAR SI UN BIBLIOTECARIO YA ESTA REGISTRADO EN LA BIBLIOTECA
    public boolean verificarBibliotecario(String id) {
        boolean estaBibliotecario = false;
        for (Bibliotecario bibliotecario : bibliotecarios) {
            if (bibliotecario.getCedula().equals(id)) {
                estaBibliotecario = true;
            }
        }
        return estaBibliotecario;
    }

    //METODO PARA INGRESAR UN BIBLIOTECARIO A LA BIBLIOTECA
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

    //METODO EN CICLO QUE PREGUNTA SI SE DESEA AGREGAR MAS BIBLIOTECARIOS DESPUES HABER INGRESADO UNO PREVIAMENTE
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

    //METODO PARA ELIMINAR UN ESTUDIANTE DE LA BIBLIOTECA
    public void eliminarBibliotecario() {
        String idBibliotecarioAbuscar = metodos.ingresarStringMensaje("Ingrese el id de el bibliotecario que desea encontrar");
        boolean bibliotecarioNoEncontrado = true;
        for (Bibliotecario bibliotecario : bibliotecarios) {
            if (bibliotecario.getCedula().equals(idBibliotecarioAbuscar)) {
                bibliotecarios.remove(bibliotecario);
                bibliotecarioNoEncontrado = false;
            }
        }
        if (bibliotecarioNoEncontrado) {
            metodos.mostrarMensaje("Bibliotecario no encontrado");
        }

    }

    /* METODO PARA CALCULAR EL SALARIO DE UN BIBLIOTECARIO SEGUN LOS PRESTAMOS QUE HAYA REALIZADO A SU NOMBRE
    * FUNCION : Un empleado gana el 20% del valor de cada préstamo que realice, más 
    una bonificación de un 2% de este total por cada año de antigüedad que tenga*/
    public double determinarSalarioBiblotecario(Bibliotecario bibliotecario) {
        double bonificacion = bibliotecario.getAntiguedad() * (bibliotecario.getSalario() * 0.02);
        double salarioFinal = 0;
        for (Prestamo prestamo : prestamos) {
            if (prestamo.getBibliotecarioAux().getCedula().equals(bibliotecario.getCedula())) {
                bonificacion += prestamo.getCosto() * 0.2;
            }
            salarioFinal = (bibliotecario.getSalario() + bonificacion);
        }
        return salarioFinal;
    }

    //METODO PARA VER EL SALARIO DE UN BIBLIOTECARIO SEGUN EL NUMERO DE CEDULA (ID)
    public void verSalarioBibliotecario() {
        String idBibliotecarioAbuscar = metodos.ingresarStringMensaje("Ingrese el id de el bibliotecario que desea encontrar");
        double salarioBibliotecario;
        boolean bibliotecarioNoEncontrado = true;
        for (Bibliotecario bibliotecario : bibliotecarios) {
            if (bibliotecario.getCedula().equals(idBibliotecarioAbuscar)) {
                salarioBibliotecario = determinarSalarioBiblotecario(bibliotecario);
                metodos.mostrarMensaje("El salario del bibliotecario " + bibliotecario.getNombre() + "es de " + salarioBibliotecario);
                bibliotecarioNoEncontrado = false;
            }
        }
        if (bibliotecarioNoEncontrado) {
            metodos.mostrarMensaje("Bibliotecario no encontrado");
        }
    }

    //METODO QUE CALCULA Y DETERMINA EL DINERO TOTAL QUE LA BIBLIOTECA LE TIENE QUE PAGAR A LOS BIBLIOTECARIOS
    public double nominaTotalDeBibliotecarios() {
        double totalAPagar = 0;
        for (Bibliotecario bibliotecario : bibliotecarios) {
            totalAPagar += determinarSalarioBiblotecario(bibliotecario);
        }
        return totalAPagar;
    }

    //METODO QUE CALCULA Y DA LA CANTIDAD DE LIBROS QUE ESTAN PRESTADOS SEGUN LOS PRESTAMOS
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

    //METODO PARA ELIMINAR UN LIBRO DE LA BIBLIOTECA
    public void eliminarlibro() {
        String codigoABuscar = metodos.ingresarStringMensaje("Ingrese el codigo del libro que desea eliminar");
        for (Libro libro : libros) {
            if (libro.getCodigo().equals(codigoABuscar)) {
                libros.remove(libro);
            }
        }
    }

    //METODO PARA INGRESAR UN BIBLIOTECARIO A LA BIBLIOTECA
    public Libro ingresarLibro() {

        String titulo = metodos.ingresarStringMensaje("Ingrese el titulo de libro");
        String codigo = metodos.ingresarStringMensaje("Ingrese el codigo de el libro " + titulo);
        String isbn = metodos.ingresarStringMensaje("Ingrese el isbn de el libro " + titulo);
        String autor = metodos.ingresarStringMensaje("Ingrese el autor de el libro " + titulo);
        String editorial = metodos.ingresarStringMensaje("Ingrese la editorial de el libro " + titulo);
        LocalDate fechaPublicacion = metodos.ingresarFecha("Ingrese la fecha de publicacion del libro" + titulo);
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

    //METODO EN CICLO QUE PREGUNTA SI SE DESEA AGREGAR MAS LIBROS DESPUES HABER INGRESADO UNO PREVIAMENTE
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

    //METODO PARA INGRESAR LOS DETALLES DE UN PRESTAMO
    public DetallePrestamo ingresarDetallePrestamo() {
        int cantidad = metodos.ingresarEntero("Ingrese la cantidad de prestamos que desea ingresar");
        String tituloLibro = metodos.ingresarStringMensaje("Ingrese el titulo del libro que desea prestar");
        Libro libroSeleccionado = null;
        for (Libro libro : libros) {
            if (libro.getTitulo().equals(tituloLibro) && libro.isEstado() && libro.getUnidadesDisponibles() >= cantidad) {
                libroSeleccionado = libro;
                libro.setUnidadesDisponibles(libro.getUnidadesDisponibles() - cantidad);
            }

        }
        if (libroSeleccionado != null) {
            DetallePrestamo detallePrestamo = new DetallePrestamo(cantidad, libroSeleccionado);
            detallePrestamo.setSubtotal(detallePrestamo.calcularSubtotal());
            return detallePrestamo;
        } else {
            metodos.mostrarMensaje("Libro no disponible");
            return null;
        }
    }

    //METODO PARA VERIFICAR SI UN PRESTAMO YA EXISTE SEGUN SUS DETALLES
    public boolean verificarDetallePrestamo(String titulo, Collection<DetallePrestamo> detallePrestamos) {
        boolean estaDetalle = false;
        for (DetallePrestamo detallePrestamo : detallePrestamos) {
            if (detallePrestamo.getLibro().getTitulo().equals(titulo)) {
                estaDetalle = true;
            }
        }
        return estaDetalle;
    }

    //METODO PARA CREAR UN PRESTAMO
    public void ingresarPrestamo() {
        Estudiante estudiantePrestamo = null;
        String idEstudianteABuscar = metodos.ingresarStringMensaje("Ingrese el id del estudiante que desea hacer el prestamo");
        boolean estaEstudiante = false;
        Bibliotecario bibliotecarioPrestamo = null;
        String idBibliotecarioABUscar = metodos.ingresarStringMensaje("Ingrese el id del bibliotecario que desea ingresar");
        boolean estaBibliotecario = false;
        LocalDate fechaPrestamo;
        LocalDate fechaEntrega;
        String codigo;
        Collection<DetallePrestamo> detallePrestamos = new LinkedList<>();
        for (Estudiante estudiante : estudiantes) {
            if (estudiante.getCedula().equals(idEstudianteABuscar)) {
                estaEstudiante = true;
                estudiantePrestamo = estudiante;
            }
        }
        for (Bibliotecario bibliotecario : bibliotecarios) {
            if (bibliotecario.getCedula().equals(idBibliotecarioABUscar)) {
                estaBibliotecario = true;
                bibliotecarioPrestamo = bibliotecario;
            }
        }
        if (estaBibliotecario && estaEstudiante) {
            fechaPrestamo = metodos.ingresarFecha("Ingrese la fecha en la que se realiza el prestamo");
            fechaEntrega = metodos.ingresarFecha("Ingrese la fecha en la que se va a entregar el prestamo");
            codigo = metodos.ingresarStringMensaje("Ingrese el codigo del prestamo");
            boolean centinela = true;
            while (centinela) {
                DetallePrestamo detallePrestamo = ingresarDetallePrestamo();
                if (!verificarDetallePrestamo(detallePrestamo.getLibro().getTitulo(), detallePrestamos)) {
                    detallePrestamos.add(detallePrestamo);
                }
                int respuesta = JOptionPane.showConfirmDialog(
                        null,
                        "¿Desea Ingresar Otro Detalle del Prestamo?",
                        "Confirmar",
                        JOptionPane.YES_NO_OPTION);
                if (respuesta == JOptionPane.NO_OPTION) {
                    centinela = false;
                    Prestamo prestamo = new Prestamo(estudiantePrestamo, bibliotecarioPrestamo, fechaPrestamo, fechaEntrega, codigo, detallePrestamos);
                    prestamos.add(prestamo);

                }

            }
        }

    }

    //METODO PARA VER UN PRESTAMO SEGUN SU CODIGO
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

    //METODO QUE DETERMINA LAS GANANCIAS TOTALES DE LA BIBLIOTECA SEGUN EL PRECIO DE CADA PRESTAMO
    public int determinarGanancias() {
        int ganacias = 0;
        for (Prestamo prestamo : prestamos) {
            ganacias += prestamo.getCosto();
        }
        return ganacias;
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
        return "Biblioteca [Nombre = " + nombre + " ganacia = " + ganacia + ", cantidad de Libros = " + cantidadLibros
                + ", libros = " + libros + ", bibliotecarios = " + bibliotecarios + ", prestamos = " + prestamos
                + ", estudiantes = " + estudiantes + "]";
    }
}
