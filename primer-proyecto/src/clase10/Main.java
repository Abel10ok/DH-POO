package clase10;

public class Main {

    public static void main(String[] args) {
        SocioPileta socioPileta = new SocioPileta("Abel",33,2500.0,"Cardio",2000.0,true);

        System.out.println(socioPileta.calcularCostoMensual());
    }
}
