package Dato.ImplementacionDao;

import Dato.Clase.ArchivoPdf;
import Dato.Clase.Estado;
import Dato.Clase.Usuario;
import Dato.InterfaceDao.pdfDao;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Vector;

/**
 * @fecha: 03/01/2022
 * @author Llaguento Carlos Cesar JK
 */
public class ArchivoPdfImplDao implements pdfDao {

    private PreparedStatement pst;
    private Statement st;
    private CallableStatement cst;
    private Connection con;
    private ArchivoPdf objArchivoPdf;

    public ArchivoPdfImplDao(Connection con) {
        this.con = con;
    }

    @Override
    public Vector Lista() throws SQLException {
        Vector listaUsua = new Vector();
        String sql = "SELECT nombre FROM vista_usuario ORDER BY nombre ASC";
        st = con.createStatement();
        ResultSet rs = st.executeQuery(sql);
        while (rs.next()) {
            Usuario usua = new Usuario();
            usua.setNombre(rs.getString(1));
            listaUsua.add(usua);
        }
        return listaUsua;
    }

    @Override
    public boolean grabar(Object object) throws SQLException {
        objArchivoPdf = (ArchivoPdf) object;
        try {
            String sql = "{CALL,pro_registrar_archivo(?,?,?,?,?,?,?,?)}";
            cst = con.prepareCall(sql);
            cst.setString(1, objArchivoPdf.getUsuar());
            cst.setString(2, objArchivoPdf.getDestino());
            cst.setString(3, objArchivoPdf.getNompdf());
            cst.setString(4, objArchivoPdf.getAsunto());
            cst.setString(5, objArchivoPdf.getDescrip());
            cst.setBytes(6, objArchivoPdf.getPdf());
            cst.setString(7, objArchivoPdf.getEstado());
            cst.setString(8, objArchivoPdf.getEst());
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
    objArchivoPdf = (ArchivoPdf) object;
        try {
            String sql = "{CALL,pro_modificar_archivo(?,?,?,?,?,?,?,?,?)}";
            cst = con.prepareCall(sql);
            cst.setString(1, objArchivoPdf.getUsuar());
            cst.setString(2, objArchivoPdf.getDestino());
            cst.setString(3, objArchivoPdf.getNompdf());
            cst.setString(4, objArchivoPdf.getAsunto());
            cst.setString(5, objArchivoPdf.getDescrip());
            cst.setBytes(6, objArchivoPdf.getPdf());
            cst.setString(7, objArchivoPdf.getEstado());
            cst.setString(8, objArchivoPdf.getEst());
            cst.setInt(9, objArchivoPdf.getIdpdf());
            cst.execute();
            cst.close();
            return true;
        } catch (SQLException e) {
            throw e;
        }
    }
    @Override
    public Vector Lista1() throws SQLException {
        Vector listaEst = new Vector();
        String sql = "SELECT estado FROM estadopdf";
        st = con.createStatement();
        ResultSet rs = st.executeQuery(sql);
        while (rs.next()) {
            Estado est = new Estado();
            est.setEstado(rs.getString(1));
            listaEst.add(est);
        }
        return listaEst;
        

    }

}
