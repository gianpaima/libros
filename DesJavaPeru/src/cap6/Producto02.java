package cap6;

public class Producto02 {

    private String nombre;
    private double precio;

    public Producto02(String nombre, double precio) {
        this.nombre = nombre;
        this.precio = precio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String toString()
    {
        return this.getNombre() + " - " + this.getPrecio();
    }

    public boolean equals(Object obj)
    {
        if (obj == null)
        {
            return false;
        }
        if (obj instanceof Producto02)
        {
            Producto02 producto02 = (Producto02) obj;
            return this.getNombre().equals(producto02.getNombre());
        } else
        {
            return false;
        }
    }

    public int hashCode()
    {
        return this.getNombre().hashCode();
    }
}

