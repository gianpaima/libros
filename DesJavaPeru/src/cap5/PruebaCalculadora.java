package cap5;

public class PruebaCalculadora {

    public static void main(String[] args) {
        int n1 = 5;
        int n2 = 8;

        Calculadora1 obj = new Calculadora1();
        int suma = obj.suma(n1, n2);
        int f1 = obj.factorial(n1);
        int f2 = obj.factorial(n2);

        // Reporte

        System.out.println("La sumaes : " + suma);
        System.out.println("Factorial de" + n1 + "es: " + f1);
        System.out.println("Factorial de" + n2 + "es: " + f2);
    }
}
