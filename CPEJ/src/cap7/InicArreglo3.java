package cap7;

public class InicArreglo3 {

    public static void main(String[] args) {
        final int LONGUITUD_ARREGLO = 10;
        int[] arreglo = new int[LONGUITUD_ARREGLO];

        for (int contador = 0; contador < arreglo.length; contador++)
            arreglo[contador] = 2 + 2 * contador;

        System.out.printf("%s%8s%n", "Indice", "Valor");

        for (int contador = 0; contador < arreglo.length; contador++)
            System.out.printf("%5d%8d%n", contador, arreglo[contador]);
    }
}
