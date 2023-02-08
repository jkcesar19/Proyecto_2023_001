package Negocio;

import Dato.BD.Conexion;
import Dato.Clase.Inicio;
import Dato.ImplementacionDao.InicioImplDao;
import Dato.InterfaceDao.inicioDao;
import java.sql.Connection;

/**
 * @fecha: 05 - 01 - 2023
 * @author Llaguento Carlos Cesar JK
 */
public class InicioBo {
    public static Inicio validar_inicio(String user, String clave) throws Exception {
        Connection con = null;
        Inicio usuario = null;
        try {
            con = Conexion.getConexion();
            inicioDao inicio = new InicioImplDao(con);
            usuario = inicio.validar_inicio(user, clave);
            if (usuario == null) {
                throw new Exception("Usuario y/o Clave incorectos");
            }
        } catch (Exception e) {
            throw e;
        } finally {
            if (con != null) {
                con.close();
            }
        }
        return usuario;
    }
}
