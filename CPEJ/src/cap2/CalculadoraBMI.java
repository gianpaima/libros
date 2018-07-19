package cap2;

import java.util.Scanner;

public class CalculadoraBMI {
    public static void main(String[] args) {
        double BMI = 0, peso, altura;

        Scanner entrada = new Scanner(System.in);

        System.out.println("CALCULADORA DE INDICE DE MASA CORPORAL");
        System.out.print("Ingrese peso: ");
        peso = entrada.nextDouble();
        System.out.print("Ingrese altura: ");
        altura = entrada.nextDouble();

        BMI = peso / (altura*altura);
        System.out.println("Su BMI es: " +BMI);

        if (BMI < 18.5) {
            System.out.println("Usted esta bajo de peso, coma please!");
        } else if (BMI <= 18.5 || BMI <=24.9) {
            System.out.print("Usted esta normal de peso, felicidades!");
        } else if (BMI <= 25.0 || BMI <= 29.9) {
            System.out.print("Usted esta en sobrepeso, corra!");
        } else if (BMI > 30.0)
            System.out.print("Usted esta obesa, cambie su vida!");
    }
}
