package cap3;

import java.util.Scanner;

public class PruebaFactura {

    public static void main(String[] args) {

        //Variables
        String descripcion;
        int cantidad;
        double valor;

        //Constructor personalizado. Creación de un objeto
        // inicializando sus variables.
        Factura oFactura = new Factura("0", "Ninguna", 0,0.0);

        // Mostrar el estado actual de los atributos del objeto 'factura'
        System.out.printf( "\nNúmero de pieza: %s" , oFactura.getNpieza());
        System.out.printf( "\nDescripción de la pieza: %s" , oFactura.getDpieza());
        System.out.printf( "\nCantidad del artículo: %d" , oFactura.getCantidad());
        System.out.printf( "\nValor unitario del artículo: %f" , oFactura.getPrecio());

        Scanner entrada = new Scanner(System.in);
        System.out.print( "\nEscriba el número de pieza: " );
        descripcion = entrada.nextLine();
        oFactura.setNpieza(descripcion);

        //Descripción de la pieza
        System.out.print( "\nEscriba la descripción de la pieza: " );
        descripcion = entrada.nextLine();
        oFactura.setDpieza(descripcion);

        // Cantidad del artículo
        System.out.print( "\nEscriba la cantidad del artículo: " );
        cantidad = entrada.nextInt();
        oFactura.setCantidad(cantidad);

        // Cantidad del artículo
        System.out.print( "\nEscriba la cantidad del artículo: " );
        valor = entrada.nextDouble();
        oFactura.setPrecio(valor);

        //Mostrar el monto de la factura
        oFactura.obtenerMontoFactura();

        System.out.println();
        System.out.println();


    }
}
