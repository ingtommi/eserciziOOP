//CODICE CHE PERMETTE LA GESTIONE DI UN REGISTRO STUDENTI CON SERIALIZZAZIONE OGGETTI SU FILE .DAT

import GestioneRegistro.*;
import java.util.Scanner;

public class GestioneRegistroEta {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		RegistroEtaCompleto registro;
		boolean go = true;

		System.out.println("***** BENVENUTO UTENTE *****");

		//NOME FILE: test --> test.dat
		do {
			System.out.print("\nInserisci il nome del file di registro (<nome>.dat): ");
			String file = input.nextLine();
			registro = new RegistroEtaCompleto(file);
		} while(!registro.getFileOk());
		
		//MENU
		while(go) {
			System.out.println("\n*** MENU' ***\n");
			System.out.println("0) Visualizza registro");
			System.out.println("1) Aggiungi elemento");
			System.out.println("2) Incrementa età");
			System.out.println("3) Salva dati");
			System.out.println("4) Esci");
			System.out.print("\nSeleziona opzione: ");
			byte s1 = input.nextByte();
			switch(s1) {
			case 0 : registro.viewRegistro();
			         break;
			case 1 : System.out.print("\nInserisci nome: ");
					 input.nextLine();
			         String nome1 = input.nextLine().toUpperCase();
			         System.out.print("Inserisci eta': ");
			         int eta = input.nextInt();
				     registro.addStudente(nome1,eta);
				     break;
			case 2 : System.out.print("\nInserisci nome: ");
					 input.nextLine();
			         String nome2 = input.nextLine().toUpperCase();
			         registro.incrementaEta(nome2);
			         break;	     
			case 3 : registro.salva();
			         break;
			case 4 : if(registro.getSalvato()) {
						go = false;
						break;
					 } else {
						 System.out.print("\nFILE NON AGGIORNATO: VUOI SALVARE PRIMA DI USCIRE? [Y]/[N]: ");
						 String s2 = input.next();
						 switch(s2) {
						 case "Y": registro.salva();
						 		   go = false;
						 		   break;
						 case "N": go = false;
						 		   break;
						 }
					 }
	        }
		}
		System.out.println("\nA presto!");
	}
}