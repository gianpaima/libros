package cap5;

public class PruebaContinue {
    public static void main(String[] args) {
        for (int cuenta = 1; cuenta <=10; cuenta++)
        {
            if (cuenta == 5)
                continue;

            System.out.printf("%d   ", cuenta);
        }

        System.out.printf("%nSe uso continue para omitir imprimir 5%n");
    }
}
