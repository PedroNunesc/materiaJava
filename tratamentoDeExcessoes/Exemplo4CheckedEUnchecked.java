/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tratamentoDeExcessoes;

import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author PEDROHENRIQUENUNESCA
 */
public class Exemplo4CheckedEUnchecked {

    public static void main(String[] args) {
        // Exemplo Checked(precisa ser tradado):
        int[] numeros = {1, 2, 3};

        // Aqui, tentamos acessar um índice que não existe no array, causando uma ArrayIndexOutOfBoundsException
        System.out.println(numeros[5]);  // Lança ArrayIndexOutOfBoundsException

        //////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        
        // Exemplo Checked(que precisa ser tratado):
        try {
            // O código abaixo pode lançar uma IOException, então precisa ser tratado
            FileReader arquivo = new FileReader("arquivo.txt");
        } catch (IOException e) {
            System.out.println("Erro ao tentar abrir o arquivo: " + e.getMessage());
        }
    }
}
