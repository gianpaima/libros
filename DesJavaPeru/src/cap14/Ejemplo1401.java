package cap14;

import java.sql.*;

public class Ejemplo1401 {

    public static void main(String[] args) {

        Connection cn = null;
        Statement st = null;
        ResultSet rs = null;
        String sql = "select * from empleado where chr_emplcodigo = '0001'";

        try {
            // Establecemos conexion
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            cn = DriverManager.getConnection("jdbc:mysql://localhost/eurekabank", "root", "");
            st = cn.createStatement();
            rs = st.executeQuery(sql);
            if (rs.next())
                System.out.println("Empleado: " + rs.getString("vch_emplnombre") +
                        " " + rs.getString("vch_emplpaterno"));
            else
                System.out.println("Codigo no existe.");
        } catch(Exception ex) {
            ex.printStackTrace();
        } finally {
            try {
                if (cn.isClosed() == false) {
                    cn.close();
                }
            } catch(SQLException ex){

            }
        }
    }
}
