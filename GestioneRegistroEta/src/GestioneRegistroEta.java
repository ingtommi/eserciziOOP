import GestioneRegistro.*;

import java.util.Scanner;


public class GestioneRegistroEta {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.print("Inserisci il nome del file di registro: ");
		String file = input.nextLine();

		RegistroEtaCompleto registro = new RegistroEtaCompleto(file);

		//MENU
		System.out.println("***** BENVENUTO UTENTE *****");
		System.out.println("0) Visualizza registro");
		System.out.println("1) Aggiugni elemento");
		System.out.println("2) Incrementa età");
		System.out.println("3) Salva dati");
		System.out.println("4) Esci");
		System.out.print("\nSeleziona opzione: ");
		byte s = input.nextByte();

		switch(s) {
		case 0 : registro.viewRegistro();
		         break;
		case 1 : System.out.println("Inserisci nome:");
		         String nome = input.nextLine();
		         System.out.println("Inserisci eta':");
		         int eta = input.nextInt();
			     registro.addStudente(nome, eta) ;
			     break;
		case 2 : System.out.println("Inserisci nome:");
		         String name = input.nextLine();
		         int ris = registro.incrementaEta(name);
		         if (ris==0)
			     System.out.println("Nominativo non trovato");
		         else
			     System.out.println("La nuova età è " + ris);
		         break;	     
		case 3 : registro.salva();
		         break;
		case 4 : // 5) Esci --> controllare RegistroEtaCompleto.modificato per avvertire se si Ã¨ usciti senza salvare

                 }
}
}