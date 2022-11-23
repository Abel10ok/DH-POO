package objetos_valuacion;

public class Main {
    public static void main(String[] args) {

        Alumno abel = new Alumno("abel","alarcon",123);

        Final finialPoo = new Final(abel,"poo","objetos",9.00,10.00,"nnn");
        Final finalPoo2 = new Final(abel,"poo","objetos",9.00,10.00,"mmm");


        System.out.println(finialPoo.compareTo(finalPoo2));



    }

}