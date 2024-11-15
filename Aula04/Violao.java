/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AULA4;

/**
 *
 * @author PEDROHENRIQUENUNESCA
 */
public class Violao implements instrumentos{
    @Override
    public void tocar(){
        System.out.println("Bléin blein bleeeeein");
    }
    
    @Override
    public void afinar(){
        System.out.println("Violão está sendo afinado!");
    }
}


