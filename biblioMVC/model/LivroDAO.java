/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package biblioMVC.model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author PEDROHENRIQUENUNESCA
 */
public class LivroDAO {
    private Connection conexao;

    public LivroDAO() {
        this.conexao = ConexaoSQLite.conectar();
    }
    
    // Método para adicionar um livro na tabela
    public void adicionarLivro(Livro livro) {
    String sql = "INSERT INTO livros (titulo, autor, ano) VALUES (?, ?, ?)";
    try (PreparedStatement stmt = conexao.prepareStatement(sql)) {
    // Define os parâmetros do comando com os dados do livro
        stmt.setString(1, livro.getTitulo());
        stmt.setString(2, livro.getAutor());
        stmt.setInt(3, livro.getAno());

      // Executa a atualização
        stmt.executeUpdate();
        
        // Exibe uma mensagem de sucesso
        JOptionPane.showMessageDialog(null, "Livro cadastrado com sucesso!");
    } catch (SQLException e) {
        // Se ocorrer um erro
        JOptionPane.showMessageDialog(null, "Erro ao adicionar livro: " + e.getMessage());
    }

    }
}
    