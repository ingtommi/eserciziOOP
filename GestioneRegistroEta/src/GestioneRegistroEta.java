import GestioneRegistro.*;
import java.util.Scanner;


public class GestioneRegistroEta {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.print("Inserisci il nome del file di registro: ");
		String file = input.nextLine();
		
		RegistroEtaCompleto registro = new RegistroEtaCompleto(file);
		
		
		// TODO: Menu con le varie operazioni da effettuare
		// 1) RegistroEtaCompleto.viewRegistro
		// 2) RegistroEtaCompleto.addStudente
		// 3) NomeEta.incrementaEta
		// 4) salvare dati su file
		// 5) Esci --> controllare RegistroEtaCompleto.modificato per avvertire se si è usciti senza salvare
	}
}