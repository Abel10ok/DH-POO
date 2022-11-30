package objetos_patrones_de_disenio;

public class ProductoFactory {
    private static ProductoFactory instance;

    /*
    -VARIABLE CON MODIFICADOR "Static"
    .PERTENECE A LA CLASE.
    .SOLO SE INICIALIZA UNA SOLA VEZ.
    .HAY UNA SOLA COPIA DE LA VARIABLE, COMPARTIDA POR TODAS LAS INSTANCIAS, QUE SE CREAN DE LA CLASE.
    .PARA ACCEDER AL CONTENIDO DE LA VARIABLE NO ES NECESARIO GENERAR UNA INSTANCIA.


    -METODO CON MODIFICADOR "static"
    .EL METODO PASA A FORMAR PARTE DE LA CLASE.
    .SOLO PUEDEN LLAMAR DIRECTAMENTE A OTROS METODOS ESTATICOS.
    .SE PUEDEN ACCEDER AL METODO SIN NECESIDAD DE GENERAR UNA INSTANCIA.
    */
    private ProductoFactory(){
    }
    public static ProductoFactory getInstance() {
        if (instance==null){
            instance = new ProductoFactory();
        }
        return instance;
    }
    public Producto crearProducto(String codigo){
        switch (codigo){
            case "CAJA10x10":
                return new Caja(20.0,10.0,10.0,10.0);
            case "PELOTATENIS":
                return new Pelota(1.0,0.32);
            case "PELOTAFUTBOL":
                return new Pelota(2.0,11.0);
        }
        return null;
    }

}
