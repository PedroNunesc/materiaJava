/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package loginEncriptado.database;

import io.github.cdimascio.dotenv.Dotenv;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author PEDROHENRIQUENUNESCA
 */
public class Conexao {

    // Carrega as variáveis do arquivo .env
    private static final Dotenv dotenv = Dotenv.load();

    private static Connection connection;

    // Variáveis marcadas com final são constantes
    // Por convenção, usamos letras maiúsculas para seus nomes (e _ caso tenham mais de uma palavra)
    private static final String URL = dotenv.get("DB_URL");
    private static final String DB_USER = dotenv.get("DB_USER");
    private static final String DB_PASSWORD = dotenv.get("DB_PASSWORD");

    public static Connection conectar() {
        try {
            // Se a conexão for nula OU a conexão foi fechada
            // Ou seja, se eu ainda não estiver conectado
            if (connection == null || connection.isClosed()) {
                connection = DriverManager.getConnection(URL, DB_USER, DB_PASSWORD);
                System.out.println("Conectado ao banco.");
            }
        } catch (SQLException error) {
            System.out.println("Error: " + error.getMessage());
        }
        return connection;
    }
}
