/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jogo.da.forca;

/**
 *
 * @author monar
 */
public class Principal {
    public static void main(String[] args) {
        Jogo jogo = new Jogo("onomatopeia");
        while(jogo.qtasLetrasAindaNaoAdivinhadas() > 0) {
            jogo.pergunta();
        }
    }
}
