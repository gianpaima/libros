package cap5;

public class Suma {
    public static void main(String[] args) {
        int total = 0;

        for (int numero = 2; numero <= 20; numero += 2)
            total += numero;

        System.out.printf("La suma es %d%n", total);
    }
}
