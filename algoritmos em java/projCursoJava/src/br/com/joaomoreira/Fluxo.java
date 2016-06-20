/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.joaomoreira;

import java.util.Scanner;

/**
 * Aula 7 - Estrutura de decisao
 *
 * @author joao
 */
public class Fluxo {

    public static void main(String[] args) {
        String nome;
        int idade;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite o seu nome:");
        nome = teclado.nextLine();
        System.out.println("Digite a sua idade:");
        idade = teclado.nextInt();
        System.out.println("Nome: " + nome + "idade: " + idade);
        if(idade < 18){
            System.out.println("Menor de idade");
        }else{
            System.out.println("Maior de idade");
               
        //}estrutura para if aninhado
        //if(idade < 18){
        //    System.out.println("Menor de idade");
        
        }
    }
}
