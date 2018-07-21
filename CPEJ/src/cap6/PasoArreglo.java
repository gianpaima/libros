package cap6;

public class PasoArreglo {

    public static void main(String[] args) {
        int[] arreglo = {1, 2, 3, 4, 5};

        System.out.printf("Edectos de pasar una referencia a un arrelo completo:%n" +
        "Los valores del arreglo original son: %n");

        for (int valor : arreglo)
            System.out.printf(" %d", valor);

        modificarArreglo(arreglo);
        System.out.printf("%n%nLos valores del arreglo modificado son:%n");

        for (int valor : arreglo)
            System.out.printf(" %d", valor);

        System.out.printf("%n%nEfectos de pasar el valor de un elemento del arreglo:%n" +
        "arreglo[3] anted de modificarElemento: %d%n", arreglo[3]);

        modificarElemento(arreglo[3]);
        System.out.printf("arreglo[3] después de modificarElemento: %d%n", arreglo[3]);
        }

        public static void modificarArreglo(int[] arreglo2)
        {
            for (int contador = 0; contador < arreglo2.length; contador++)
                arreglo2[contador] *= 2;
        }

        public static void modificarElemento(int elemento)
        {
            elemento *= 2;
            System.out.printf("Valor del elemento en modficarElemento: %d%n", elemento);
        }


}
