package Dato.ImplementacionDao;

import Dato.BD.Conexion;
import Dato.Clase.ArchivoPdf;
import Vista.Dashboard;
import java.io.ByteArrayInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 * @fecha: 01/02/2023
 * @author Llaguento Carlos Cesar JK
 */
public class TablaDao {

    public ArrayList<ArchivoPdf> Listar_Archivo() {
        ArrayList<ArchivoPdf> list = new ArrayList<ArchivoPdf>();
        Conexion conec = new Conexion();
        String sql = "SELECT * FROM vista_pdf ORDER BY idpdf ASC";
        ResultSet rs = null;
        PreparedStatement ps = null;
        try {

            ps = conec.getConexion().prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                ArchivoPdf arch = new ArchivoPdf();
                arch.setIdpdf(rs.getInt(1));
                arch.setUsuar(rs.getString(2));
                arch.setDestino(rs.getString(3));
                arch.setNompdf(rs.getString(4));
                arch.setAsunto(rs.getString(5));
                arch.setDescrip(rs.getString(6));
                arch.setPdf(rs.getBytes(7));
                arch.setEstado(rs.getString(8));
                arch.setEst(rs.getString(9));
                list.add(arch);
            }
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        } finally {
            try {
                ps.close();
                rs.close();
            } catch (Exception ex) {
            }
        }
        return list;
    }

    public void ejecutar_pdf(int id) throws Exception {

        Conexion conec = new Conexion();
        PreparedStatement ps = null;
        ResultSet rs = null;
        byte[] b = null;
        String sql = "SELECT pdf FROM vista_pdf WHERE idpdf =?";
        try {
            ps = conec.getConexion().prepareStatement(sql);
            ps.setInt(1, id);
            rs = ps.executeQuery();
            while (rs.next()) {
                b = rs.getBytes(1);
            }
            InputStream bos = new ByteArrayInputStream(b);

            int tamanoInput = bos.available();
            byte[] datosPDF = new byte[tamanoInput];
            bos.read(datosPDF, 0, tamanoInput);

            OutputStream out = new FileOutputStream("new.pdf");
            out.write(datosPDF);

            //abrir archivo
            out.close();
            bos.close();
            ps.close();
            rs.close();

        } catch (IOException | NumberFormatException | SQLException ex) {
            System.out.println("Error al abrir archivo PDF " + ex.getMessage());
        }
    }

    public void obtener_pdf(int id) throws Exception {
        Conexion conec = new Conexion();
        PreparedStatement ps = null;
        ResultSet rs = null;
        String sql = "SELECT pdf FROM vista_pdf WHERE idpdf =?";
        try {
            ps = conec.getConexion().prepareStatement(sql);
            ps.setInt(1, id);
            rs = ps.executeQuery();
            while (rs.next()) {
                Dashboard.bite = rs.getBytes(1);
            }
        } catch (IOException | NumberFormatException | SQLException ex) {
            System.out.println("Error al abrir archivo PDF " + ex.getMessage());
        }
    }

    public void contador_prioridad() throws Exception {
        Conexion conec = new Conexion();
        PreparedStatement ps = null;
        ResultSet rs = null;
        int ur = 0, nour = 0, im = 0, noim = 0;
        String sql = "SELECT prioridad FROM vista_pdf";
        try {
            ps = conec.getConexion().prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                if (rs.getString(1).equals("urgente")) {
                    ur++;
                } else if (rs.getString(1).equals("no urgente")) {
                    nour++;
                } else if (rs.getString(1).equals("importante")) {
                    im++;
                } else {
                    noim++;
                }

            }
            Dashboard.urgente = ur;
            Dashboard.no_urgente = nour;
            Dashboard.importante = im;
            Dashboard.no_importante = noim;
//           javax.swing.JOptionPane.showMessageDialog(null, "urgente: "+ur+" no urgente: "+nour+" importante: "+im+" no importante: "+noim);
        } catch (SQLException ex) {
            System.out.println("Error al obtener la prioridad " + ex.getMessage());
        }
    }

}
