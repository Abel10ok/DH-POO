package clase10;

public class Socio {
    private String nombre;
    private Integer numeroSocio;
    private Double cuotaMensual;
    private String actividad;

    public Socio(String nombre,Integer numeroSocio, Double cuotaMensual, String actividad){
        this.nombre=nombre;
        this.numeroSocio=numeroSocio;
        this.cuotaMensual=cuotaMensual;
        this.actividad=actividad;
    }
    public Double calcularCostoMensual(){
        return cuotaMensual;
    }

    public Double getCuotaMensual() {
        return cuotaMensual;
    }
}