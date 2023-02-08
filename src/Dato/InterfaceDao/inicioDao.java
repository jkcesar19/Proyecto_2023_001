package Dato.InterfaceDao;

import Dato.Clase.Inicio;
import java.sql.SQLException;

/**
 * @fecha: 05 - 01 - 2023
 * @author Llaguento Carlos Cesar JK
 */
public interface inicioDao {
public Inicio validar_inicio(String user, String clave) throws SQLException;
}
