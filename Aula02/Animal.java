/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Aula02;

/**
 *
 * @author PEDROHENRIQUENUNESCA
 */
public class Animal {
    private String raça;
    private int idade;
    private double peso;
    
     public Animal(String raça, int idade, double peso) {
        this.raça = raça;
        this.idade = idade;
        this.peso = peso;
     }   
         public void apresentar2 () {
        System.out.println("Esse animal é um " + raça + ", ele tem " + idade + " anos e pesa " + peso + "kilos.");
     
}
}
