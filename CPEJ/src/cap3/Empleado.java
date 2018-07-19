package cap3;

public class Empleado {
    private String nombre;
    private String apellidoPat;
    private double salarioMensual;

    public Empleado(String nombre, String apellidoPat, double salarioMensual)
    {
        this.nombre = nombre;
        this.apellidoPat = apellidoPat;
        if (salarioMensual > 0.0)
            this.salarioMensual = salarioMensual;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellidoPat() {
        return apellidoPat;
    }

    public double getSalarioMensual() {
        return salarioMensual;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellidoPat(String apellidoPat) {
        this.apellidoPat = apellidoPat;
    }

    public void setSalarioMensual(double salarioMensual) {
        this.salarioMensual = salarioMensual;
    }

    public double obtenerSalarioAnual()
    {
        return salarioMensual * 12;
    }

    public double obtenerAumento()
    {
        return obtenerSalarioAnual() * 1.10;
    }

    public void mostrarResumen()
    {
        System.out.printf( "\nSu nombre es: %s" , getNombre());
        System.out.printf( "\nSu apellido es: %s" , getApellidoPat());
        System.out.printf( "\nSu salario mensual es: %.2f" , getSalarioMensual());
        System.out.printf( "\nSu salario anual sin incremento es: %.2f" , obtenerSalarioAnual());
        System.out.printf( "\nSu salario anual con incremento es: %.2f" , obtenerAumento());
    }
}
