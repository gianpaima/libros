package cap2;

import java.util.Scanner;

public class MayorMenor {
    public static void main(String[] args) {
        int a=0, b=0, c=0, d=0, e=0;

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

        int mini = a;
        int maxi = a;

        if (b < mini) {
            mini = b;
        } else if (b > maxi) {
            maxi = b;
        }

        if (c < mini) {
            mini = c;
        } else if (c > maxi) {
            maxi = c;
        }

        if (d < mini) {
            mini = d;
        } else if (d > maxi) {
            maxi = d;
        }

        if (e < mini) {
            mini = e;
        } else if (e > maxi) {
            maxi = e;
        }

        System.out.println("El número mayor es: " + maxi);
        System.out.println("El número menor es: " + mini);

    }
}
