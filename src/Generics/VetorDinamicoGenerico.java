package Generics;

import java.util.ArrayList;

public class VetorDinamicoGenerico<T> {

	private ArrayList<T> vetor; /* redimensionável */

	public VetorDinamicoGenerico() {
		// Inicializa o vetor vazio
		vetor = new ArrayList<>();
	}

	public void adicionarElemento(T elemento) {
		vetor.add(elemento);
	}

	public T obterElemento(int indice) {
		return vetor.get(indice);
	}
	
	public int tamanho() {
		return vetor.size();
	}

	
	public static void main(String[] args) {
		VetorDinamicoGenerico<String> v1 = new VetorDinamicoGenerico<>();
		
		v1.adicionarElemento("Davy");
		System.out.println(v1.tamanho());
		System.out.println(v1.obterElemento(0));
		v1.adicionarElemento("Muniz");
		System.out.println(v1.tamanho());
	
	}

}
