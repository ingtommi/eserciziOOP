import java.util.Scanner;

public class gestionePrenotazione {

	public static void main(String[] args) {
		
		Campo c = new Campo();
		
		System.out.println("***** BENVENUTO UTENTE *****");
		boolean avanti = true;
		while(avanti) {
			System.out.println("\n0) Nuova prenotazione");
			System.out.println("1) Cancella prenotazione");
			System.out.println("2) Lista prenotazioni");
			System.out.println("3) Esci");
			System.out.print("\nSeleziona operazione: ");
			Scanner input = new Scanner(System.in);
			byte scelta = input.nextByte();
			switch(scelta) {
			case 0: if(c.addPrenotazione())
				        System.out.println("\nPrenotazione effettuata con successo!");
			        else
			        	System.out.println("\nCampo occupato!");
				    break;
			case 1: if(c.removePrenotazione())
		        		System.out.println("\nPrenotazione cancellata con successo!");
	        		else
	        			System.out.println("\nPrenotazione non trovata!");
				    break;
			case 2: c.printLista();
				    break;
			case 3: avanti = false;
				    break;
		    
		  }
		}
		System.out.println("\nArrivederci!");
	}
}