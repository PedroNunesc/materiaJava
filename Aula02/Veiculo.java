/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Aula02;

/**
 *
 * @author PEDROHENRIQUENUNESCA
 */
public class Veiculo {
    private String marca; // Nome da variável alterado para seguir convenções

    public Veiculo(String marca) {
        this.marca = marca; // Atribuição correta da variável
    }

    // Método exibirMarca definido fora do construtor
    public void exibirMarca() {
        System.out.println("Marca do veículo: " + marca + ".");
    }
}

