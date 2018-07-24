package cap7;

import java.security.SecureRandom;

public class TirarDado {

    public static void main(String[] args) {
        SecureRandom numeroAleatorios = new SecureRandom();
        int[] frecuencia = new int[7];

        for (int tiro = 1; tiro <= 6000000; tiro++)
            ++frecuencia[numeroAleatorios.nextInt(6)];

        System.out.printf("%s%10s%n", "Cara", "Frecuencia");

        // imprime el valor de cada elemento del arreglo
        for (int cara = 1; cara < frecuencia.length; cara++)
            System.out.printf("%4d%10d%n", cara, frecuencia[cara]);
    }
}
