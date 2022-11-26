package objetos_excepcion_03;

public class Recorrido {
    private String destino;
    private String estacionPartida;

    public Recorrido(String destino, String estacionPartida) {
        this.destino = destino;
        this.estacionPartida = estacionPartida;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public String getEstacionPartida() {
        return estacionPartida;
    }

    public void setEstacionPartida(String estacionPartida) {
        this.estacionPartida = estacionPartida;
    }

    @Override
    public String toString() {
        return "Recorrido{" +
                "destino='" + destino + '\'' +
                ", estacionPartida='" + estacionPartida + '\'' +
                '}';
    }
}
