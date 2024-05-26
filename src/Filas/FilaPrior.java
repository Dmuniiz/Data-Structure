package Filas;

public class FilaPrior {

	FilaChar f1, f2, f3;

	public FilaPrior() {
		f1 = new FilaChar(5);
		f2 = new FilaChar(5);
		f3 = new FilaChar(5);
	}

	public void insert(char elem, int prior) {
		if (prior == 1) {
			if(f1.isempty()) {
				f1.store(elem);
			}else {
				f1.store(elem);
			}
		} else {
			throw new IllegalArgumentException("Prioridade inválida: " + prior);
		}

		/*
		 * switch(prior) { case 1: f1.store(elem); case 2: f2.store(elem); case 3:
		 * f3.store(elem); }
		 */

	}

	public void delete() {
		if (f1.isempty() && f2.isempty() && f3.isempty()) {
			System.out.println("Todas as filas estão vazias");
		} else if (!f1.isempty()) {
			f1.retrieve();
		} else if(!f2.isempty()) {
			f2.retrieve();
		}else if(!f3.isempty()) {
			f3.retrieve();
		}
	}

}
