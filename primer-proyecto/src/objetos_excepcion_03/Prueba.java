package objetos_excepcion_03;

import java.util.ArrayList;
import java.util.List;

public class Prueba {

    public static void main(String[] args) {

        Empresa empresa1 = new Empresa("River");

        String buenrosAires = Estaciones.buenosAires;
        String lujan = Estaciones.lujan;
        String mercedes = Estaciones.mercedes;
        String suipacha = Estaciones.suipacha;
        String chivilcoy = Estaciones.chivilcoy;
        String alberti = Estaciones.alberti;
        String bragado = Estaciones.bragado;

        Recorrido recorrido1 = new Recorrido(buenrosAires,bragado);
        Recorrido recorrido2 = new Recorrido(lujan,bragado);
        Recorrido recorrido3 = new Recorrido(mercedes,buenrosAires);
        Recorrido recorrido4 = new Recorrido(suipacha,chivilcoy);
        Recorrido recorrido5 = new Recorrido(alberti,lujan);

        Reserva reserva1 = new Reserva(123,recorrido1,10);
        Reserva reserva2 = new Reserva(456,recorrido2,15);
        Reserva reserva3 = new Reserva(789,recorrido3,20);
        Reserva reserva4 = new Reserva(101,recorrido4,25);
        Reserva reserva5 = new Reserva(102,recorrido5,30);

        empresa1.addReserva(reserva1);
        empresa1.addReserva(reserva2);
        empresa1.addReserva(reserva3);
        empresa1.addReserva(reserva4);
        empresa1.addReserva(reserva5);

        System.out.println(empresa1.toString());

        System.out.println(empresa1.cantVecesRecorrida(alberti));



    }
}