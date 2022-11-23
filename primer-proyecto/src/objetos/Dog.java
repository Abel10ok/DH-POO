package objetos;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Dog {
    private boolean adopcion;
    private String raza;
    private Integer anio;
    private Integer peso;
    private boolean chip;
    private boolean lastimado;
    private String nombrePila;

    public Dog(String raza, Integer anio, Integer peso, boolean chip, boolean lastimado, String nombrePila){
        this.adopcion = false;
        this.raza = raza;
        this.anio = anio;
        this.peso = peso;
        this.chip = chip;
        this.lastimado = lastimado;
        this.nombrePila = nombrePila;
    }



    public void preguntarEdad(){
        Calendar fecha = new GregorianCalendar();
        Integer edadActual =  fecha.get(Calendar.YEAR) - anio;
        System.out.println("Edad: " + edadActual );
    }

    public void factibleAPerderdse(){
        if(this.chip){
            System.out.println("No es factible a perderse");
            return;
        }
        System.out.println("Es factible a perderse");
    }

    public void enviarAAdopcion(){
        if(!this.lastimado && this.peso>5){
            System.out.println("Se puede enviar a adopcion a: "+ this.nombrePila);
            this.adopcion = true;
            return;
        }
        System.out.println(this.nombrePila + " No se puede dar en adopcion" );
    }

}
