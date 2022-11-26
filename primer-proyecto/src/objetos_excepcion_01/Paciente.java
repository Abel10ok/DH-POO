package objetos_excepcion_01;

import java.util.Date;

public class Paciente {
    String nombre;
    String apellido;
    String historiaClinica;
    Date fechaInternacion;
    Date fechaAlta;


    Paciente(String nombre, String apellido, String historiaClinica, Date fechaInternacion) throws FechaException {
        Date hoy= new Date();
        this.nombre=nombre;
        this.apellido=apellido;
        fechaAlta=null;
        if (fechaInternacion.after(hoy)) {
            throw new FechaException("La fecha de internacion no puede ser posterior a la actual.");
        }
        this.fechaInternacion=fechaInternacion;
    }

    public Date getFechaInternacion() {
        return fechaInternacion;
    }

    public Date getFechaAlta() {
        return fechaAlta;
    }

    public void darAlta(Date fechaAlta) throws FechaException {
        if (fechaAlta.before(fechaInternacion))
            throw new FechaException("La fecha de alta no puede ser anterior a la fecha de internacion.");
        else
            System.out.println("Se dio de alta correctamente.");
    }



}
