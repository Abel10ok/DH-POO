public class Clase02 {

    public static int max(int n, int n2, int n3){
        if(n>n2 && n>n3){
            return n;
        }else if(n2<n3){
            return n3;
        }
        return n2;
    }

    public static boolean cadenasDeTextoDistintas(String unTextoA, String unTextoB){
        return !unTextoA.equals(unTextoB);
    }

    public static void main(String[] args) {
        System.out.println(max(4,16,3));
        System.out.println(cadenasDeTextoDistintas("abeel","abel"));
    }



}

