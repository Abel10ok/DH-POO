package objetos_excepcion_03;

import java.util.ArrayList;
import java.util.List;

public class Empresa {
    private String nombre;
    private List<Reserva> reservas;

    private List<String> estaciones;

    public Empresa(String nombre) {
        this.nombre = nombre;
        this.reservas = new ArrayList<Reserva>();
        this.estaciones = new ArrayList<String>();
    }

    public void addReserva(Reserva reserva){
        reservas.add(reserva);
    }

    public List<String> getEstaciones() {
        return estaciones;
    }

    public void setEstaciones(List<String> estaciones) {
        this.estaciones = estaciones;
    }

    public void addEstaciones(String estacion){
        estaciones.add(estacion);
    }

    public Double recaudacionTotal(){
        double recaudacion = 0;
        for (Reserva reserva: reservas) {
            recaudacion += reserva.getPrecioReserva();
        }
        return recaudacion;
    }

    public boolean estacionExiste(String estacion){
        for (String i: estaciones) {
            if(i.equals(estacion)){
                return true;
            }
        }
        return false;
    }

    public int cantVecesRecorrida(String estacion) throws EmpresaExcepcion{
        if(!estacionExiste(estacion)){
            throw  new EmpresaExcepcion("La estacion "+ estacion + " no existe");
        }

        int vecesRecorrido = 0;
        for (Reserva reserva: reservas) {
            if(reserva.estacionPertenece(estacion)){
                vecesRecorrido++;
            }
        }
        return vecesRecorrido;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<Reserva> getReservas() {
        return reservas;
    }

    public void setReservas(List<Reserva> reservas) {
        this.reservas = reservas;
    }

    @Override
    public String toString() {
        return "Empresa{" +
                "nombre='" + nombre + '\'' +
                ", reservas=" + reservas +
                '}';
    }
}
