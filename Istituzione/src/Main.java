import Persone.*;
import Eccezioni.*;
import java.util.*;

public class Main {

	public static void main(String[] args) throws EccezioneCellulare {
		
		//TODO: aggiungere qualche eccezione
		//TODO: mettere lista persona in file di testo
		
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
			//USCITA
			case 0: go = false;
					break;
			//DIPENDENTE
			case 1: System.out.print("\nDipendente o Volontario? [1]/[2]: ");
					byte sc2 = input.nextByte();
					switch(sc2) {
					case 1: System.out.print("Impiegato o Giornaliero? [1]/[2]: ");
							byte sc3 = input.nextByte();
							switch(sc3) {
							//IMPIEGATO
							case 1: boolean test1 = true;
									System.out.print("\nNome: ");
									input.nextLine(); //TODO: capire perchè serve
									String nom1 = input.nextLine().toUpperCase(); //evito problemi di ricerca
									System.out.print("Indirizzo: "); 
									String ind1 = input.nextLine().toUpperCase();
									String tel1 = null;
									//ECCEZIONE
									while(test1) {
										System.out.print("Cellulare: ");
										tel1 = input.next();
										try {
											if(tel1.length() != 10)
												throw new EccezioneCellulare();
											else test1 = false;
										} catch(EccezioneCellulare e) {
											input.nextLine(); //annullo input
											System.out.println("\nInserire numero valido!");
										}
									}
									System.out.print("Codice fiscale: ");
									String cod1 = input.next().toUpperCase();
									System.out.print("Paga base: ");
									double pb1 = input.nextDouble();
									System.out.print("Bonus: ");
									double bon = input.nextDouble();
									Impiegato p1 = new Impiegato(nom1,ind1,tel1,cod1,pb1,bon);
									lista.add(p1);
									break;
							//GIORNALIERO
							case 2: boolean test2 = true;
									System.out.print("\nNome: ");
									input.nextLine();
									String nom2 = input.nextLine().toUpperCase();
									System.out.print("Indirizzo: "); 
									String ind2 = input.nextLine().toUpperCase();
									String tel2 = null;
									//ECCEZIONE
									while(test2) {
										System.out.print("Cellulare: ");
										tel2 = input.next();
										try {
											if(tel2.length() != 10)
												throw new EccezioneCellulare();
											else test2 = false;;
										} catch(EccezioneCellulare e) {
											input.nextLine(); //annullo input
											System.out.println("\nInserire numero valido!");
										}
									}
									System.out.print("Codice fiscale: ");
									String cod2 = input.next().toUpperCase();
									System.out.print("Paga base: ");
									double pb2 = input.nextDouble();
									System.out.print("Bonus: ");
									int gio = input.nextInt();
									Giornaliero p2 = new Giornaliero(nom2,ind2,tel2,cod2,pb2,gio);
									lista.add(p2);
									break;
							}
							break;
					//VOLONTARIO
					case 2: boolean test3 = true;
						    System.out.print("\nNome: ");
							input.nextLine();
							String nom3 = input.nextLine().toUpperCase();
							System.out.print("Indirizzo: ");
							String ind3 = input.nextLine().toUpperCase();
							String tel3 = null;
							//ECCEZIONE
							while(test3) {
								System.out.print("Cellulare: ");
								tel3 = input.next();
								try {
									if(tel3.length() != 10)
										throw new EccezioneCellulare();
									else test3 = false;;
								} catch(EccezioneCellulare e) {
									input.nextLine(); //annullo input
									System.out.println("\nInserire numero valido!");
								}
							}
							Volontario p3 = new Volontario(nom3,ind3,tel3);
							lista.add(p3);
							break;		
					}
					break;
			//PAGA		
			case 2: System.out.print("\nInserisci ID: ");
					int id = input.nextInt();
					for(Personale p : lista) {
						if(p.getID() == id) {
							System.out.println("\nPaga del dipendente #" + id + " = $" + p.calcolaPaga());
						}
						else System.out.println("\nNessuna persona associata a questo ID!");
					}
				    break;
			//LISTA 
			case 3: if(lista.isEmpty())
						System.out.println("\nNessuna persona in lista!");
					else {
						for(Personale p : lista) {
							System.out.println(p);
						}
					}
					break;
			}
		}
		System.out.println("\nArrivederci!");
		input.close();
	}
}