/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Jogo1;

/**
 *
 * @author PEDROHENRIQUENUNESCA
 */
public class Personagem {
    public String Nome;
    public int Vida;
    public int Ataque;
    
    public Personagem(String Nome, int Vida, int Ataque){
        this.Nome = Nome;
        this.Vida = Vida;
        this.Ataque = Ataque;
    }
    
    public void Atacar(Personagem oponente){
        oponente.Vida -= this.Ataque;
        System.out.println(Nome + " atacou o " + oponente.Nome + " e causou " + this.Ataque + " de dano.");
    }
    
    public boolean estaVivo() {
        return Vida > 0;
    }
    
}
