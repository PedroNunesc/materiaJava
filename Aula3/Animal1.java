/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Aula3;

/**
 *
 * @author PEDROHENRIQUENUNESCA
 */
public class Animal1 {
    public String nome;
     public int Idade;
     public boolean Docil;

    public Animal1(String nome, int Idade, boolean Docil) {
        this.nome = nome;
        this.Idade = Idade;
        this.Docil = Docil;
}
    
     public void emitirSom() {
        System.out.println("O animal faz um som.");
    }
    
    public void exibirAnimal() {
        System.out.println("O nome desse animal é " + nome + ", tem " + Idade + " de idade, ele é docil? " + Docil + ".");
    }
}

