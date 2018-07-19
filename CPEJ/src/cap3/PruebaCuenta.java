package cap3;

import java.util.Scanner;

public class PruebaCuenta {
    public static void main(String[] args) {
/*      Scanner entrada = new Scanner(System.in);

        Cuenta miCuenta = new Cuenta();

        System.out.printf("El nombre inicial es: %s%n%n", miCuenta.obtenerNombre());

        System.out.println("Introduzc el nombre: ");
        String elNombre = entrada.nextLine();
        miCuenta.establecerNombre(elNombre);
        System.out.println();
        System.out.printf("El nombre en el objeto miCuenta es: %n%s%n",
                miCuenta.obtenerNombre());*/
        /*Cuenta cuenta1 = new Cuenta("Jane Green");
        Cuenta cuenta2 = new Cuenta("John Blue");

        System.out.printf("El nombre de la cuenta1 es: %s%n", cuenta1.obtenerNombre());
        System.out.printf("El nombre de la cuenta2 es: %s%n", cuenta2.obtenerNombre());
*/
        Cuenta  c1 = new Cuenta("Jane Green", 50.00);
        Cuenta  c2 = new Cuenta("Gian Paima",-7.53);

        System.out.printf("Saldo de %s: $%.2f%n", c1.obtenerNombre(), c1.getSaldo());
        System.out.printf("Saldo de %s: $%.2f%n", c2.obtenerNombre(), c2.getSaldo());

        Scanner entrada = new Scanner(System.in);

        System.out.print("Escriba el monto a depositar para cuenta1: ");
        double montoDeposito = entrada.nextDouble();
        System.out.printf("%nsumando %.2f al saldo de cuenta1%n%n", montoDeposito);
        c1.depositar(montoDeposito);

        System.out.printf("Saldo de %s: $%.2f%n", c1.obtenerNombre(), c1.getSaldo());
        System.out.printf("Saldo de %s: $%.2f%n", c2.obtenerNombre(), c2.getSaldo());
// SEPARACION
        System.out.print("Escriba el monto a depositar para cuenta2: ");
        montoDeposito = entrada.nextDouble();
        System.out.printf("%nsumando %.2f al saldo de cuenta2%n%n", montoDeposito);
        c2.depositar(montoDeposito);

        System.out.printf("Saldo de %s: $%.2f%n", c1.obtenerNombre(), c1.getSaldo());
        System.out.printf("Saldo de %s: $%.2f%n", c2.obtenerNombre(), c2.getSaldo());

// SEPARACIÓN
        System.out.printf("Escriba el monto a retirar para la cuenta1: ");
        double montoRetirado = entrada.nextDouble();
        c1.retirar(montoRetirado);
        System.out.printf("El saldo de %s: $%.2f%n", c1.obtenerNombre(), c1.getSaldo());

    }
}
