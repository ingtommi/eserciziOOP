
//Gestione terminali banca, si accede con username e pwd

import java.util.Scanner;

public class gestioneTerminale {

	private gestioneUtenti[] utenti;
	
	private ContoCorrente conto = new ContoCorrente("f",2000);
	
	//variabili che servono per i vari cicli
	boolean avanti1 = true, avanti2 = true;
	
	//costruttore
	public gestioneTerminale(gestioneUtenti[] ut) {
		
		utenti = ut;
	}
	public void login() {  
		
		Scanner input = new Scanner(System.in);
		while(avanti1) {		
			//MENU'
			System.out.println("\n***** BENVENUTO UTENTE *****");
			System.out.println("\n0) Chiudi terminale");
			System.out.println("1) Login");
			System.out.print("\nSeleziona operazione: ");
			int scelta1 = input.nextInt();
			switch(scelta1) {
			case 0: avanti1 = false; //esco dal while
			        break;
			case 1: //LOGIN
				    avanti2 = true; //serve affinchè un utente possa entrare nel while successivo dopo che quello prima ha scelto "Torna indietro"
					System.out.print("\nInserisci username: ");
					String user = input.next();
					System.out.print("Inserisci password: ");
					String pwd = input.next();
					//controllo credenziali di accesso
					boolean trovato = false;
					for(int i=0; i<utenti.length && trovato == false; i++) {
						if(utenti[i].controlla(user,pwd))
							trovato = true;
					}
					if(!trovato) {
						System.out.println("\nSpiacenti, credenziali errate!");
						System.out.print("\nVuoi riprovare? S/N: ");
						String scelta2 = input.next();
						switch(scelta2) {
						case "N": avanti1 = false;
						          break;
						case "S": break;
						}
					}
					else {
						while(avanti2) {
							//OPERAZIONI
							System.out.println("\n***** OPERAZIONI POSSIBILI *****");
							System.out.println("\n0) Torna indietro");
							System.out.println("1) Versamento");
							System.out.println("2) Prelievo");
							System.out.println("3) Visualizza saldo");
							System.out.println("4) Visualizza numero conto");
							System.out.print("\nSeleziona operazione: ");
							int scelta3 = input.nextInt();
							switch(scelta3) {
							case 0: avanti2 = false; //esco dal while
								    break;
							case 1: System.out.print("\nInserisci somma da versare: ");
						           	double ver = input.nextDouble();
						           	conto.versa(ver);
						           	break;
							case 2: System.out.print("\nInserisci somma da prelevare: ");
						   		   	double pre = input.nextDouble();
						   		   	if(!conto.preleva(pre))
						   		   		System.out.println("\nSpiacenti, saldo non sufficiente!");
						   		   	break;
							case 3: System.out.println("\nSaldo: " + conto.getSaldo());
						   		   	break;
							case 4: System.out.println("\nNumero conto: " + conto.getNumero());
						           	break;
							}
					   }
			       }
		   }
	     }
		System.out.println("\nGrazie, a presto!");
    }
}	