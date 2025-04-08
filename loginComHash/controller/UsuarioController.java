/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package loginComHash.controller;

import loginComHash.model.UsuarioDAO;

/**
 *
 * @author PEDROHENRIQUENUNESCA
 */
public class UsuarioController {
    // Instância do DAO para interagir com o banco de dados
    private UsuarioDAO usuarioDAO = new UsuarioDAO();

    /**
     * Registra um novo usuário no sistema.
     * 
     * @param usuario Nome de usuário
     * @param senha Senha do usuário
     * @return true se o registro for bem-sucedido, false caso contrário
     */
    public boolean registrarUsuario(String usuario, String senha) {
        return public class UsuarioController {
    // Instância do DAO para interagir com o banco de dados
    private UsuarioDAO usuarioDAO = new UsuarioDAO();

    /**
     * Registra um novo usuário no sistema.
     * 
     * @param usuario Nome de usuário
     * @param senha Senha do usuário
     * @return true se o registro for bem-sucedido, false caso contrário
     */
        public boolean validarLogin(String usuario, String senha) {
        return usuarioDAO.validarLogin(usuario, senha);
    }
    }

    /**
     * Valida o login de um usuário verificando as credenciais.
     * 
     * @param usuario Nome de usuário
     * @param senha Senha do usuário
     * @return true se o login for válido, false caso contrário
     */
    public boolean validarLogin(String usuario, String senha) {
        return usuarioDAO.validarLogin(usuario, senha);
    }
}
