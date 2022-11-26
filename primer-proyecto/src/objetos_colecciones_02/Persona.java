package objetos_colecciones_02;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Persona {
    private String nombre;
    private String apellido;
    private int edad;

    private List<Cuenta> cuentas;

    public Persona(String nombre, String apellido, int edad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        cuentas = new ArrayList<Cuenta>();
    }

    public  void addCuenta(Cuenta o){
        cuentas.add(o);
    }

    public boolean esMayorEdad(){
        return edad >60;
    }

    public void mostrarCuentas(){
        Collections.sort(cuentas);
        for (Cuenta cuenta: cuentas){
            System.out.println(cuenta);
        }
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getSaldoTotal(){
        int total = 0;
        for (Cuenta cuenta: cuentas){
            total += cuenta.getSaldo();
        }
        return total;
    }
}
