package Pilhas;

public class PilhaChar {

	private int tamanho;
	private int topo;
	private char vet[];

	public PilhaChar(int tamanho) {
		// TODO Auto-generated constructor stub
		this.tamanho = tamanho;
		vet = new char[tamanho];
		topo = -1;

	}

	public boolean isfull() {
		if (topo == tamanho - 1) {
			return true;
		} else {
			return false;
		}
	}

	public boolean isempty() {
		if (topo == -1) {
			return true;
		} else {
			return false;
		}
	}

	public void push(char elem) {
		if (isfull()) {
			System.out.println("Stack Overflow!");
			System.exit(1);
		} else {
			vet[++topo] = elem;
		}
	}

	public char pop() {
		if (isempty()) {
			System.out.println("Underflow!");
			return vet[topo];
		}
		return vet[topo--];
		/*indice => char*/
	}

	public char top() {
		if (isempty()) {
			System.out.println("Underflow!");
			System.exit(1);
			return vet[topo];
		}
		return vet[topo];
	}

	public void destroy() {
		topo = -1;
	}

	public boolean verificaPalindromo(String palavra) {
		for(int i = 0; i < tamanho; i++) {
			if(palavra.charAt(i) != pop()/*invertendo*/) {
				return false;
			}
		}
		return true;
	}
	
	public void inversor(String frase) {
		for(int i = 0; i < tamanho; i++) {
			System.out.print(pop());
		}
	}

	public void exibir() {
		for (int i = tamanho - 1; i >= topo; i--) {
			if (this.vet[i] == 0) {
				System.out.print("StackChar - 0[~void~]");
			}
			System.out.println(this.vet[i]);
		}
	}

}
