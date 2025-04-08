/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package loginComHash.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author PEDROHENRIQUENUNESCA
 */
// Método para conectar ao banco de dados
public class ConexaoSQLite {

    private static final String URL = "jdbc:mysql://localhost:3306/login_hash";
    private static final String DB_USER = "root";
    private static final String DB_PASSWORD = "root";
    private static Connection connection;

    public static Connection conectar() throws SQLException {
        try {
            if (connection == null || connection.isClosed()) {
                connection = DriverManager.getConnection(URL, DB_USER, DB_PASSWORD);
                criarTabela();
            }
            return connection;
        } catch (SQLException e) {
            throw new SQLException("Erro ao conectar ao banco de dados!", e);
        }
    }

    private static void criarTabela() {
        String sql = "CREATE TABLE IF NOT EXISTS usuarios ("
                + "id INT AUTO_INCREMENT PRIMARY KEY, "
                + "usuario VARCHAR(255) NOT NULL, "
                + "senha VARCHAR(255) NOT NULL)";
        try (Statement stmt = connection.createStatement()) {
            // Executa o comando SQL para criar a tabela, se necessário
            stmt.execute(sql);
        } catch (SQLException e) {
            // Lança uma exceção em caso de erro na criação da tabela
            throw new RuntimeException("Erro ao criar a tabela", e);
        }
    }
}
