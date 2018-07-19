package cap3;

import java.util.Scanner;

public class PruebaFecha {


    public static void main(String[] args) {
        // Variables receptoras de los valores introducidos por el usuario del programa
        int dia; // Día en formato numérico
        int mes; // Mes en formato numérico
        int annio;

        // Instanciamiento de un objeto de clase Fecha con valores iniciales
        Fecha fecha = new Fecha( 21 , 5 , 2009 );

        // Ver fecha
        fecha.mostrarFecha();

        // Solicitud y obtención de datos por parte del usuario
        // Crea un objeto Scanner para obtener datos desde la entrada estándar
        Scanner entrada = new Scanner( System.in );

        // Mes
        System.out.print( "\nEscriba el número del dia: " );
        dia = entrada.nextInt();
        fecha.setDia(dia);

        // Día
        System.out.print( "\nEscriba el número del mes: " );
        mes = entrada.nextInt();
        fecha.setMes(mes);

        // Año
        System.out.print( "\nEscriba el año: " );
        annio = entrada.nextInt();
        fecha.setAnio(annio);

        // Mostrar fecha
        fecha.mostrarFecha();

        System.out.println();
        System.out.println();
    }
}
