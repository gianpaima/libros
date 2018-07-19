package cap2;

import java.util.Scanner;

public class Producto {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int x;
        int y;
        int z;
        int resultado;

        System.out.println("Escriba el primer entero: ");
        x = entrada.nextInt();

        System.out.println("Escriba el segundo entero: ");
        y = entrada.nextInt();

        System.out.println("Escriba el tercer entero: ");
        z = entrada.nextInt();

        resultado = x * y * z;

        System.out.printf("El producto es %d%n", resultado);
    }
}
