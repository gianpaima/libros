package cap14;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class ClienteModel {

    public void insertar(ClienteTO clienteTO) throws Exception {

        Connection cn = null;
        PreparedStatement ps = null;
        String sql = null;
        try {
            // Obtenemos la conexión con la base de datos
            cn = AccesoDB.getConnection();
            // Deshabilitamos el auto-commit
            cn.setAutoCommit(false);
            // Obtenemos el código del nuevo cliente
            clienteTO.setCliecodigo(ContadorModel.getContador("Cliente"));
            // Preparamos la sentencia para grabar
            sql = "insert into cliente(chr_cliecodigo,vch_cliepaterno,vch_cliematerno," +
                    "vch_clienombre,chr_cliedni,vch_clieciudad,vch_cliedireccion,vch_clietelefono," +
                    "vch_clieemail) values(?,?,?,?,?,?,?,?,?)";
            // Creamos el objeto PrepareStatement
            ps = cn.prepareStatement(sql);
            // Asignamos valores a los parámetros
            ps.setString(1, clienteTO.getCliecodigo());
            ps.setString(2, clienteTO.getCliepaterno());
            ps.setString(3, clienteTO.getCliematerno());
            ps.setString(4, clienteTO.getClienombre());
            ps.setString(5, clienteTO.getCliedni());
            ps.setString(6, clienteTO.getClieciudad());
            ps.setString(7, clienteTO.getCliedireccion());
            ps.setString(8, clienteTO.getClietelefono());
            ps.setString(9, clienteTO.getClieemail());
            // Ejecutamos
            ps.executeUpdate();
            // Confirmamos la transacción
            cn.commit();
            // Cerramos el objeto PreparedStatement
            ps.close();
        } catch (Exception e) {
            try {
                // Cancelamos la transacción
                cn.rollback();
            } catch (SQLException ex) {}
            throw e;
        }

    } // insertar
}
