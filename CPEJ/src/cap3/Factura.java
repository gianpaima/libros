package cap3;

public class Factura
{
    //Variables de instancia
    private String npieza; // Número de la pieza
    private String dpieza; // Descripción de la pieza
    private int cantidad; // Cantidad del artículo
    private double precio; // Valor del artículo

    public Factura (String npieza, String dpieza, int cantidad, double precio)
    {
        //Asignación de los valores de los parámetros a las vars de inst.
        this.npieza = npieza;
        this.dpieza = dpieza;
        this.cantidad = cantidad;
        this.precio = precio;
    }

    public String getNpieza()
    {
        return npieza;
    }
    public void setNpieza(String npieza) {
        this.npieza = npieza;
    }

    public String getDpieza() {
        return dpieza;
    }
    public void setDpieza(String dpieza) {
        this.dpieza = dpieza;
    }

    public int getCantidad()
    {
        return cantidad;
    }
    public void setCantidad(int cantidad)
    {
        this.cantidad = cantidad;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    //Método Obtener Monto Factura
    public void obtenerMontoFactura(){
        if (cantidad < 0)
            cantidad = 0;
        if (precio < 0.0)
            precio = 0.0;

        System.out.printf("\n ********FERRETERIA********");
        System.out.printf("\n ***** Factura ***** \n\n");
        System.out.printf("Número de pieza: %s", npieza);
        System.out.printf("\nDescripción de la pieza: %s", dpieza);
        System.out.printf("\nCantidad del artículo: %d", cantidad);
        System.out.printf("\nValor unitario del artículo: %.2f", precio);

        //Totalizar el monto de la compra
        System.out.printf("\n\nEl total a pagar es: %.2f", (cantidad * precio));
    }


}
