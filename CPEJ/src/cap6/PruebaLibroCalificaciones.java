package cap6;

public class PruebaLibroCalificaciones {

    public static void main(String[] args) {
        int[] arregloCalif = {87, 68, 94, 100, 83, 78, 85,  91, 76, 87};

        LibroCalificaciones miLibroCalificaciones = new LibroCalificaciones(
                "CS101 Introduccion a la programacion en Java",
                arregloCalif);
        System.out.printf("Bienvenido al libro de calificaiones para %n%s%n%n",
                miLibroCalificaciones.obtenerNombreDelCurso());
        miLibroCalificaciones.procesarCalificaciones();
    }
}
