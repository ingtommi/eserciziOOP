//CODICE CHE PERMETTE DI GESTIRE CREDITO TELEFONICO E REGISTRO CHIAMATE

import java.util.Scanner;

public class gestioneCellulare {

	public static void main(String[] args) {
		
		boolean avanti = true;
		Scanner input = new Scanner(System.in);
		
		System.out.println("***** GESTIONE CELLULARE *****");
		System.out.print("\nInserire importo ricarica iniziale: ");
		double caricaIniziale = input.nextDouble();
		Cellulare cell = new Cellulare(caricaIniziale);
		while(avanti) {
			System.out.println("\n*** MENU' ***\n");
			System.out.println("0) Esci");
			System.out.println("1) Ricarica");
			System.out.println("2) Chiama");
			System.out.println("3) Credito residuo");
			System.out.println("4) Numero chiamate effettuate");
			System.out.println("5) Azzera numero chiamate");
			System.out.print("\nSeleziona operazione: ");
			byte scelta = input.nextByte();
			switch(scelta) {
			case 0: avanti = false;
					break;
			case 1: System.out.print("\nInserire importo ricarica: ");
					double carica = input.nextDouble();
					cell.ricarica(carica);
					break;
			case 2: System.out.print("\nInserire minuti chiamata: ");
					int minuti = input.nextInt();
					cell.chiama(minuti);
					break;
			case 3: System.out.println("\nCredito residuo: " + cell.numero404() + " euro");
					break;
			case 4: System.out.println("\nNumero chiamate effettuate: " + cell.getNumeroChiamate());
					break;
			case 5: cell.azzeraChiamate();
			}
		}
		System.out.println("\nGrazie e arrivederci!");
	}
}