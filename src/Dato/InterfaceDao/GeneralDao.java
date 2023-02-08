
package Dato.InterfaceDao;

import java.sql.SQLException;
import java.util.Vector;

/**
 * @fecha: 30 - 12 -2022
 * @author Llaguento Carlos Jk Cesar
 */
public interface GeneralDao {
     public Vector Lista() throws SQLException;

    public boolean grabar(Object object) throws SQLException;

    public boolean eliminar(Object object) throws SQLException;

    public boolean modificar(Object object) throws SQLException;
}
