/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.joaomoreira;

//a linha abaixo importa a classe Scanner
import java.util.Scanner;

public class ClasseScanner{
	public static void main(String[] args){
	String nome;
	int idade;
	//a linha abaixo cria o objeto teclado que sera
	//utilizado pela classe Scanner
	Scanner teclado = new Scanner (System.in);
	System.out.println("Digite o seu nome: ");
	//a linha abaixo captura o que foi digitado e armazena
	//na variavel nome`
	nome = teclado.nextLine();
	System.out.println("Digite sua idade: ");
	idade = teclado.nextInt();
	System.out.println("Nome: " + nome);
	System.out.println("Idade:" + idade);
	}
}