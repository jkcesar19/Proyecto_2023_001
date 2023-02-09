
package Negocio;

import Dato.BD.Conexion;
import Dato.ImplementacionDao.UsuarioImpleDao;
import Dato.InterfaceDao.UsuarioDao;
import java.sql.Connection;
import java.util.Vector;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author llagu
 */
public class UsuarioFBo {
   public static DefaultTableModel ListaTable() throws Exception {
        DefaultTableModel usuarioTableModel = null;
        Connection con = Conexion.getConexion();
        try {
            UsuarioDao usuarioDao = new UsuarioImpleDao(con);
            Vector datoUsuario = usuarioDao.Lista();
            Vector columnas = new Vector();
            columnas.add("ID");
            columnas.add("Foto");
            columnas.add("Nombres");
            columnas.add("DNI");
            columnas.add("Dirección");
            columnas.add("Teléfono");
            columnas.add("Usuario");
            columnas.add("Contraseña");
            columnas.add("Estado");
            usuarioTableModel = new DefaultTableModel(datoUsuario, columnas);

        } catch (Exception e) {
            throw e;
        } finally {
            if (con != null) {
                con.close();
            }
        }
        return usuarioTableModel;
    }  
}
