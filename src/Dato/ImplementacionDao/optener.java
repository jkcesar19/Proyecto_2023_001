
package Dato.ImplementacionDao;

import Dato.BD.Conexion;
import Vista.Dashboard;
import java.io.IOException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author llagu
 */
public class optener {
   public void obtener_pdf(int id) throws Exception {
        Conexion conec = new Conexion();
        PreparedStatement ps = null;
        ResultSet rs = null;
        String sql = "SELECT foto FROM vista_usuario_per WHERE id =?";
        try {
            ps = conec.getConexion().prepareStatement(sql);
            ps.setInt(1, id);
            rs = ps.executeQuery();
            while (rs.next()) {
                Dashboard.foto = rs.getString(1);
            }
        } catch (IOException | NumberFormatException | SQLException ex) {
            System.out.println("Error al abrir archivo FOTO " + ex.getMessage());
        }
    } 
}
