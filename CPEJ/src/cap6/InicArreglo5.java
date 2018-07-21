package cap6;

public class InicArreglo5 {

    public static void main(String[] args) {
        if (args.length != 3)
            System.out.printf(
                    "Error: Vuelva a escribir el comando completo, incluyendo%n" +
                    "el tamanio del arreglo, el valor inicial y el incremento .%n");
        else
        {
            int longitudArreglo = Integer.parseInt(args[0]);
            int[] arreglo = new int[longitudArreglo];

            int valorInicial = Integer.parseInt(args[1]);
            int incremento = Integer.parseInt(args[2]);

            for (int contador = 0; contador < arreglo.length; contador++)
                arreglo[contador] = valorInicial + incremento * contador;

            System.out.printf("%s%8s%n", "Indice", "Valor");

            for (int contador = 0; contador < arreglo.length; contador++)
                System.out.printf("%5d%8d%n", contador, arreglo[contador]);
        }

    }
}
