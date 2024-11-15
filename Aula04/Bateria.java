/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AULA4;

/**
 *
 * @author PEDROHENRIQUENUNESCA
 */
public class Bateria  implements instrumentos{
    @Override
    public void tocar(){
        System.out.println("Pá-tchá, bum-bum, pá-tchá-tchá, pá, bum, pá!");
    }
    
    @Override
    public void afinar(){
        System.out.println("Bateria está sendo afinada!");
    }
}
