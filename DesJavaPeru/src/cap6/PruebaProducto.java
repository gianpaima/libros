package cap6;

import java.util.ArrayList;

public class PruebaProducto {

    public static void main(String[] args) {
        ArrayList lista = new ArrayList();

        Producto prod01 = new Producto("Televisor", 650.0);
        Producto prod02 = new Producto("Impresora", 187.0);
        Producto prod03 = new Producto("Computadora", 2650.0);
        Producto prod04 = new Producto("Lavadora", 450.0);
        Producto prod05 = new Producto("Cocina", 660.0);
        Producto prod06 = new Producto("Frigider", 670.0);

        lista.add(prod01);
        lista.add(prod02);
        lista.add(prod03);
        lista.add(prod04);
        lista.add(prod05);
        lista.add(prod06);

        //Mostrar tamaño de la lista
        System.out.println("Tamaño: " + lista.size());

        //Mostrar elementos de la lista
        Producto objProd;
        for (int k = 0; k < lista.size(); k++)
        {
            objProd = (Producto) lista.get(k);
            System.out.println(objProd.toString());
        }
    }


}
