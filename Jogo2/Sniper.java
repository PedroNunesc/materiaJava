/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.Jogo2;

/**
 *
 * @author Usuario
 */
public class Sniper implements Personagem{
    @Override
    public int Dano(){
        int dano = Dados.numeroAleatorio() + Dados.numeroAleatorio() + Dados.numeroAleatorio() + Dados.numeroAleatorio();
        return dano;
    }

    @Override
    public int Vida() {
        int vida = Dados.numeroAleatorio() + Dados.numeroAleatorio();
        return vida;
    }

    @Override
    public int Mana() {
         int vida = Dados.numeroAleatorio();
        return vida;
    }

    @Override
    public int Agilidade() {
         int agilidade = Dados.numeroAleatorio() + Dados.numeroAleatorio() + Dados.numeroAleatorio();
        return agilidade;
    }
    
    @Override    
    public String Atirar(){
    String mensagem1S = "Você atirou no seu inimigo! ";
    return mensagem1S;
    }

    @Override    
    public String LancarGranada(){
    String mensagem2S = "Você lançou uma granada no seu inimigo! ";
    return mensagem2S;
    }

    @Override    
     public String UsarBandagem(){
    String mensagem3S = "Você usou uma bandagem! ";
    return mensagem3S;
    }

    @Override   
    public String Fugir(){
    String mensagem4S = "Você está tentando fugir! ";
    return mensagem4S;
    }
}