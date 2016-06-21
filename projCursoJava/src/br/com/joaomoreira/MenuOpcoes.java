/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.joaomoreira;
import java.util.Scanner;

/**
 *Aula11 - Estrutura Switch Case e Funcoes
 * 
 * @author joao
 */
public class MenuOpcoes {
    
    public static void main(String[] args) {
        int opcao;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Sistemas");
        System.out.println("1- Windows");
        System.out.println("2- Linux");
        System.out.println("Digite a opcao desejada");
        opcao=teclado.nextInt();
        //a estrutura abaixo ela permite a escolha de uma opcao e eh semelhante ao if else.
       switch(opcao){
            case 1:
                windows();
                break;
            case 2:
                linux();
                break;
            default:
                System.out.println("opcao invalida");
                break;
        }
    }
    public static void windows(){
        System.out.println("Carregando o sistema windows");
        System.out.println("..................................");       }
    public static void linux(){
        System.out.println("Carregando o sistema linux");
        System.out.println("..................................");  
    }
}