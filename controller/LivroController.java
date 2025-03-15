/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package biblioMVC.controller;
import biblioMVC.model.LivroDAO;
import biblioMVC.model.Livro;
/**
 *
 * @author PEDROHENRIQUENUNESCA
 */
public class LivroController {
    private LivroDAO livroDAO;
    
    public LivroController(){
    this.livroDAO = new LivroDAO();
    }
    
    public String adicionarLivro(String titulo, String autor, String anoTexto){
try {
int ano = Integer.parseInt(anoTexto);
Livro livro = new Livro(titulo, autor, ano);
livroDAO.adicionarLivro(livro);
return "";
} catch (NumberFormatException e){
return "Erro:" + e.getMessage();
}
}
    }

