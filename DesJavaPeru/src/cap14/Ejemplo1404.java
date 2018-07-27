package cap14;

import java.sql.*;

public class Ejemplo1404 {

    public static void main(String[] args) {

        String sql = "{call usp_consulta_telefono_de_cliente(?,?)}";
        Connection cn = null;
        CallableStatement cs = null;
        String telefono = null;

        try{
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            cn = DriverManager.getConnection("jdbc:mysql://localhost/eurekabank", "root", "");
            // Preparamos la llamada
            cs = cn.prepareCall(sql);
            cs.setString(1, "00888");
            cs.registerOutParameter(2, java.sql.Types.VARCHAR);
            // Realizamos la llamada
            cs.execute();
            // Obtenemos el valor del parametro de salida
            telefono = cs.getString(2);
            if (cs.wasNull()){
                System.out.println("Código no existe.");
            } else {
                System.out.println("Telefono: "+ telefono);
            }
        } catch (Exception ex)
        {
            ex.printStackTrace();
        } finally {
            try {
                if (cn.isClosed() == false){
                    cn.close();
                }
            } catch (SQLException ex) {}
        }
    }
}
