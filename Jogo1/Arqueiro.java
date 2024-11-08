/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Jogo1;

/**
 *
 * @author PEDROHENRIQUENUNESCA
 */
class Arqueiro extends Personagem {
    public Arqueiro(String nome) {
        super(nome, 90, 20);
    }

    public void atirarFlecha(Personagem oponente) {
        oponente.Vida -= this.Ataque;
        System.out.println(this.Nome + " atacou " + oponente.Nome + " e causou " + this.Ataque + " de dano.");
    }
}

