package co.edu.uniquindio.poo;

import java.time.LocalDate;

public class Libro {
    private String titulo; 
    private String codigo;
    private String isbn;
    private String autor;
    private String editorial;
    private LocalDate fechaPublicacion;
    private boolean estado;
    private int unidadesDisponibles;

    public Libro(String titulo, String codigo, String isbn, String autor, String editorial, LocalDate fechaPublicacion, boolean estado, int unidadesDisponibles){
        this.titulo = titulo;
        this.codigo = codigo;
        this.isbn = isbn;
        this.autor = autor;
        this.editorial = editorial;
        this.fechaPublicacion = fechaPublicacion;
        this.estado = estado;
     }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getEditorial() {
        return editorial;
    }

    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }

    public LocalDate getFechaPublicacion() {
        return fechaPublicacion;
    }

    public void setFechaPublicacion(LocalDate fechaPublicacion) {
        this.fechaPublicacion = fechaPublicacion;
    }


    public int getUnidadesDisponibles() {
        return unidadesDisponibles;
    }

    public void setUnidadesDisponibles(int unidadesDisponibles) {
        this.unidadesDisponibles = unidadesDisponibles;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }
     
}
