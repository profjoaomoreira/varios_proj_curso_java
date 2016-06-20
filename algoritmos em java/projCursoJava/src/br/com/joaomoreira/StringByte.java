/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.joaomoreira;

/* Curso pratico de java SE
* Aula 04 - Variaveis
* Professor Joao Moreira
*/
public	class StringByte{
	public static void main (String [] args){
	//a linha abaixo cria e atribui um valor a variavel
	String nome	= "Joao";
	String sobrenome = "Moreira";
	System.out.println(sobrenome);
	System.out.println(nome);
	//int idade = 46;, vou usar o byte para mostrar economia de memoria
	//byte pode assumir o valor maximo de 127 depois estoura a capacidade
	byte idade = 126;
	System.out.println("Idade: " + idade);
	//usa-se o + para concatenar os textos na hora de imprimir
	System.out.println("Nome: " + nome + " " + sobrenome +", Idade: " +idade);
	
	
	}
}