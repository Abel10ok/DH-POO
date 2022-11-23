package clase10;

public class SocioPileta extends Socio{
    private Double costoPileta;
    private Boolean estaHabilitado;

    public SocioPileta(String nombre, Integer numeroSocio, Double cuotaMensual, String actividad, Double costoPileta, Boolean estaHabilitado) {
        super(nombre, numeroSocio, cuotaMensual, actividad);
        this.costoPileta = costoPileta;
        this.estaHabilitado = estaHabilitado;
    }

    public Double calcularCostoMensual(){
        if(estaHabilitado){
            return super.calcularCostoMensual() + costoPileta;
        }else {
            return super.calcularCostoMensual();
        }
    }

}