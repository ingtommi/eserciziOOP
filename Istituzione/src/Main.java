import Persone.*;
import Eccezioni.*;
import java.util.*;
import java.io.*;

public class Main {

	public static void main(String[] args) throws EccezioneCellulare, EccezioneCodice, 
													EccezionePagaNegativa, EccezioneGiorniNegativi, IOException {
		
		//TODO: mettere lista persona in file di testo
		
		Scanner input = new Scanner(System.in);	
		File file = new File();
		Vector<Personale> lista = new Vector<Personale>();
		
		//MENU
		System.out.println("***** BENVENUTO UTENTE *****");
		System.out.print("\nInserire password: ");
		int pwd = input.nextInt();
		if(!file.login(pwd))
			System.out.println("\nPASSWORD NON PRESENTE NEL DATABASE!");
		else {
			boolean go = true;
			while(go) {
				System.out.println();
				System.out.println("0) Esci");
				System.out.println("1) Inserisci persona");
				System.out.println("2) Calcola paga");
				System.out.println("3) Lista persone");
				System.out.println("4) Trascrivi su file");
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
								case 1: boolean testTel1 = true;
										boolean testCod1 = true;
										boolean testPb1 = true;
										System.out.print("\nNome: ");
										input.nextLine(); //TODO: capire perchè serve
										String nom1 = input.nextLine().toUpperCase(); //evito problemi di ricerca
										System.out.print("Indirizzo: "); 
										String ind1 = input.nextLine().toUpperCase();
										String tel1 = null;
										//ECCEZIONE CELLULARE
										while(testTel1) {
											System.out.print("Cellulare: ");
											tel1 = input.next();
											try {
												if(tel1.length() != 10)
													throw new EccezioneCellulare();
												else testTel1 = false;
											} catch(EccezioneCellulare e) {
												input.nextLine(); //annullo input
												System.out.println("\nInserire numero valido!");
											}
										}
										String cod1 = null;
										//ECCEZIONE CODICE
										while(testCod1) {
											System.out.print("Codice fiscale: ");
											cod1 = input.next().toUpperCase();
											try {
												if(cod1.length() != 16)
													throw new EccezioneCodice();
												else testCod1 = false;;
											} catch(EccezioneCodice e) {
												input.nextLine(); //annullo input
												System.out.println("\nInserire codice valido!");
											}
										}
										double pb1 = 0;
										//ECCEZIONE PAGA
										while(testPb1) {
											System.out.print("Paga base: ");
											pb1 = input.nextDouble();
											try {
												if(pb1<0)
													throw new EccezionePagaNegativa();
												else testPb1 = false;;
											} catch(EccezionePagaNegativa e) {
												input.nextLine(); //annullo input
												System.out.println("\nInserire codice valido!");
											}
										}
										System.out.print("Bonus: ");
										double bon = input.nextDouble();
										Impiegato p1 = new Impiegato(nom1,ind1,tel1,cod1,pb1,bon);
										lista.add(p1);
										break;
								//GIORNALIERO
								case 2: boolean testTel2 = true;
										boolean testCod2 = true;
										boolean testPb2 = true;
										boolean testGio = true;
										System.out.print("\nNome: ");
										input.nextLine();
										String nom2 = input.nextLine().toUpperCase();
										System.out.print("Indirizzo: "); 
										String ind2 = input.nextLine().toUpperCase();
										String tel2 = null;
										//ECCEZIONE CELLULARE
										while(testTel2) {
											System.out.print("Cellulare: ");
											tel2 = input.next();
											try {
												if(tel2.length() != 10)
													throw new EccezioneCellulare();
												else testTel2 = false;;
											} catch(EccezioneCellulare e) {
												input.nextLine(); //annullo input
												System.out.println("\nInserire numero valido!");
											}
										}
										String cod2 = null;
										//ECCEZIONE CODICE
										while(testCod2) {
											System.out.print("Codice fiscale: ");
											cod1 = input.next().toUpperCase();
											try {
												if(cod1.length() != 16)
													throw new EccezioneCodice();
												else testCod2 = false;;
											} catch(EccezioneCodice e) {
												input.nextLine(); //annullo input
												System.out.println("\nInserire codice valido!");
											}
										}
										double pb2 = 0;
										//ECCEZIONE PAGA
										while(testPb2) {
											System.out.print("Paga base: ");
											pb2 = input.nextDouble();
											try {
												if(pb2<0)
													throw new EccezionePagaNegativa();
												else testPb2 = false;;
											} catch(EccezionePagaNegativa e) {
												input.nextLine(); //annullo input
												System.out.println("\nInserire codice valido!");
											}
										}
										int gio = 0;
										//ECCEZIONE GIORNI
										while(testGio) {
											System.out.print("Giorni lavorativi: ");
											gio = input.nextInt();
											try {
												if(gio<0)
													throw new EccezioneGiorniNegativi();
												else testGio = false;
											} catch(EccezioneGiorniNegativi e) {
												input.nextLine(); //annullo input
												System.out.println("\nInserire giorni validi!");
											}
										}
										Giornaliero p2 = new Giornaliero(nom2,ind2,tel2,cod2,pb2,gio);
										lista.add(p2);
										break;
								}
								break;
						//VOLONTARIO
						case 2: boolean testTel3 = true;
							    System.out.print("\nNome: ");
								input.nextLine();
								String nom3 = input.nextLine().toUpperCase();
								System.out.print("Indirizzo: ");
								String ind3 = input.nextLine().toUpperCase();
								String tel3 = null;
								//ECCEZIONE CELLULARE
								while(testTel3) {
									System.out.print("Cellulare: ");
									tel3 = input.next();
									try {
										if(tel3.length() != 10)
											throw new EccezioneCellulare();
										else testTel3 = false;;
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
							if(p.getID()==id) {
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
				//SCRITTURA FILE
				case 4: if(file.WriteFile(lista))
							System.out.println("\nOperazione effettuata correttamente!");
						break;
				}
			}
		}
		System.out.println("\nARRIVEDERCI!");
		input.close();
	}
}