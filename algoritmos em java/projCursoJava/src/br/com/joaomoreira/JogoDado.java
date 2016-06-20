/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.joaomoreira;

import java.util.Scanner;

/**
 * Aula 10 - Jogo do Dado
 *
 * @author joao
 */
public class JogoDado {

    public static void main(String[] args) {
        char opcao ='s';
                
        Scanner teclado = new Scanner(System.in);
        while (opcao == 's'){
            System.out.println("Lancamento do DADO.........");
            int dado = (int) (Math.random()*9999+1);
            System.out.println("Face: " + dado);
            System.out.println("Deseja lançar o dado novamente(S/n)?");
            opcao=teclado.next().charAt(0);
        }
    }
}
