package co.edu.uniquindio.poo;
import java.util.Collection;
import java.util.LinkedList;
public class Estudiante extends Persona {
  int edad;
  private Collection<Prestamo> prestamos;
    public Estudiante(String nombre, String cedula, String correo, int edad) {
        super(nombre, cedula, cedula, correo);
        this.edad = edad;
        prestamos =  new LinkedList<>();
    }
    @Override
    public String toString() {
        return "Estudiante [" + super.toString()+ "edad=" + edad + "prestamos="+prestamos+ "]";
    }
    public int getEdad() {
        return edad;
    }
    public void setEdad(int edad) {
        this.edad = edad;
    }
    public Collection<Prestamo> getPrestamos() {
        return prestamos;
    }
    public void setPrestamos(Collection<Prestamo> prestamos) {
        this.prestamos = prestamos;
    }
    
}
    
    
// 