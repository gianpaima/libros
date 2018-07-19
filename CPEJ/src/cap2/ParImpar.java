package cap2;

import java.util.Scanner;

public class ParImpar {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int x;

        System.out.println("Par o Impart");

        System.out.println("Ingresa un numero");
        x = entrada.nextInt();

        if (x %2 == 0)
        {
            System.out.println("El número es par.");
        }
        else {
            System.out.println("El número es impar");
        }
    }
}
