/*
  * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package biblioMVC.model;

import java.sql.Connection;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author PEDROHENRIQUENUNESCA
 */
public class CriarTabela { // Declaração da classe CriarTabela

    // Método que cria a tabela 'livros' no banco de dados
    public static void criarTabelaLivros(Connection conexao) {
        // Cria uma string contendo o comando SQL para criar a tabela, se não existir
        String sql = "CREATE TABLE IF NOT EXISTS livros ("
                + "id INTEGER PRIMARY KEY AUTOINCREMENT, " // Coluna 'id' como chave primária com autoincremento
                + "titulo TEXT NOT NULL, " // Coluna 'titulo' do tipo TEXT, obrigatório (NOT NULL)
                + "autor TEXT NOT NULL," // Coluna 'autor' do tipo TEXT, obrigatório (NOT NULL)
                + "ano INTEGER NOT NULL )"; // Coluna 'ano' do tipo INT, obrigatório (NOT NULL)

        // Bloco try and catch para garantir o fechamento do Statement após a execução
        /*Create Statement cria um objeto do tipo Statement, que permite executar comandos 
        SQL no banco de dados.*/
        try (Statement stmt = conexao.createStatement()) {
            // Statment = consultas sem prucura de paramêtros/ID. EX: Criação de tabelas como a acima
            // PrepareStatment = consultas mais seguras usando parametros/ID. EX: prucurar algo usando set String para achar algo

            stmt.execute(sql); // Executa o comando SQL para criar a tabela
            System.out.println("Tabela 'livors' verificada/criada ou já existente."); // Exibe mensagem de sucesso
        } catch (Exception e) { // Captura exceções que possam ocorrer durante a execução
            JOptionPane.showMessageDialog(null, "Erro ao criar tabela: " + e.getMessage()); // Exibe mensagem de erro
        }
    }

    
}
