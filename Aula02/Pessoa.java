/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Aula02;

/**
 *
 * @author PEDROHENRIQUENUNESCA
 */
public class Pessoa { 
    private String nome;
    private int idade;
    
    // construtor
    public Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
        }
    
    public void apresentar () {
        System.out.println("Olá meu nome é " + nome + " e tenho " + idade + " anos. ");
    }      
         }
