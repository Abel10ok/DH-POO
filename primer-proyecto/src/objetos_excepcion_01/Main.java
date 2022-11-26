package objetos_excepcion_01;

import java.util.Date;

public class Main {

    public static void main(String[] args) throws FechaException {
        //Caso de fecha internacion no puede ser posterior a la actual
        Paciente paciente = new Paciente("Juan","Perez","12345", new Date(2030,3,21));

        //Caso fecha alta no puede ser anterior a la fecha de internacion (descomentar y comentar caso anterior para poder correrlo)
        Paciente paciente2 = new Paciente("Juan","Perez","12345", new Date(121,3,21));
        paciente.darAlta(new Date(120,5,3));
    }
}
