package cap14;

import java.sql.*;

public class Ejemplo1403 {

    public static void main(String[] args) {
        Connection cn = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        boolean existe = false;
        String sql = "select * from cliente where vch_cliedireccion like ?";

        try {
            // Establecemos conexion
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            cn = DriverManager.getConnection("jdbc:mysql://localhost/eurekabank", "root", "");
            ps = cn.prepareStatement(sql);
            ps.setString(1,"%Lince%");
            rs = ps.executeQuery();
            while(rs.next()){
                existe = true;
                System.out.println("Empleado: " + rs.getString("vch_clienombre") +
                        " " + rs.getString("vch_cliepaterno"));
            }
            if (!existe)
                System.out.println("No se encontraron datos.");
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
