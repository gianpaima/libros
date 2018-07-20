package cap5;

import java.security.SecureRandom;

public class Craps {
    private static final SecureRandom numerosAleatorios = new SecureRandom();

    // Enumeración con constantes que representan el estado del juego
    private enum Estado {CONTINUA, GANO, PERDIO};

    // constantes que representan tiros comunes del dado.
    private static final int DOS_UNOS = 2;
    private static final int TRES = 3;
    private static final int SIETE = 7;
    private static final int ONCE = 11;
    private static final int DOCE = 12;

    public static void main(String[] args) {

        int miPunto = 0;
        Estado estadojuego; //puede contener CONTINUA, GANO o PERDIO.

        int sumaDeDados = tirarDados();

        switch (sumaDeDados)
        {
            case SIETE: // gana con 7 en el primer tiro.
            case ONCE:
                estadojuego = Estado.GANO;
                break;
            case DOS_UNOS:
            case TRES:
            case DOCE:
                estadojuego = Estado.PERDIO;
                break;
            default: // no gano ni perdió, por lo que guarda el punto
                estadojuego = Estado.CONTINUA;
                miPunto = sumaDeDados;
                System.out.printf("El punto es %d%n", miPunto);
                break;
        }

        while (estadojuego == Estado.CONTINUA)
        {
            sumaDeDados = tirarDados();

            if (sumaDeDados == miPunto)
                estadojuego = Estado.GANO;
            else
                if (sumaDeDados == SIETE)
                    estadojuego = Estado.PERDIO;
        }

        if (estadojuego == Estado.GANO)
            System.out.println("El jugador gana");
        else
            System.out.println("El jugador pierde");

    }

    public static int tirarDados()
    {
        int dado1 = 1 + numerosAleatorios.nextInt(6);
        int dado2 = 2 + numerosAleatorios.nextInt(6);

        int suma = dado1 + dado2;

        System.out.printf("El jugador tiro %d + %d = %d%n",
                dado1, dado2, suma);

        return suma;
    }

}
