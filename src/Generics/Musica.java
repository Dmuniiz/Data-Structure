package Generics;

import java.util.Collections;
import java.util.List;

/*implementando Comparable(interface) - compareTo */

/* implements = implementar funcionalidades 
 * 
 * Uma interface é um conjunto de métodos que uma classe deve implementar. Ela define um contrato para as classes que a implementam, 
 * especificando quais métodos devem ser definidos, mas não como eles devem ser implementados. 
 * 
 * 
 *  As interfaces permitem que você defina um conjunto de operações que várias classes podem cumprir, independentemente de sua hierarquia de herança.*/

public class Musica /*implements Comparable<Musica>*/ {

	private String titulo;
	private int avaliacao;

	public Musica(String titulo) {
		this.titulo = titulo;
	}

	public void setAvaliacao(int avaliacao) {
		this.avaliacao = avaliacao;
	}

	public String getTitulo() {
		return titulo;
	}

	/*@Override
	public int compareTo(Musica o) { comparando objetos
		if (this.avaliacao < o.avaliacao)
			return -1;
		if (this.avaliacao > o.avaliacao)
			return 1;
		return 0;
	}*/
	
	@Override
	 public String toString() {
	 return String.format("Título: %s, Nota: %d\n", this.titulo, this.avaliacao);
	}
}