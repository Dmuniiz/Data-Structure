package Vetor;

import java.util.Random;
import java.util.Scanner;

public class TesteVetorDinamico {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Random gerador = new Random();
		VetorDinamico v = new VetorDinamico(4);
		
		
		v.adicionar(1);
		v.adicionar(2);
		v.exibir();
		
		v.adicionar(3);
		v.adicionar(4);
		v.remover();
		v.exibir();
		
		v.adicionar(5);
		v.exibir();
		
	}
	
}
