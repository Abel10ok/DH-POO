package objetos_patrones_de_disenio;

public abstract class Producto{
    private Double peso;

    public Producto(Double peso) {
        this.peso = peso;
    }
    public abstract Double calcularEspacio();
}
