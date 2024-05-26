package Vetor;

public class VetorDinamico {

	private int[] elementos;
	private int quantidadeElem;
	private int capacidade;
	
	public VetorDinamico(int capacidade) {
		this.capacidade = capacidade;
		this.elementos = new int[this.capacidade];
	}
	
	public boolean estaCheio() {
		if(this.quantidadeElem == this.capacidade)
			return true;
		else
			return false;
	}
	
	public boolean estaVazio() {
		return this.quantidadeElem == 0;
	}
	
	/*arraycopy =>> src(origem), srcIndex(indice), dest(destino), destIndex(indice da origem), len(tamanho)*/
	
	/* Aumentar ou Reduzir Coleção MANUAL */
	private void aumentarCapacidade() {
		int auxAumentar[] = new int [this.capacidade * 2];	
		 System.arraycopy(this.elementos, 0, auxAumentar, 0, this.elementos.length);
		 
		 this.elementos = auxAumentar;
		 this.capacidade *= 2;
	}
	
	private void diminuirCapacidade() {
		int auxDiminuir[] = new int[this.capacidade / 2];	
		System.arraycopy(this.elementos, 0, auxDiminuir, 0, this.elementos.length);
		
		this.elementos = auxDiminuir;
		this.capacidade = this.capacidade / 2;
	}
	
	/*private void redimensionar(double valor) {  redimensionando ao igualar os arrays 
		int[] aux = new int[(int)(this.capacidade * valor)];
		for(int i = 0; i < this.quantidadeElem; i++) {
			aux[i] = this.elementos[i];
		}
		this.elementos = aux;
		this.capacidade = (int)(this.capacidade * valor);
		
	}*/
	
	public void adicionar(int elemento) {
		if(estaCheio()) {
			this.aumentarCapacidade();
		}
		this.elementos[this.quantidadeElem] = elemento;
		this.quantidadeElem++;
	}
	
	public void remover() {
		if(!estaVazio()) {
			this.quantidadeElem--;
			/*condição para remover*/
			if(this.capacidade > 4  && this.quantidadeElem <= this.capacidade/4) {
				this.diminuirCapacidade();
			}
	}
		
		/*if(!estaVazio()) {
			this.quantidadeElem--;
			if(this.capacidade > 4 && this.quantidadeElem <= this.capacidade/4) {
				redimensionar(0.5);
			}
		}*/
	}
	
	public void exibir() {
		for(int i = 0; i < this.quantidadeElem;i++) {
			System.out.print(this.elementos[i] + " ");
		}
		System.out.printf("Qtde: %d, Cap: %d\n", this.quantidadeElem, this.capacidade);
	}
	
	
}
