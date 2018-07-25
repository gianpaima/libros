package cap5;

public class PruebaEcuacion {
    public static void main(String[] args) {
        Ecuacion obj = new Ecuacion(1.0, -4.0, 3.0);

        double rpta[] = obj.resolver();

        System.out.println("X1 = " + rpta[0]);
        System.out.println("X2 = " + rpta[1]);

    }
}
