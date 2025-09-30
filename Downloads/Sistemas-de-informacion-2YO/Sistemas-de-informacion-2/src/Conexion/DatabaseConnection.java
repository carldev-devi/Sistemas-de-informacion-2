package Conexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnection {

    // --- DATOS DE CONEXIÓN OBTENIDOS DE RAILWAY ---
    // Declara todas las partes de la URL como constantes estáticas
    private static final String HOST = "caboose.proxy.rlwy.net";
    private static final String PORT = "16192"; // <-- REEMPLAZA con tu puerto de Railway
    private static final String DATABASE = "railway"; // <-- REEMPLAZA con el nombre de tu BD
    private static final String USER = "root";
    private static final String PASSWORD = "EEwezVPUGjDIyXTEPKtARSQpHCtdbeUo";

    // --- CONSTRUCCIÓN DE LA URL DE JDBC ---
    // Se construye la URL completa con el formato correcto
    private static final String URL = "jdbc:mysql://" + HOST + ":" + PORT + "/" + DATABASE;

    public static Connection connect() {
        Connection conn = null;
        try {
            // Se usa la variable URL, ahora sí definida y completa
            conn = DriverManager.getConnection(URL, USER, PASSWORD);
            System.out.println("Conexión a MySQL establecida exitosamente. ✅");
        } catch (SQLException e) {
            System.out.println("Error al conectar a MySQL: " + e.getMessage());
            e.printStackTrace(); // Es útil para ver el detalle completo del error
        }
        return conn;
    }
}