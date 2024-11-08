/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Aula3;

/**
 *
 * @author PEDROHENRIQUENUNESCA
 */
public class Gato1 extends Animal1 {
     public String comidaFav;

    public Gato1(String nome, int Idade, boolean Docil, String comidaFav) {
        super(nome, Idade, Docil);
        this.comidaFav = comidaFav;
    }
    
     @Override
    public void emitirSom() {
        System.out.println("O gato " + nome + " miou!");
    }
    
    public void comer(){
        System.out.println("O gato " + nome + " está comendo " + comidaFav + ".");
    }

     @Override
    public void exibirAnimal() {
        System.out.println("O nome desse animal é " + nome + ", tem " + Idade + " anos de idade, ele é docil? " + Docil + ", e sua comida favorita é " +comidaFav + ".");
    }
}

