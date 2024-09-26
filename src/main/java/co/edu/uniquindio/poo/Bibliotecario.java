package co.edu.uniquindio.poo;

public class Bibliotecario extends Persona {
    
    private double salario;
    private int antiguedad;

    public Bibliotecario(String nombre, String cedula, String correo, String telefono, double salario, int antiguedad){
        super(nombre, cedula, telefono, correo);
        this.salario = salario;
        this.antiguedad = antiguedad;
    }
    
    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    @Override
    public String toString() {
        return "Bibliotecario ["+ super.toString() + ", salario = " + salario + ", antiguedad = "+ antiguedad + "]";

    }

    public int getAntiguedad() {
        return antiguedad;
    }

    public void setAntiguedad(int antiguedad) {
        this.antiguedad = antiguedad;
    }
    
}
