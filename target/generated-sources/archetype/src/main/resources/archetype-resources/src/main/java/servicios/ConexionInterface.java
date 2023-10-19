#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package servicios;

import java.sql.Connection;

public interface ConexionInterface {
	// No Hay comentarios aqui porque ya estan comentados todos los metodos en la clase
	
	public Connection generarConexion();
	
	public void cerrarConexion(Connection conexion);
}