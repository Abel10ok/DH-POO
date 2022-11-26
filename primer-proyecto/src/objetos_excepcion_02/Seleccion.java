package objetos_excepcion_02;

import java.util.ArrayList;
import java.util.List;

public class Seleccion {
    private String nombre;
    private List<Jugador> plantel;

    public Seleccion(String nombre) {
        this.nombre = nombre;
        plantel = new ArrayList<Jugador>();
    }

    public void convocar(Jugador unJugador){
        plantel.add(unJugador);
    }

    public List<Jugador> obtenerReservas(){
        List<Jugador> reservas = new ArrayList<Jugador>();
        for (Integer indiceJugador = 18; indiceJugador < 23; indiceJugador++){
            reservas.add(plantel.get(indiceJugador));
        }
        return reservas;
    }
    public Integer cantJugadores(String posicion) throws SeleccionException {
        if (!(posicion.equals(Jugador.arquero)||posicion.equals(Jugador.defensor)||posicion.equals(Jugador.mediocampista)||posicion.equals(Jugador.delantero))){
            throw new SeleccionException("No hay jugadores en la posición: "+posicion);
        }

        Integer cantJugadoresEnPosicion = 0;
        for (Jugador unJugador:plantel) {
            if(unJugador.getPosicion().equals(posicion)){
                cantJugadoresEnPosicion++;
            }
        }
        return cantJugadoresEnPosicion;
    }

}
