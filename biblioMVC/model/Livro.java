/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package biblioMVC.model;

/**
 *
 * @author PEDROHENRIQUENUNESCA
 */
public class Livro {

    // Atributos para as informações do livro
    private int id; // id do livro
    private String titulo; // titulo do livro
    private String autor; // autor do livro
    private int ano; // ano do livro

    public Livro(String titulo, String autor, int ano) {
        this.titulo = titulo;
        this.autor = autor;
        this.ano = ano;
    }

// Método para acessar o id do livro
    public int getId() {
        return id;
    }

// Método para inserir o id do livro
    public void setId(int id) {
        this.id = id;
    }

// Método para acessar o título do livro
    public String getTitulo() {
        return titulo;
    }

// Método para inserir o título do livro
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

// Método para acessar o autor do livro
    public String getAutor() {
        return autor;
    }

// Método para inserir o autor do livro
    public void setAutor(String autor) {
        this.autor = autor;
    }

// Método para acessar o ano do livro
    public int getAno() {
        return ano;
    }

// Método para inserir o ano do livro
    public void setAno(int ano) {
        this.ano = ano;
    }
}
