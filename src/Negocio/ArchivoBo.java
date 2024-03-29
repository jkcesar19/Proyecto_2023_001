package Negocio;

import Dato.BD.Conexion;
import Dato.Clase.Archivo;
import Dato.ImplementacionDao.ArchivoImplDao;
import Dato.InterfaceDao.pdfDao;
import java.sql.Connection;
import java.util.Vector;
import javax.swing.DefaultComboBoxModel;

/**
 * @fecha:03/01/2023
 * @author Llaguento Carlos Cesar JK
 */
public class ArchivoBo {

    public static DefaultComboBoxModel ModeloUsu() throws Exception {
        DefaultComboBoxModel combox = null;
        Connection con = Conexion.getConexion();
        try {
            pdfDao usuaDao = new ArchivoImplDao(con);
            Vector vector = usuaDao.Lista();
            combox = new DefaultComboBoxModel(vector);
        } catch (Exception e) {
            throw e;
        } finally {
            if (con != null) {
                con.close();
            }
        }
        return combox;
    }

    public static DefaultComboBoxModel ModeloUsu1() throws Exception {
        DefaultComboBoxModel combox = null;
        Connection con = Conexion.getConexion();
        try {
            pdfDao estDao = new ArchivoImplDao(con);
            Vector vector = estDao.Lista1();
            combox = new DefaultComboBoxModel(vector);
        } catch (Exception e) {
            throw e;
        } finally {
            if (con != null) {
                con.close();
            }
        }
        return combox;
    }

    public static boolean grabar_pdf(Archivo objPdf) throws Exception {
        Connection con = null;
        try {
            con = Conexion.getConexion();
            con.setAutoCommit(false);
            pdfDao pdfDao = new ArchivoImplDao(con);
            pdfDao.grabar(objPdf);
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

    public static boolean modificar_pdf(Archivo objPdf) throws Exception {
        Connection con = null;
        try {
            con = Conexion.getConexion();
            con.setAutoCommit(false);
            pdfDao pdf_dao = new ArchivoImplDao(con);
            pdf_dao.modificar(objPdf);
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
