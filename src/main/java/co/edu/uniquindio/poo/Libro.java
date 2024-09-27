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
    private double valor;

    public Libro(String titulo, String codigo, String isbn, String autor, String editorial, LocalDate fechaPublicacion, boolean estado, int unidadesDisponibles, double valor){
        this.titulo = titulo;
        this.codigo = codigo;
        this.isbn = isbn;
        this.autor = autor;
        this.editorial = editorial;
        this.fechaPublicacion = fechaPublicacion;
        this.estado = estado;
        this.valor = valor;
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

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }
    @Override
    public String toString() {
        return "Libro [Titulo = " + titulo + ", codigo = " + codigo + ", isbn = " + isbn + ", autor = " + autor + 
        ", editorial = " + editorial + ", fecha de publicación = " + fechaPublicacion + ", estado = " + estado + 
        ", unidades disponibles  = " + unidadesDisponibles + ", valor = " + valor + "]";
    }    
}
