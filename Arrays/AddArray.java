/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Arrays;
import java.util.ArrayList;

/**
 *
 * @author PEDROHENRIQUENUNESCA
 */
public class AddArray {
    public static void main(String[] args) {
        ArrayList<Integer> numeros = new ArrayList<>(); // Criar um ArrayList
        
// para modificar este array list para string coloque stringe no lugar do intreger

        // Adicionar elementos
        numeros.add(1);
        numeros.add(2);
        numeros.add(3);
        numeros.add(4);
        
        numeros.add(1, 8);
// com dois parametros voce indica o indice a onde voce quer adicionar
// e automaticamente todos os numeros que tem o indice maior seram adicionados 1 no indice 
// o numero que tem o indice 1 vai pro indice 2 e assim por diante

// Imprimir o ArrayList
        System.out.println(numeros);
        
        numeros.remove(2);
// remove de acordo com o indice (se colocar 2 vai remover o terceiro pq tem o indice 0
        System.out.println(numeros);
        
        System.out.println(numeros.isEmpty());
// Retorna true se a lista estiver vazia.

        numeros.clear();
        
        numeros.add(9);
        System.out.println(numeros);
    }
}
