package cap3;

public class Fecha {
    private int dia;
    private int mes;
    private int anio;

    public Fecha (int dia, int mes, int anio)
    {
        //validacion para el mes
        if (mes > 0)
            if (mes <= 12)
                this.mes = mes;

        // Validación para el día
        if (dia > 0)
            if (dia <= 31)
                this.dia = dia;

        // Validacion para el annio
        if (anio >= 1929)
            if (anio <= 2029)
                this.anio = anio;
    }

    public int getDia() {
        return dia;
    }

    public int getMes() {
        return mes;
    }

    public int getAnio() {
        return anio;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }
    // Método para mostrar la fecha en formato mm / dd / aaaa

    public void mostrarFecha()
    {
        System.out.print( "\nFecha seleccionada: " );
        System.out.printf( "\n %d / %d / %d " , dia, mes, anio);
    } // fin del método mostrarFecha
}
