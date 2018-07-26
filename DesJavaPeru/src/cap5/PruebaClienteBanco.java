package cap5;

import com.sun.security.ntlm.Client;

import java.util.GregorianCalendar;
import java.util.Iterator;

public class PruebaClienteBanco {
    public static void main(String[] args) {
        // Creacion de objetos
        Banco banco01 = new Banco("Santader", "España");
        Banco banco02 = new Banco("Credito", "Perú");

        Cliente clie01 = new Cliente("Claudia", "47302358", new GregorianCalendar(1992, 3, 7));
        Cliente clie02 = new Cliente("Pedro", "39393939", new GregorianCalendar(1944, 3, 7));
        Cliente clie03 = new Cliente("Juana", "12345678", new GregorianCalendar(1974, 3, 17));

        // Agregamos los clientes al banco
        banco01.agregarclientes(clie01);
        banco01.agregarclientes(clie02);
        banco02.agregarclientes(clie01);
        banco02.agregarclientes(clie03);

        // Imprimimos los clientes
        System.out.println("Banco: " + banco01.getNombre());
        Iterator it = banco01.getClientes().iterator();
        while (it.hasNext()) {
            Cliente obj = (Cliente) it.next();
            System.out.println(obj.toString());
        }
        System.out.println("Banco: " + banco02.getNombre());
        it = banco02.getClientes().iterator();
        while (it.hasNext())
        {
            Cliente obj = (Cliente) it.next();
            System.out.println(obj.toString());
    }


    }
}
