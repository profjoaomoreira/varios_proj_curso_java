/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.joaomoreira;

import java.util.Scanner;

/**
 * Aula 8 Calculo da media
 *
 * @author joao
 */
public class CalculoMedia {

    public static void main(String[] args) {
        double nota1, nota2, media;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite a nota1: ");
        nota1 = teclado.nextDouble();
        System.out.println("Digite a nota2: ");
        nota2 = teclado.nextDouble();
        media = (nota1 + nota2) / 2;
        System.out.println("Resultado: " + media);
        if (media <= 2) {
            System.out.println("Aluno Reprovado");
            
        } else if ((media > 2) && (media < 6)) {
            System.out.println("Aluno em exame");

        } else {
            System.out.println("Aluno Aprovado");
        }
    }

        // as linhas abaixo usa else e if
        // if (media < 6) {
        // System.out.println("Aluno Reprovado");
        // } else {
        // System.out.println("Aluno Aprovado");
        // }
}