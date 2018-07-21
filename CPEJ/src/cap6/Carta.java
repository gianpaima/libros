package cap6;

public class Carta {

    private final String cara;
    private final String palo;

    public Carta(String caraCarta, String paloCarta)
    {
        this.cara = caraCarta;
        this.palo = paloCarta;
    }

    // devuelve representación String de Carta

    public String toString()
    {
        return cara + " de " + palo;
    }
}
