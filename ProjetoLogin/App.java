/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package ProjetoLogin;

import java.sql.Connection;

public class App {
    public static void main(String[] args) {
        ConexaoTabelaUsuarios conexaoSQLite = new ConexaoTabelaUsuarios();
        Connection conexao = conexaoSQLite.conectar();
        
        // Criar tabela
       CriarTabela ct = new CriarTabela();
       ct.criarTabelaUsuarios(conexao);
       
       InserirUsuario.inserirUsuario(conexao, "Leo", "Senha" );
       
      
       
       
    }
        
        
}