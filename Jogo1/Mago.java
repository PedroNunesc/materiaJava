/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Jogo1;

/**
 *
 * @author PEDROHENRIQUENUNESCA
 */
class Mago extends Personagem {
    public Mago(String nome) {
        super(nome, 80, 25);
    }

    public void lançarFeitico(Personagem oponente) {
        oponente.Vida -= this.Ataque ;
        System.out.println(this.Nome + " atacou " + oponente.Nome + " e causou " + (this.Ataque ) + " de dano.");
    }
}
