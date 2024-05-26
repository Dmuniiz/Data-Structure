package Filas;

public class FilaChar  {

	private int size, front, rear;
	private char vet[];
	
	public FilaChar() {
		// TODO Auto-generated constructor stub
		size = 5;
		vet = new char[size];
		front = 0;
		rear = 0;
	}
	
	public FilaChar(int n ) {
		size = n;
		vet = new char[size];
		front = 0;
		rear = 0;
	}
	
	protected void increaseCapacity() {
		char auxIncrease[] = new char [this.size * 2];	
		 System.arraycopy(this.vet, 0, auxIncrease, 0, this.vet.length);
		 
		 this.vet = auxIncrease;
		 this.size *= 2;
	}
	
	protected int next(int n) {
		if(n == size - 1) {
			return 0;
		}else {
			return n+1;
			//return (n+1)%size
		}
	}
	
	protected boolean isfull() {
		if(next(rear) == front) { // fila cheia
			return true;
		}
		return false;
	}
	
	protected boolean isempty() {
		if(rear == front) {
			return true;
		}
		return false;
	}
	
	protected void store(char elem) {
		//store = "abastecimento"/adicionar
		if(isfull()) {
			System.out.println("Overflow");
			
		} else {
			vet[rear] = elem;
			rear = next(rear);
		}
	}
	
	protected char retrieve() {//recuperar
		if(isempty()) {
			System.out.println("Underflow");
			
		}
		char aux = vet[front];
		front = next(front);
		return aux;
	}
	
	protected void destroy() {
		front = rear;
	}
	
	public void exibir() {
		for(int i = 0; i < vet.length; i++) {
			System.out.print("["+this.vet[i]+"]");
		}
	}
	
}
