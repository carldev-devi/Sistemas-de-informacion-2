package ComponentesDAO;

import Conexion.DatabaseConnection;
import Modelos.Postulante;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class PostulanteDAO {

    
    public Postulante buscarPostulanteYVerificarAprobacion(int ci) {
        // La consulta une postulantes con ResultadosExamen para obtener el estado.
        String SQL = "SELECT p.id_postulantes, p.nombres, p.apellidos, p.correo, p.ci, r.estado_aprobacion " +
                     "FROM postulantes p " +
                     "LEFT JOIN ResultadosExamen r ON p.id_postulantes = r.id_postulantes " +
                     "WHERE p.ci = ?";

        try (Connection conn = DatabaseConnection.connect();
             PreparedStatement pstmt = conn.prepareStatement(SQL)) {

            if (conn == null) {
                System.out.println("DAO Error: No se pudo establecer conexión con la BD.");
                return null;
            }

            pstmt.setInt(1, ci);
            ResultSet rs = pstmt.executeQuery();

            if (rs.next()) {
                // Mapeo de datos del postulante
                int id = rs.getInt("id_postulantes");
                String nombres = rs.getString("nombres");
                String apellidos = rs.getString("apellidos");
                String correoPersonal = rs.getString("correo");
                
                // Verificación de aprobación
                String estadoAprobacion = rs.getString("estado_aprobacion");
                boolean aprobado = "APROBADO".equalsIgnoreCase(estadoAprobacion);
                
                // Creación del objeto Postulante
                Postulante postulante = new Postulante(id, nombres + " " + apellidos, correoPersonal, aprobado);
                return postulante;
            }

        } catch (SQLException e) {
            System.err.println("Error al buscar postulante por CI: " + e.getMessage());
            e.printStackTrace();
        }
        return null;
    }

    /**
     * Actualiza la tabla postulantes con las credenciales institucionales generadas.
     * * @param postulante Objeto Postulante con ID y nuevas credenciales.
     * @return true si la actualización fue exitosa, false si falló.
     */
    public boolean actualizarCredenciales(Postulante postulante) {
        // Asumo que la tabla 'postulantes' tiene columnas para guardar las credenciales.
        // Si no las tiene, debes añadirlas (ej: correo_institucional, contrasena_aleatoria, codigo_toma_materias)
        String SQL_UPDATE = "UPDATE postulantes SET correo_institucional = ?, contrasena_aleatoria = ?, codigo_toma_materias = ? " +
                            "WHERE id_postulantes = ?";

        try (Connection conn = DatabaseConnection.connect();
             PreparedStatement pstmt = conn.prepareStatement(SQL_UPDATE)) {

            if (conn == null) return false;

            pstmt.setString(1, postulante.getCorreoInstitucional());
            // NOTA IMPORTANTE: En una aplicación real, la contraseña NUNCA se guarda en texto plano (se usaría HASH).
            pstmt.setString(2, postulante.getContrasenaAleatoria()); 
            pstmt.setString(3, postulante.getCodigoTomaMaterias());
            pstmt.setInt(4, postulante.getId());

            int affectedRows = pstmt.executeUpdate();
            return affectedRows > 0;

        } catch (SQLException e) {
            System.err.println("Error al actualizar credenciales: " + e.getMessage());
            e.printStackTrace();
            return false;
        }
    }
}
