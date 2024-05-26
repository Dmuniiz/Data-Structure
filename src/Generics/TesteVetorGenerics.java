package Generics;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class TesteVetorGenerics {

	public static void main(String[] args) {

		// VetorDinamicoGenerico <Musica> musicas = new VetorDinamicoGenerico<>();
		ArrayList<Musica> playlist = new ArrayList<>();
		Scanner sc = new Scanner(System.in);
		
		int opcao;
		do {
			System.out.println("0 - Sair\n1 - Inserir música\n2 - Avaliar música\n3 - Ver lista de música ordenada ");
			opcao = sc.nextInt();
			switch (opcao) {
			case 1:
				System.out.println("Qual é o nome da música?");
				String musicaInserir = sc.next();
				sc.nextLine();
				
				playlist.add(new Musica(musicaInserir));
				System.out.println("Música armazenada com sucesso");
				break;
			case 2:
				System.out.println("Qual música deseja avaliar?");
				String musicaAvaliar = sc.next();
				sc.nextLine();
				
				System.out.println("Qual a nota?");
				int nota = sc.nextInt();
				
				for(int i = 0; i < playlist.size(); i++) {
					if(playlist.get(i).getTitulo().equals(musicaAvaliar)) {
						playlist.get(i).setAvaliacao(nota);
					}
				}
				
				break;
			case 3:
				Collections.sort(playlist, Collections.reverseOrder()); /*sort = organizar*/
				System.out.println(playlist);
				break;
			case 0:
				System.out.println("Até mais");
				break;
			default:
				System.out.println("Opção inválida");
			}

		} while (opcao != 0);
		
		sc.close();

	}

}
