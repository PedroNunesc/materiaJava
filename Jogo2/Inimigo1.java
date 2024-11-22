/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Jogo2;

/**
 *
 * @author PEDROHENRIQUENUNESCA
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
    public String Atirar(){
    return null;
    }

    @Override    
    public String LancarGranada(){
    return null;
    }

    @Override    
     public String UsarBandagem(){
    return null;
    }

    @Override   
    public String Fugir(){
    return null;
    }
    
}
