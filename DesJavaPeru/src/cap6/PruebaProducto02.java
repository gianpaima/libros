package cap6;

import java.util.ArrayList;

public class PruebaProducto02 {
    public static void main(String[] args) {
        ArrayList lista = new ArrayList();

        Producto02 prod01 = new Producto02("Televisor", 650.0);
        Producto02 prod02 = new Producto02("Impresora", 187.0);
        Producto02 prod03 = new Producto02("Computadora", 2650.0);
        Producto02 prod04 = new Producto02("Lavadora", 450.0);
        Producto02 prod05 = new Producto02("Cocina", 660.0);
        Producto02 prod06 = new Producto02("Frigider", 670.0);

        lista.add(prod01);
        lista.add(prod02);
        lista.add(prod03);
        lista.add(prod04);
        lista.add(prod05);
        lista.add(prod06);

        //Mostrar tamaño de la lista
        System.out.println("Tamaño: " + lista.size());

        //Mostrar elementos de la lista
        Producto02 objProd;
        for (int k = 0; k < lista.size(); k++)
        {
            objProd = (Producto02) lista.get(k);
            System.out.println(objProd.toString());
        }
    }


}
