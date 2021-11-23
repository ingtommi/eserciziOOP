import GestioneRegistro.*;

import java.util.Scanner;


public class GestioneRegistroEta {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println("Inserisci il nome del file di registro:");
		String file = input.nextLine();
		System.out.println();
		
		RegistroEtaCompleto registro = new RegistroEtaCompleto(file);
		
		
		// TODO : Menu con le varie operazioni da effettuare

	}

}
