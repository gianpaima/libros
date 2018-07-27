package cap14;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class ClienteModel {

    public void insertar(ClienteTO clienteTO) throws Exception {

        Connection cn = null;
        PreparedStatement ps = null;
        String sql = null;
        try {
            // Obtenemos la conexion con la base de datos
            cn = AccesoDB.getConnection();
            // Deshabilitamos el auto-comit
            cn.setAutoCommit(false);
            // Obtenemos el codigo del nuevo cliente
            clienteTO.setCliecodigo(ContadorModel.getContador("Cliente"));
            // Preparamos la sentencia para grabar
            sql = "insert into cliente(chr_cliecodigo,vch_cliepaterno,vch_cliematerno," +
                    "vch_clienombre,chr_cliedni,vch_clieciudad,vch_cliedireccion,vch_clietelefono," +
                    "vch_clieemail) values(?,?,?,?,?,?,?,?,?)";
            // Creamos el objeto
        }

    }
}
