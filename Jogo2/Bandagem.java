/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Jogo2;
/**
 *
 * @author PEDROHENRIQUENUNESCA
 */
public class Bandagem {
      int QuantidadeBandagem = 2;
     static int VidaBandagem = 15;
            
            public int CurarBandagem() {
    QuantidadeBandagem = QuantidadeBandagem - 1; 
    return QuantidadeBandagem;
}
}