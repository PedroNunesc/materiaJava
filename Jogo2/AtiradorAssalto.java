/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Jogo2;

/**
 *
 * @author PEDROHENRIQUENUNESCA
 */
public class AtiradorAssalto implements Personagem{
    @Override
    public int Dano(){
         int dano = Dados.numeroAleatorio();
        return dano;
    }

    @Override
    public int Vida() {
         int vida = Dados.numeroAleatorio() + Dados.numeroAleatorio() + Dados.numeroAleatorio();
        return vida;
    }

    @Override
    public int Mana() {
         int mana = Dados.numeroAleatorio() + Dados.numeroAleatorio() + Dados.numeroAleatorio() + Dados.numeroAleatorio();
        return mana;
    }

    @Override
    public int Agilidade() {
         int agilidade = Dados.numeroAleatorio() + Dados.numeroAleatorio();
        return agilidade;
    }
    
    @Override    
    public String Atirar(){
    String mensagem1AT = "Você atirou no seu inimigo! ";
    return mensagem1AT;
    }

    @Override    
    public String LancarGranada(){
    String mensagem2AT = "Você lançou uma granada no seu inimigo! ";
    return mensagem2AT;
    }

    @Override    
     public String UsarBandagem(){
    String mensagem3AT = "Você usou uma bandagem! ";
    return mensagem3AT;
    }

    @Override   
    public String Fugir(){
    String mensagem4AT = "Você está tentando fugir! ";
    return mensagem4AT;
    }
}