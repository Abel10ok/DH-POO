import java.util.Scanner;

public class Clase03 {

    public static void main(String[] args) {


        //EJERCICIO 1.
        System.out.println("\nEJERCICIO 1");
        boolean juego = true;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Igrese nombre jugador 1");
        String jugador1 = scanner.nextLine();
        System.out.println("Igrese nombre jugador 2");
        String jugador2 = scanner.nextLine();

        Integer contJugador1 = 0;
        Integer contJugador2 = 0;


        while(juego){
            System.out.println("\n"+jugador1 +" Ingrese piedra, papel o tijera");
            String juegoJugador1 = scanner.nextLine();

            System.out.println("\n"+jugador2 +" Ingrese piedra, papel o tijera");
            String juegoJugador2 = scanner.nextLine();


            if(cualGana(juegoJugador1,juegoJugador2)==1){
                contJugador1++;
                System.out.println( "\npunto para jugador "+ jugador1 + " su contador es "+ contJugador1);
            }
            if(cualGana(juegoJugador1,juegoJugador2)>1){
                contJugador2++;
                System.out.println("\npunto para jugador "+ jugador2 + " su contador es "+ contJugador2);
            }
            if(juegoJugador1.equals("#") || juegoJugador2.equals("#") ){
                juego=false;
            }



        }
        if(contJugador1>contJugador2){
            System.out.println("\ngano el jugador "+ jugador1 + " puntuacion: " + contJugador1);
        }else if (contJugador1 == contJugador2){
            System.out.println("\nempate ");

        }else{
            System.out.println("\ngano jugador "+ jugador2 + " puntuacion: " + contJugador2);
        }

        // EJERCICIO 3
        System.out.println("\nEJERCICIO 3.\n");
        primeroNumeroPrimos(7);
        System.out.println("\n");

        // EJERCICIO 4
        System.out.println("\nEJERCICIO 4.");
        System.out.println("\nSu sueldo es: "+sueldoSemanal(45));

    }
    //EJERCICIO 1.
    //Hacé un programa que te permita jugar a “Piedra, papel o tijera”. En primer lugar, la
    //aplicación solicita el nombre de cada gamer, después empieza el juego. El juego consiste
    //en pedir qué opción elije cada uno y sumar puntos al winner —si lo hay—. Definí y utilizá
    //una función llamada cualGana con dos parámetros con las jugadas de cada uno, que
    //devuelve 0 en caso de empate, 1 si gana el primero, 2 si gana el segundo. El juego termina
    //cuando el primero elije “*” como indicador de final.


    public static int cualGana(String j1, String j2){

            if(j1.equals("papel") && j2.equals("piedra")){
                return 1;
            }else if(j1.equals("tijera") && j2.equals("papel")){
                return 1;
            }else if(j1.equals("piedra") && j2.equals("tijera")){
                return 1;
            }else if(j2.equals(j1)){
                return 0;
            }
        return 2;
    }
    //EJERCICIO 3.
    //Implementar un programa que nos permite mostrar por consola los primeros “n” números
    //primeros, siendo “n” un valor numérico ingresado por consola. Por ejemplo: Con n=7, lo
    //que debería devolver el programa es “Los primeros 7 números primos son: 2, 3, 5, 7, 11, 13,17”.

    public  static void primeroNumeroPrimos(int n){

        int cont = 0;
        int i = 1;
        while (cont<n){
            if(esPrimo(i)){
                System.out.print(i + ",");
                cont++;
            }
            i++;
        }
    }

    public static boolean esPrimo(int n){
        if (n == 0 || n == 1 || n == 4) {
            return false;
        }

        for (int i = 2; i < n/2 ; i++) {
            if(n%i ==0){
                return false;
            }
        }
        return true;
    }

    //Por cuestiones laborales, se pueden trabajar hasta 40 horas semanales, si se trabajan más
    // horas las mismas se consideran horas extras cuyo valor es un 50% más que las horas de
    //trabajo normales. Crear un programa que pueda informar si el sueldo semanal de la
    //programadora Julieta. Ella trabajó en la última semana “x” cantidad de horas y el valor de la
    //hora semanal es de 875.

    public static double sueldoSemanal(int horasTrabajadas){

        double sueldo = 0;

        double pagoNormal = 875;
        double pagoExtra = pagoNormal + pagoNormal/2;

        int horasExtras = 0;

        int horasNormales = horasTrabajadas;

        if(horasTrabajadas>40){
            horasExtras = horasTrabajadas - 40;
            horasNormales = 40;
        }

        sueldo += 875 * horasNormales;


        if(horasExtras!=0){
            sueldo += pagoExtra*horasExtras;
        }

        return  sueldo;
    }



}
