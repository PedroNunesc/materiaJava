/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.Jogo2;

/**
 *
 * @author Usuario
 */
public class Espingardeiro implements Personagem{

                   
    @Override
    public int Dano(){
        int dano = Dados.numeroAleatorio() + Dados.numeroAleatorio() + Dados.numeroAleatorio();
        return dano;
    }

    @Override
    public int Vida() {
       int vida = Dados.numeroAleatorio() + Dados.numeroAleatorio() + Dados.numeroAleatorio() + Dados.numeroAleatorio();
        return vida;
    }

    @Override
    public int Mana() {
       int mana = Dados.numeroAleatorio() + Dados.numeroAleatorio();
        return mana;
    }

    @Override
    public int Agilidade() {
        int agilidade = Dados.numeroAleatorio();
        return agilidade;
    }

    @Override    
    public String Atirar(){
    String mensagem1E = "Você atirou no seu inimigo! ";
    return mensagem1E;
    }

    @Override    
    public String LancarGranada(){
    String mensagem2E = "Você lançou uma granada no seu inimigo! ";
    return mensagem2E;
    }

    @Override    
     public String UsarBandagem(){
    String mensagem3E = "Você usou uma bandagem! ";
    return mensagem3E;
    }

    @Override   
    public String Fugir(){
    String mensagem4E = "Você está tentando fugir! ";
    return mensagem4E;
    }
}