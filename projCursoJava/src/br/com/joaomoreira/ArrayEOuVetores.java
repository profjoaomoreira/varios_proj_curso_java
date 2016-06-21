/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.joaomoreira;

/**
 *
 * Criando um array simples
 */
public class ArrayEOuVetores {
    public static void main(String[] args) {
        //a linha abaixo cria e inicializa um array simples
        String[] times = {"gremio", "inter", "juventude", "Zequinha"};
        //a linha abaixo recupera o conteudo de um array
        //a recuperacao eh feita pelo indice
        //[0][1][2][3][4]
        System.out.println(times[0]);
    //a linha abaixo exibe o taamanho total do array
        System.out.println(times.length);
        //a linha abaixo modifica uma posicao de array
        times[0]="sao paulo";
        System.out.println(times[0]);
    
    }
    
}
