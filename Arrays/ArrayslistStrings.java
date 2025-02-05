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
public class ArrayslistStrings {
     public static void main(String[] args) {
        ArrayList<String> stringsa = new ArrayList<>(); // Criar um ArrayList
        
// para modificar este array list para string coloque stringe no lugar do intreger

        // Adicionar elementos

        stringsa.add("a");
        stringsa.add("b");
        stringsa.add("a");
        
        System.out.println(stringsa);
        stringsa.remove("a"); // remove o primeiro com esste nome
        
        System.out.println(stringsa);
        
        System.out.println(stringsa.get(0));// Retorna o elemento na posição especificada.
        System.out.println(stringsa.indexOf("b")); //Retorna o índice da primeira ocorrência de um elemento ou -1 se não estiver presente.
        System.out.println(stringsa.lastIndexOf("a")); // Retorna o índice da última ocorrência de um elemento ou -1 se não estiver presente.
        System.out.println(stringsa.set(1, "c")); // Substitui o elemento na posição especificada.
        System.out.println(stringsa.size()); // Retorna o número de elementos na lista.
        System.out.println(stringsa.contains("a")); // Verifica se um elemento está na lista.
     }
}
