package Pilhas.Exercicios.Exerc1;

import java.util.Scanner;

import Pilhas.PilhaChar;

public class Exerc2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Digite uma frase: ");
		String frase = sc.nextLine();

		PilhaChar p = new PilhaChar(frase.length());

		//inserindo dados(char) na pilha
		char aux;
		 for (int i = 0; i < frase.length(); i++) {
			 aux = frase.charAt(i);
			 p.push(aux);
		 }	
	
		p.inversor(frase);
		 
	}


}
