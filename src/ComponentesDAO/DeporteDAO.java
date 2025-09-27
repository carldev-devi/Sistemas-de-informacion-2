
package ComponentesDAO;

import static Conexion.DatabaseConnection.connect;
import java.sql.*;

public class DeporteDAO {
     
    public boolean existe(String nombre) 
    throws SQLException{
        String sql = "select count(*) nombre from deportes where nombre=?";
       
        try(Connection conn = connect();
            PreparedStatement pstmt = conn.prepareStatement(sql)){
            pstmt.setString(1, nombre);
            try(ResultSet rs = pstmt.executeQuery()){
                if(rs.next()){
                    return rs.getInt(1)>0;
                }
            }
        }
        return false;
    }
    
    public void agregar(String nombre, int valor) throws SQLException {
        String sql = "insert into deportes(nombre,valor) values(?,?)";
        try (Connection conn = connect();
            PreparedStatement edit = conn.prepareStatement(sql)) {
            edit.setString(1, nombre);
            edit.setInt(2, valor);
            edit.executeUpdate();
        }
    }
}
