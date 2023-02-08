package Dato.InterfaceDao;

import java.sql.SQLException;
import java.util.Vector;

/**
 * @fecha: 03/01/2023
 * @author Llaguento Carlos Cesar JK
 */
public interface pdfDao extends GeneralDao{

    public Vector Lista1() throws SQLException;
}
