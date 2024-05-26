package Pilhas.Exercicios.Exerc1;

import java.util.Scanner;

import Pilhas.PilhaChar;

public class Exerc1 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Informe a palavra que desejar: ");
		String palavra = sc.next();

		PilhaChar p = new PilhaChar(palavra.length());

		//inserindo dados(char) na pilha
		char aux;
		 for (int i = 0; i < palavra.length(); i++) {
			 aux = palavra.charAt(i);
			 p.push(aux);
		 }	
	
		 System.out.println(p.verificaPalindromo(palavra));
		 
	}


}
