import java.util.Scanner;

public class Main {

    public  static void saludar(String a){
            System.out.println("hola "+ a);
    }


    public static int sumar(int n, int m){
        return n+m;
    }

    public static boolean numerosDivisilbes(int n1, int n2){
        return n1%n2==0;
    }

    //Definir dos cadenas de texto. Comprobar si son iguales o distintas e indicar mediante un
    //mensaje.
    public static boolean compararStrings (String a, String b ){
        return a.equals(b);
    }

    //Definir dos Integer y determinar cuál es mayor, cuál es menor o si son iguales.
    //Informar el resultado obtenido.

    public static void compararNuemeros(int  n, int m){
        if(n>m){
            System.out.println(n + "Es mayor");
        }else if (n<m){
            System.out.println(m + "Es mayor");
        }
        System.out.println("iguales");
    }

    public static  void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n1 ; float n2; char letra;
        String nombre ;
        System.out.println("Ingrese primer valor");
        //n1 = scanner.nextInt();
        System.out.println("Ingrese segundo valor");
        //n2 = scanner.nextFloat();
        System.out.println("Ingrese nombre");
        //nombre = scanner.next();
        //letra = nombre.charAt(0);

        int [] numeros = new int [5];
        numeros [0] = 1;
        numeros [0] = 2;
        numeros [0] = 3;
        numeros [0] = 4;
        numeros [0] = 5;

        int nuemeros2 [] ={1,2,3,4,5};

        System.out.println(numeros[3]);





    }
}