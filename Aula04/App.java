/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package AULA4;

public class App {
    public static void main(String[] args){
        Violao meuViolao = new Violao();
        Piano meuPiano = new Piano();
        Bateria meuBateria = new Bateria();
        
        meuViolao.tocar();
        meuViolao.afinar();
        
        meuPiano.tocar();
        meuPiano.afinar();
        
        meuBateria.tocar();
        meuBateria.afinar();
    }
}
