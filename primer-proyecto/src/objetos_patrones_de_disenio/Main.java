package objetos_patrones_de_disenio;

public class Main {
    public static void main(String[] args) {
        ProductoFactory productoFactory = ProductoFactory.getInstance();
        ProductoFactory productoFactory2 = ProductoFactory.getInstance();
        Almacen almacen = new Almacen();

        /*almacen.agregarProducto(productoFactory.crearProducto("PELOTATENIS"));
        almacen.agregarProducto(productoFactory.crearProducto("CAJA10x10"));
        almacen.agregarProducto(productoFactory.crearProducto("PELOTAFUTBOL"));
        almacen.agregarProducto(productoFactory.crearProducto("PELOTAFUTBOL"));
        almacen.agregarProducto(productoFactory.crearProducto("CAJA10x10"));

        System.out.println(almacen.calculcarEspacioNecesario());*/
        System.out.println(productoFactory.hashCode());
        System.out.println(productoFactory2.hashCode());

    }
}
