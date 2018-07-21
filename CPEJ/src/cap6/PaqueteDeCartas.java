package cap6;

import java.security.SecureRandom;

public class PaqueteDeCartas {

    private Carta[] paquete;
    private int cartaActual;
    private static final int NUMEROS_DE_CARTAS = 52;

    private static final SecureRandom numerosAletorios = new SecureRandom();

    // el constructor llena el paquete de Cartas
    public PaqueteDeCartas()
    {
        String[] caras = {"As", "Dos", "Tres", "Cuatro", "Cinco", "Seis", "Siete",
        "Ocho", "Nueve", "Diez", "Joker", "Reina", "Rey"};
        String[] palos = {"Corazones", "Diamantes", "Treboles", "Espadas"};

        paquete = new Carta[NUMEROS_DE_CARTAS];
        cartaActual = 0;

        for (int cuenta = 0; cuenta < paquete.length; cuenta++)
            paquete[cuenta] = new Carta(caras[cuenta % 13], palos[cuenta / 13]);
    }

    public void barajar()
    {
        cartaActual = 0;

        for (int primera = 0; primera < paquete.length; primera++)
        {
            int segunda = numerosAletorios.nextInt(NUMEROS_DE_CARTAS);

            Carta temp = paquete[primera];
            paquete[primera] = paquete[segunda];
            paquete[segunda] = temp;
        }

    }

    public Carta repartirCarta()
    {
        if(cartaActual < paquete.length)
            return paquete[cartaActual++];
        else
            return null;
    }
}
