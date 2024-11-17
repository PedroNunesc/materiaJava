/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.Jogo1;

/**
 *
 * @author marco
 */
public class Inimigo1 implements Personagem{
    @Override
    public int Dano(){
    int danoInimigo1 = 20;
    return danoInimigo1;
    }
    
    @Override
    public int Vida(){
    int VidaInimigo1 = 20;
    return VidaInimigo1;
    }
    
    @Override
    public int Mana(){
    int ManaInimigo1 = 20;
    return ManaInimigo1;
    }
    
    @Override
    public int Agilidade(){
    int AgilidadeInimigo1 = 20;
    return AgilidadeInimigo1;
    }
    
    @Override    
    public int Atirar(){
    return 0;
    }

    @Override    
    public int LancarGranada(){
    return 0;
    }

    @Override    
    public int UsarBandagem(){
    return 0;
    }

    @Override    
    public int Fugir(){
    return 0;
    }
    
}
