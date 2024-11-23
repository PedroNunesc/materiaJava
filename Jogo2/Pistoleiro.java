/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Jogo2;

/**
 *
 * @author PEDROHENRIQUENUNESCA
 */
public class Pistoleiro implements Personagem{
    @Override
    public int Dano(){
         int dano = Dados.numeroAleatorio() + Dados.numeroAleatorio();
        return dano;
    }

    @Override
    public int Vida() {
         int vida = Dados.numeroAleatorio();
        return vida;
    }

    @Override
    public int Mana() {
         int mana = Dados.numeroAleatorio() + Dados.numeroAleatorio() + Dados.numeroAleatorio();
        return mana;
    }

    @Override
    public int Agilidade() {
       int agilidade = Dados.numeroAleatorio() + Dados.numeroAleatorio() + Dados.numeroAleatorio() + Dados.numeroAleatorio();
        return agilidade;
    }
    
    @Override    
    public String Atirar(){
    String mensagem1P = "Você atirou no seu inimigo! ";
    return mensagem1P;
    }

    @Override    
    public String LancarGranada(){
    String mensagem2P = "Você lançou uma granada no seu inimigo! ";
    return mensagem2P;
    }

    @Override    
     public String UsarBandagem(){
    String mensagem3P = "Você usou uma bandagem! ";
    return mensagem3P;
    }

    @Override   
    public String Fugir(){
    String mensagem4P = "Você está tentando fugir! ";
    return mensagem4P;
    }
}