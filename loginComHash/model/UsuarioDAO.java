/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package loginComHash.model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import org.mindrot.jbcrypt.BCrypt;

/**
 *
 * @author PEDROHENRIQUENUNESCA
 */
public class UsuarioDAO {
    public boolean registrarUsuario(Usuario usuario) {
    String sql = "INSERT INTO usuarios (usuario, senha) VALUES (?, ?)";
    
    String user = usuario.getUsuario();
    String senha = usuario.getSenha();
    
    String senhaHash = BCrypt.hashpw(senha, BCrypt.gensalt());
         
    try (Connection conn = ConexaoSQLite.conectar(); PreparedStatement stmt = conn.prepareStatement(sql)) {
    
    stmt.setString(1, user);
    stmt.setString(2, senhaHash);
    
    stmt.executeUpdate(); 
    
    return true;
    } catch (SQLException e){
            e.printStackTrace();
            return false;}
    }
    
    public boolean validarLogin(String usuario, String senha) {
        String sql = "SELECT senha FROM usuarios WHERE usuario = ?";

        try (Connection conn = ConexaoSQLite.conectar();
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            
            // Define o parâmetro da consulta SQL
            stmt.setString(1, usuario);
            ResultSet rs = stmt.executeQuery();
            
            // Se encontrou o usuário, verifica se a senha fornecida corresponde ao hash armazenado
            if (rs.next()) {
                return BCrypt.checkpw(senha, rs.getString("senha"));
            }
        } catch (SQLException e) {
            e.printStackTrace(); // Exibe o erro no console
        }
        
        return false; // Retorna false caso não encontre o usuário ou ocorra um erro
    }

}
