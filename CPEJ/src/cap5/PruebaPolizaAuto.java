package cap5;

public class PruebaPolizaAuto {
    public static void main(String[] args) {
        PolizaAuto poliza1 = new PolizaAuto(11111111, "Toyota Camry", "NJ");
        PolizaAuto poliza2 = new PolizaAuto(22222222, "Ford Fusion", "ME");

        polizaEnEstadoSinCulpa(poliza1);
        polizaEnEstadoSinCulpa(poliza2);
    }

    public static void polizaEnEstadoSinCulpa(PolizaAuto poliza)
    {
        System.out.println("La poliza de auto: ");
        System.out.printf("Cuenta #: %d; Auto: %s; Estado %s %s un estado sin culpa%n%n",
                poliza.getNumeroCuenta(), poliza.getMarcaYModelo(), poliza.getEstado(),
                (poliza.esEstadoSinCulpa() ? "esta en": "no esta en"));
    }
}
