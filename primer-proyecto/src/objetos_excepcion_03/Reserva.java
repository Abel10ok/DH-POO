package objetos_excepcion_03;

public class Reserva {

    private int codigo;
    private Recorrido recorrido;
    private int cantPersonasViajan;

    private double precioBoleto;

    private double precioReserva;

    public Reserva(int codigo, Recorrido recorrido, int cantPersonasViajan) {
        this.codigo = codigo;
        this.recorrido = recorrido;
        this.cantPersonasViajan = cantPersonasViajan;
        this.precioBoleto = 0.50;
        this.precioReserva = 0;
        if(!viajeCabezera()) {
            this.precioReserva = this.precioBoleto * this.cantPersonasViajan;
        }else{
            double descuento = (precioBoleto * cantPersonasViajan) * 0.20;
            this.precioReserva = (this.precioBoleto* this.getCantPersonasViajan())-descuento;
        }
    }

    public boolean viajeCabezera() {
        boolean cabezera = false;
        if (this.recorrido.getEstacionPartida().equals("Buenos Aires") && this.recorrido.getDestino().equals("Bragado")) {
            cabezera = true;
        } else if (this.recorrido.getEstacionPartida().equals("Bragado") && this.recorrido.getDestino().equals("Buenos Aires")) {
            cabezera = true;
        }
        return cabezera;
    }


    public boolean estacionPertenece(String estacion){
        if(this.recorrido.getDestino().equals(estacion) || this.recorrido.getEstacionPartida().equals(estacion )){
            return true;
        }
        return false;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public Recorrido getRecorrido() {
        return recorrido;
    }

    public void setRecorrido(Recorrido recorrido) {
        this.recorrido = recorrido;
    }

    public int getCantPersonasViajan() {
        return cantPersonasViajan;
    }

    public void setCantPersonasViajan(int cantPersonasViajan) {
        this.cantPersonasViajan = cantPersonasViajan;
    }

    public double getPrecioBoleto() {
        return precioBoleto;
    }

    public void setPrecioBoleto(double precioBoleto) {
        this.precioBoleto = precioBoleto;
    }

    public double getPrecioReserva() {
        return precioReserva;
    }

    public void setPrecioReserva(double precioReserva) {
        this.precioReserva = precioReserva;
    }

    @Override
    public String toString() {
        return "Reserva{" +
                "codigo=" + codigo +
                ", recorrido=" + recorrido +
                ", cantPersonasViajan=" + cantPersonasViajan +
                ", precioBoleto=" + precioBoleto +
                ", precioReserva=" + precioReserva +
                '}';
    }
}