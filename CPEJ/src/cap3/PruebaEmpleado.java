package cap3;

import java.util.Scanner;

public class PruebaEmpleado {
    public static void main(String[] args) {
        // Variables receptoras de valores introducidos por el usuario del programa
        String nombre; // Nombre del empleado
        String apellido; // Apellido del empleado
        double salario; // Salario mensual del empleado

        // Instacimiento de dos objetos con valores iniciales
        Empleado empleado1 = new Empleado( "Zhen" , "Gholz" , 800 );
        Empleado empleado2 = new Empleado( "Larz" , "Binz" , 900 );

        // Solicitud y obtención de los del empleado1
        // Crear un objeto Scanner que admita la entrada de valores de la ventana de comandos
        Scanner entrada = new Scanner( System.in );

        System.out.print( "\nSolicitud y recepción de los datos del empleado1" );

        // Nombre
        System.out.print( "\nEscriba su nombre: " );
        nombre = entrada.nextLine();
        empleado1.setNombre(nombre);

        // Apellido
        System.out.print( "\nEscriba su apellido: " );
        apellido = entrada.nextLine();
        empleado1.setApellidoPat(apellido);

        // Salario
        System.out.print( "\nEscriba su salario mensual: " );
        salario = entrada.nextDouble();
        empleado1.setSalarioMensual(salario);

        // Muestra el resumen del empleado1
        System.out.print( "\nResumen para empleado1: " );
        empleado1.mostrarResumen();

        System.out.print( "\n\n\nSolicitud y recepción de los datos del empleado2" );

        // Nombre
//        System.out.print( "\n\nEscriba su nombre: " );
//        nombre = entrada.nextLine();
//        empleado2.setNombre(nombre);

        System.out.print( "\n\nEscriba su nombre: " );
        nombre = entrada.nextLine();
        empleado2.setNombre(nombre);

        // Apellido
        System.out.print( "\nEscriba su apellido: " );
        apellido = entrada.nextLine();
        empleado2.setApellidoPat(apellido);

        // Salario
        System.out.print( "\nEscriba su salario mensual: " );
        salario = entrada.nextDouble();
        empleado2.setSalarioMensual(salario);

        // Muestra el resumen del empleado2
        System.out.print( "\nResumen para empleado2: " );
        empleado2.mostrarResumen();

        System.out.println();
    }
}
