package Negocio;

import Dato.BD.Conexion;
import Dato.Clase.Usuario;
import Dato.ImplementacionDao.UsuarioImpleDao;
import Dato.InterfaceDao.UsuarioDao;
import java.sql.Connection;
import java.util.Vector;
import javax.swing.table.DefaultTableModel;

/**
 * @fecha: 30 - 12 - 2022
 * @author: Llaguento Carlos Cesar JK
 */
public class UsuarioBo {

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

    public static boolean grabarUsuario(Usuario objUsuario) throws Exception {
        Connection con = null;
        try {
            con = Conexion.getConexion();
            con.setAutoCommit(false);
            UsuarioDao usuarioDao = new UsuarioImpleDao(con);
            usuarioDao.grabar(objUsuario);
            con.commit();
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            con.rollback();
            throw e;
        } finally {
            if (con != null) {
                con.close();
            }
        }
    }

    public static boolean modificarUsuario(Usuario objUsuario) throws Exception {
        Connection con = null;
        try {
            con = Conexion.getConexion();
            con.setAutoCommit(false);
            UsuarioDao usuarioDao = new UsuarioImpleDao(con);
            usuarioDao.modificar(objUsuario);
            con.commit();
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            con.rollback();
            throw e;
        } finally {
            if (con != null) {
                con.close();
            }
        }
    }
}
