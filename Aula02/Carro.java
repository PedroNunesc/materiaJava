/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Aula02;

/**
 *
 * @author PEDROHENRIQUENUNESCA
 */
public class Carro {
    private String nome;
    private int ano;
    private String marca;

    public Carro(String nome, int ano, String marca) {
        this.nome = nome;
        this.ano = ano;
        this.marca = marca;
    }

 public void apresentar1 () {
        System.out.println("O modelo desse carro é o " + nome + ", ele foi lançado em " + ano + " e é da marca " + marca + ".");
 }
}