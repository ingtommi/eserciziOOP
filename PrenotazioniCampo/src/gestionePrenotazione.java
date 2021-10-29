import java.util.Scanner;

public class gestionePrenotazione {

	public static void main(String[] args) {
		
		Campo c = new Campo();
		Scanner input = new Scanner(System.in);
		
		System.out.println("***** BENVENUTO UTENTE *****");
		boolean avanti = true;
		while(avanti) {
			System.out.println("\n0) Esci");
			System.out.println("1) Nuova prenotazione");
			System.out.println("2) Cancella prenotazione");
			System.out.println("3) Lista prenotazoni");
			System.out.print("\nSeleziona operazione: ");
			byte scelta = input.nextByte();
			switch(scelta) {
			case 1: c.addPrenotazione();
				    break;
			case 2: if(c.removePrenotazione())
		        		System.out.println("\nPrenotazione cancellata con successo!");
	        		else
	        			System.out.println("\nPrenotazione non trovata!");
				    break;
			case 3: c.printLista();
				    break;
			case 0: avanti = false;
				    break;
		    
		  }
		}
		System.out.println("\nArrivederci!");
	}
}