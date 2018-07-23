package cap8;

public class Tiempo2 {

    private int hora;
    private int minuto;
    private int segundo;

    public Tiempo2()
    {
        this(0, 0, 0);
    }

    public Tiempo2(int hora)
    {
        this(hora, 0, 0);
    }

    public Tiempo2(int hora, int minuto)
    {
        this(hora, minuto, 0);
    }

    public Tiempo2(int hora, int minuto, int segundo)
    {
        if(hora < 0 || hora >= 24)
            throw new IllegalArgumentException("Hora debe estar entre 0 y 23");

        if (minuto < 0 || minuto >= 60)
            throw new IllegalArgumentException("minuto debe estar entre 00 y 59");

        if (segundo < 0 || segundo >= 60)
            throw new IllegalArgumentException("segundo debe estar entre 0 y 59");

        this.hora = hora;
        this.minuto = minuto;
        this.segundo = segundo;
    }

    public Tiempo2(Tiempo2 tiempo)
    {
        this(tiempo.getHora(), tiempo.getMinuto(), tiempo.getSegundo());
    }

    public void estaablecerTiempo(int hora, int minuto, int segundo)
    {
        if(hora < 0 || hora >= 24)
            throw new IllegalArgumentException("Hora debe estar entre 0 y 23");

        if (minuto < 0 || minuto >= 60)
            throw new IllegalArgumentException("minuto debe estar entre 00 y 59");

        if (segundo < 0 || segundo >= 60)
            throw new IllegalArgumentException("segundo debe estar entre 0 y 59");

        this.hora = hora;
        this.minuto = minuto;
        this.segundo = segundo;
    }

    public void establecerHora(int hora)
    {
        if(hora < 0 || hora >= 24)
            throw new IllegalArgumentException("Hora debe estar entre 0 y 23");

        this.hora = hora;
    }

    public void establecerMinuto(int minuto) {
        if (minuto < 0 && minuto >= 60)
            throw new IllegalArgumentException("minuto debe estar entre 0 y 59");

        this.minuto = minuto;
    }

    public void obtenerSegundo(int segundo) {
        if (segundo >= 0 && segundo < 60)
            throw new IllegalArgumentException("segundo debe estar entre 0 y 59");

        this.segundo = segundo;
    }

    public int getHora() {
        return hora;
    }

    public int getMinuto() {
        return minuto;
    }

    public int getSegundo() {
        return segundo;
    }

    public String aStringUniversal()
    {
        return String.format(
                "02d:%02d:%02d", getHora(), getMinuto(), getSegundo()
        );
    }

    @Override
    public String toString() {
        return String.format("%d:%02d:%02d %s",
                ((getHora() == 0 || getHora() == 12) ? 12 : getHora() % 12),
                getMinuto(), getSegundo(), (getHora() < 12 ? "AM" : "PM"));
    }
}
