/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.joaomoreira;

import java.util.Scanner;

/**
 * Curso de Java aula 9 - estrutura de repetição
 *
 * @author joao
 */
public class Tabuada1 {

    public static void main(String[] args) {
        int valor;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite o valor da tabuada");
        valor = teclado.nextInt();
        for (int i = 0; i < 10; i++) {
            System.out.println(valor + " X " + i +" = " +(valor*i));
        }

    }

}
