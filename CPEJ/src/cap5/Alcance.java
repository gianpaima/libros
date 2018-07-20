package cap5;

public class Alcance {
    // campo accesible para todos los métodos de esta clase
    private static int x = 1;

    public static void main(String[] args) {
        int x = 5;

        System.out.printf("la x local en main es %d%n", x);

        usarVariableLocal();
        usarCampo();
        usarVariableLocal();
        usarCampo();

        System.out.printf("%nla x local en main es %d%n", x);
    }

    public static void usarVariableLocal()
    {
        int x = 25;

        System.out.printf("%nla x local al entrar al metodo usarVariableLocal es %d%n", x);
        ++x;
        System.out.printf("la x local antes de salir del metodo usarVariableLocal es %d%n", x);
    }

    public static void usarCampo()
    {
        System.out.printf("%nel campo x al entrar al metodo usarCampo es %d%n", x);
        x *= 10;
        System.out.printf("el campo x antes de salir del metodo usarCampo es %d%n", x);
    }


}
