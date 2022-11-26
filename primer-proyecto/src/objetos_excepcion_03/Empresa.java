package objetos_excepcion_03;

import java.util.ArrayList;
import java.util.List;

public class Empresa {
    private String nombre;
    private List<Reserva> reservas;

    public Empresa(String nombre) {
        this.nombre = nombre;
        this.reservas = new ArrayList<Reserva>();
    }

    public void addReserva(Reserva reserva){
        reservas.add(reserva);
    }

    public Double recaudacionTotal(){
        double recaudacion = 0;
        for (Reserva reserva: reservas) {
            recaudacion += reserva.getPrecioReserva();
        }
        return recaudacion;
    }

    public int cantVecesRecorrida(String estacion){
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
