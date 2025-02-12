/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TrabalhoArray2;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author PEDROHENRIQUENUNESCA
 */
public class Box {
    // ArrayList que representa a mochila
    private static ArrayList<Pokemon> mochila = new ArrayList<>();
    // ArrayList que representa a box
    private static ArrayList<Pokemon> box = new ArrayList<>();
    // Inicializa o scanner
    private static Scanner scanner = new Scanner(System.in);
    
     public static void main(String[] args) {
        box.add(new Pokemon("Boulbassar", "Grass, Poison", 9));
     }

    void add(Pokemon pokemon) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
