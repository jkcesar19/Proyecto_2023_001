package Dato.ImplementacionDao;

import Dato.Clase.Usuario;
import Dato.InterfaceDao.UsuarioDao;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Vector;

/**
 * @fecha: 30 - 12 - 2022
 * @author Llaguento Carlos Jk Cesar
 */
public class UsuarioImpleDao implements UsuarioDao {

    private PreparedStatement pst;
    private Statement st;
    private CallableStatement cst;
    private Connection con;
    private Usuario objUsuario;

    public UsuarioImpleDao(Connection con) {
        this.con = con;
    }

    @Override
    public Vector Lista() throws SQLException {
        Vector listaUsuario = new Vector();
        String sql = "SELECT * FROM vista_usuario";
        st = con.createStatement();
        ResultSet rs = st.executeQuery(sql);
        while (rs.next()) {
            Vector usuario = new Vector();
            usuario.add(rs.getInt("idpersona"));
            usuario.add(rs.getString("nombre"));
            usuario.add(rs.getString("dni"));
            usuario.add(rs.getString("direccion"));
            usuario.add(rs.getString("telefono"));
            usuario.add(rs.getString("usuario"));
            usuario.add(rs.getString("contra"));
            usuario.add(rs.getString("estado"));
            listaUsuario.add(usuario);
        }
        return listaUsuario;
    }

    @Override
    public boolean grabar(Object object) throws SQLException {
        objUsuario = (Usuario) object;
        try {
            String sql = "{CALL,pro_registrar_usuario(?,?,?,?,?,?,?)}";
            cst = con.prepareCall(sql);
            cst.setString(1, objUsuario.getNombre());
            cst.setString(2, objUsuario.getDni());
            cst.setString(3, objUsuario.getDireccion());
            cst.setString(4, objUsuario.getTelefono());
            cst.setString(5, objUsuario.getUsuario());
            cst.setString(6, objUsuario.getContra());
            cst.setString(7, objUsuario.getEstado());
            cst.execute();
            cst.close();
            return true;
        } catch (SQLException e) {
            throw e;
        }
    }

    @Override
    public boolean eliminar(Object object) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet.");
//To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean modificar(Object object) throws SQLException {
        objUsuario = (Usuario) object;
        try {
            String sql = "{CALL,pro_modificar_usuario(?,?,?,?,?,?,?,?)}";
            cst = con.prepareCall(sql);
            cst.setString(1, objUsuario.getNombre());
            cst.setString(2, objUsuario.getDni());
            cst.setString(3, objUsuario.getDireccion());
            cst.setString(4, objUsuario.getTelefono());
            cst.setString(5, objUsuario.getUsuario());
            cst.setString(6, objUsuario.getContra());
            cst.setString(7, objUsuario.getEstado());
            cst.setInt(8, objUsuario.getIdpersona());
            cst.execute();
            cst.close();
            return true;
        } catch (SQLException e) {
            throw e;
        }
    }

}
