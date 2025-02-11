/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package jogo.da.forca;

import java.util.Scanner;


public class Jogo {
    private String palavra;
    private int comprimento;
    private boolean[] corretas;
    private boolean[] letrasUtilizadas;
    
    
    public Jogo(String palavra) {
        this.palavra = palavra;
        comprimento = palavra.length();
        corretas = new boolean[comprimento];
        letrasUtilizadas = new boolean[26];
    }
    
    private void mostraAdvinhadas() {
        System.out.print("Advinhado até agora:");
        for (int i = 0; i < comprimento; i++) {
            if (corretas[i]) {
                System.out.print(palavra.charAt(i));
            } else {
                System.out.print("_ ");
            }
        }
        System.out.println("");
    }
    
    private void mostraUtilizadas(){
        System.out.print("Letras já utilizadas: ");
        for (int i = 0; i < 26; i++) {
            if (letrasUtilizadas[i]) {
                System.out.print((char) ('a' + i) + " ");
            }
        }
        System.out.println("");
    }
    
    public int qtasLetrasAindaNaoAdivinhadas(){
        int quantidade = 0;
        for (int i = 0; i < comprimento; i++) {
            if (!corretas[i]) {
                quantidade++;
            }
        }
        return quantidade;
    }
    
    public void pergunta(){
        mostraAdvinhadas();
        mostraUtilizadas();
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Insira uma letra: ");
        char letra = sc.nextLine().toLowerCase().charAt(0);
        letrasUtilizadas[letra - 'a'] = true;
        
        for (int i = 0; i < comprimento; i++) {
            if (palavra.charAt(i) == letra) {
                corretas[i] = true;
            }
        } 
    }
}
