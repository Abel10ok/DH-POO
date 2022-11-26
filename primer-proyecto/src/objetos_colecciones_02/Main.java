package objetos_colecciones_02;

public class Main {
    public static void main(String[] args) {
        Persona abel = new Persona("abel", "alarcon", 25);

        Cuenta cuenta1 = new Cuenta(125,1000);
        Cuenta cuenta2 = new Cuenta(123,3000);
        Cuenta cuenta3 = new Cuenta(124,2000);

        abel.addCuenta(cuenta1);
        abel.addCuenta(cuenta2);
        abel.addCuenta(cuenta3);

        abel.mostrarCuentas();


    }
}
