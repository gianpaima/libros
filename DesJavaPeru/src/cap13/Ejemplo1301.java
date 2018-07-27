package cap13;

import java.sql.*;
import java.util.Properties;

public class Ejemplo1301 {
    public static void main(String[] args) {

        Connection conn1 = null, conn2 = null, conn3= null;

        try {
            Class.forName("sun.jdbc.odbc.JdbcOdbcDriver").newInstance();

            String jdbcUrl = "jdbc:odbc:DSNGustavo";
            String user = "root";
            String pwd = "";
            System.out.println("Abriendo las conexiones de base de datos");

            conn1 = DriverManager.getConnection(jdbcUrl + "UID=" + user + "PWD=" + pwd);

            if (conn1 != null){
                System.out.println("Conexion 1 satisfactoria");
            }

            Properties prop = new Properties();
            prop.put("users", user);
            prop.put("password", pwd);

            conn2 = DriverManager.getConnection(jdbcUrl, prop);

            if (conn2 != null)
            {
                System.out.println("Conexion 2 satisfactoria");
            }

            conn3 = DriverManager.getConnection(jdbcUrl, user, pwd);

            if (conn3 != null){
                System.out.println("Conexión 3 satisfactoria");
            }

            conn1.close();
            conn2.close();
            conn3.close();

            if (conn1.isClosed()){
                System.out.println("Conexion 1 cerrada");
            }
            if (conn2.isClosed()){
                System.out.println("Conexion 2 cerrada");
            }
            if (conn3.isClosed()){
                System.out.println("Conexion 3 cerrada");
            }

        } catch (SQLException se)
        {
            se.printStackTrace();;
        } catch (Exception e){
            e.printStackTrace();
        } finally {
            try {
                if (conn1 != null){
                    conn1.close();
                }
                if (conn2 != null) {
                    conn2.close();
                }
                if (conn3 != null){
                    conn3.close();
                }
            } catch (SQLException se){
                se.printStackTrace();
            }
        }
    }
}
