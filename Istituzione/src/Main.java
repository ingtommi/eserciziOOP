import Persone.*;
import java.util.*;

public class Main {

	public static void main(String[] args) {
		
		//TODO: aggiungere qualche eccezione
		
		Scanner input = new Scanner(System.in);	
		Vector<Personale> lista = new Vector<Personale>();
		//MENU
		System.out.println("***** BENVENUTO UTENTE *****");
		boolean go = true;
		while(go) {
			System.out.println();
			System.out.println("0) Esci");
			System.out.println("1) Inserisci persona");
			System.out.println("2) Calcola paga");
			System.out.println("3) Lista persone");
			System.out.print("\nSeleziona opzione: ");
			byte sc1 = input.nextByte();
			switch(sc1) {
			case 0: go = false;
					break;
			case 1: System.out.print("\nDipendente o Volontario? [1]/[2]: ");
					byte sc2 = input.nextByte();
					switch(sc2) {
					case 1: System.out.print("\nImpiegato o Giornaliero? [1]/[2]: ");
							byte sc3 = input.nextByte();
							switch(sc3) {
							case 1: System.out.print("\nNome: "); //IMPIEGATO
									input.nextLine(); //TODO: capire perchè serve
									String nom1 = input.nextLine();
									System.out.print("Indirizzo: "); 
									String ind1 = input.nextLine();
									System.out.print("Telefono: ");
									String tel1 = input.next();
									System.out.print("Codice fiscale: ");
									String cod1 = input.next();
									System.out.print("Paga base: ");
									double pb1 = input.nextDouble();
									System.out.print("Bonus: ");
									double bon = input.nextDouble();
									Impiegato p1 = new Impiegato(nom1,ind1,tel1,cod1,pb1,bon);
									lista.add(p1);
									break;
							case 2: System.out.print("\nNome: "); //GIORNALIERO
									input.nextLine();
									String nom2 = input.nextLine();
									System.out.print("Indirizzo: "); 
									String ind2 = input.nextLine();
									System.out.print("Telefono: ");
									String tel2 = input.next();
									System.out.print("Codice fiscale: ");
									String cod2 = input.next();
									System.out.print("Paga base: ");
									double pb2 = input.nextDouble();
									System.out.print("Bonus: ");
									int gio = input.nextInt();
									Giornaliero p2 = new Giornaliero(nom2,ind2,tel2,cod2,pb2,gio);
									lista.add(p2);
									break;
							}
							break;
					case 2: System.out.print("\nNome: "); //VOLONTARIO
							input.nextLine();
							String nom3 = input.nextLine();
							System.out.print("Indirizzo: ");
							String ind3 = input.nextLine();
							System.out.print("Telefono: ");
							String tel3 = input.next();
							Volontario p3 = new Volontario(nom3,ind3,tel3);
							lista.add(p3);
							break;		
					}
					break;
			case 2: System.out.print("\nInserisci ID: "); //PAGA
					int id = input.nextInt();
					for(Personale p : lista) {
						if(p.getID() == id) {
							System.out.println("\nPaga del dipendente #" + id + " = $" + p.calcolaPaga());
						}
						else System.out.println("\nNessuna persona associata a questo ID!");
					}
				    break;
			case 3: for(Personale p : lista) { //STAMPA LISTA
					System.out.println();
					System.out.println(p);
					}
					break;
			}
		}
		System.out.println("\nArrivederci!");
	}
}