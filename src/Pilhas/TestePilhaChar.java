package Pilhas;

public class TestePilhaChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		PilhaChar p1 = new PilhaChar(5);
		
		System.out.println("verificando status inicial da pilha...");
		System.out.println("está vazia? "+ p1.isempty());
		System.out.println("está cheia? "+ p1.isfull() + "\n");
		
		
		System.out.println("Inserindo char A");
		p1.push('A');	
		
		
		System.out.println("Verificando status da pilha: ");
		System.out.println("está vazia? "+ p1.isempty());
		System.out.println("está cheia? "+ p1.isfull() + "\n");
		
		System.out.println("Inlcuindo char B");
		p1.push('B');	
		
		System.out.println("Inlcuindo char C \n");
		p1.push('C');	
		
		System.out.println("Dois pops em sequencia\n ");
		p1.pop();
		p1.pop();
		
		System.out.println("Elemento que está no topo: " + p1.top());
		
		System.out.println("\nExibindo Pilha: " );
		p1.exibir();
		
		System.out.println("\nDestrunindo Pilha, método destroy");
		p1.destroy();
		
	}

}
