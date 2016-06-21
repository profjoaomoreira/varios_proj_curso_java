//a linha abaixo importa a classe Scanner
import java.util.Scanner;

public class Aula5{
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