package Dato.ImplementacionDao;

import Dato.BD.Conexion;
import Dato.Clase.Archivo;
import Vista.Dashboard;
import java.io.IOException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 * @fecha: 01/02/2023
 * @author Llaguento Carlos Cesar JK
 */
public class TablaDao {

    public ArrayList<Archivo> Listar_Archivo() {
        ArrayList<Archivo> list = new ArrayList<Archivo>();
        Conexion conec = new Conexion();
        String sql = "SELECT * FROM vista_archivo ORDER BY idpdf ASC";
        ResultSet rs = null;
        PreparedStatement ps = null;
        try {

            ps = conec.getConexion().prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                Archivo arch = new Archivo();
                arch.setIdpdf(rs.getInt(1));
                arch.setUsuar(rs.getString(2));
                arch.setDestino(rs.getString(3));
                arch.setTitulo(rs.getString(4));
                arch.setAsunto(rs.getString(5));
                arch.setDescrip(rs.getString(6));
                arch.setArchivo(rs.getString(7));
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
        String text = "";
        String sql = "SELECT archivo FROM vista_archivo WHERE idpdf =?";
        try {
            ps = conec.getConexion().prepareStatement(sql);
            ps.setInt(1, id);
            rs = ps.executeQuery();
            while (rs.next()) {
                text = rs.getString(1);
            }
            String direccion, url;
            direccion = "C:\\appjava\\archivos\\";
            url=direccion+text;
            ProcessBuilder p = new ProcessBuilder();
            p.command("cmd.exe","/C",url);
            p.start();

        } catch (SQLException ex) {
            System.out.println("Error al abrir archivo PDF " + ex.getMessage());
        }
    }

    public void obtener_pdf(int id) throws Exception {
        Conexion conec = new Conexion();
        PreparedStatement ps = null;
        ResultSet rs = null;
        String sql = "SELECT archivo FROM vista_archivo WHERE idpdf =?";
        try {
            ps = conec.getConexion().prepareStatement(sql);
            ps.setInt(1, id);
            rs = ps.executeQuery();
            while (rs.next()) {
                Dashboard.archi = rs.getString(1);
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
        String sql = "SELECT prioridad FROM vista_archivo";
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
        } catch (SQLException ex) {
            System.out.println("Error al obtener la prioridad " + ex.getMessage());
        }
    }

}
