package cap2;

import java.util.Scanner;

public class NegativosPositivosCeros {
    public static void main(String[] args) {
        int a, b, c, d, e;
        int positivos = 0;
        int negativos = 0;
        int ceros = 0;

        Scanner entrada = new Scanner(System.in);

        System.out.print("Ingresa número 1: ");
        a = entrada.nextInt();
        System.out.print("Ingresa número 2: ");
        b = entrada.nextInt();
        System.out.print("Ingresa número 3: ");
        c = entrada.nextInt();
        System.out.print("Ingresa número 4: ");
        d = entrada.nextInt();
        System.out.print("Ingresa número 5: ");
        e = entrada.nextInt();

        if (a < 0)
            negativos = negativos + 1;
        if (a > 0)
            positivos = positivos + 1;
        if (a == 0)
            ceros = ceros + 1;

        if (b < 0)
            negativos = negativos + 1;
        if (b > 0)
            positivos = positivos + 1;
        if (b == 0)
            ceros = ceros + 1;

        if (c < 0)
            negativos = negativos + 1;
        if (c > 0)
            positivos = positivos + 1;
        if (c == 0)
            ceros = ceros + 1;

        if (d < 0)
            negativos = negativos + 1;
        if (d > 0)
            positivos = positivos + 1;
        if (d == 0)
            ceros = ceros + 1;

        if (e < 0)
            negativos = negativos + 1;
        if (e > 0)
            positivos = positivos + 1;
        if (e == 0)
            ceros = ceros + 1;

        System.out.printf("Cantidad de Positivos %d%n ", positivos);
        System.out.printf("Cantidad de Negativos %d%n ", negativos);
        System.out.printf("Cantidad de Ceros %d%n ", ceros);
    }
}
