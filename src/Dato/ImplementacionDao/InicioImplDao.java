package Dato.ImplementacionDao;

import Dato.Clase.Inicio;
import Dato.InterfaceDao.inicioDao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * @fecha: 05 - 01 - 2023
 * @author Llaguento Carlos Cesar JK
 */
public class InicioImplDao implements inicioDao{
private Connection con;

    public InicioImplDao(Connection con) {
        this.con = con;
    }


    @Override
    public Inicio validar_inicio(String user, String clave) throws SQLException {
        Inicio inicio = null;
        ResultSet rs = null;
        PreparedStatement pst = null;
        try {
            String sql = "SELECT * FROM vista_inicio WHERE usua = '" + user + "'  AND cont = '" + clave + "'";
            pst = con.prepareStatement(sql);
            rs = pst.executeQuery(sql);
            if (rs.next()) {
                inicio = new Inicio();
                inicio.setUsua(rs.getString(1));
                inicio.setCont(rs.getString(2));
                inicio.setAdmi(rs.getString(3));
            }
        } catch (Exception e) {
            throw e;
        } finally {
            if (rs != null) {
                rs.close();
            } else {
                pst.close();
            }
        }
        return inicio;
    }

}
