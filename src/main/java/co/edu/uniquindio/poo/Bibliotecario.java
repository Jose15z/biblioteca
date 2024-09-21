package co.edu.uniquindio.poo;

public class Bibliotecario extends Persona {
    
    private int salario;

    public Bibliotecario(String nombre, String cedula, String correo, String telefono, int salario){
        super(nombre, cedula, telefono, correo);
        this.salario = salario;
    }
    
    public int getSalario() {
        return salario;
    }

    public void setSalario(int salario) {
        this.salario = salario;
    }

}
