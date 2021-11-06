package Main;

import java.util.*;

import Esami.*;
import Persone.Studente;

public class InOut {

	boolean avanti = true;
	Scanner input = new Scanner(System.in);
	//TODO: controllare se generale oppure no
	Test test = new Test();
	
	public InOut() {}
    
	//TODO: completare menù input
	public void azioni() {
		System.out.println("\n***** BENVENUTO UTENTE *****\n");
		while(avanti) {
			System.out.println("0) Esci");
			System.out.println("1) Admin");
			System.out.println("2) Studente");
			System.out.print("\nSeleziona: ");
			byte scelta1 = input.nextByte();
			switch(scelta1) {
			case 0: avanti = false;
					break;
			case 1: System.out.println("0) Esci");
					System.out.println("1) Iscrivi studente al corso");
					System.out.println("2) Cerca studente nel corso");
					System.out.println("3) Visualizza iscritti al corso");
					System.out.println("4) Visalizza laureati del corso");
					System.out.println("5) Apri finestra di modifica piano di studio");
					System.out.println("6) Chiudi finestra di modifica piano di studio");
					System.out.println("7) Visualizza piano di studio");
					System.out.println("8) Aggiungi esame al piano di studio");
					System.out.println("9) Rimuovi esame dal piano di studio");
					System.out.println("10) Cerca esame nel piano di studio");
					System.out.println("11) Inserisci esito esame");
					System.out.println("12) Visualizza libretto");
					System.out.print("\nSeleziona: ");
					byte scelta2 = input.nextByte();
					switch(scelta2) {
					case 0: avanti = false;
							break;
					case 1: 
							break;
					case 2:
							break;
					case 3:
							break;
					case 4:
							break;
					case 5:
							break;
					case 6:
							break;
					case 7:
							break;
					case 8:
							break;
					case 9:
							break;
					case 10:
							break;
					case 11:
							break;
					case 12:
							break;
					}
			case 2: System.out.println("0) Esci");
					System.out.println("1) Visalizza piano di studio");
					System.out.println("2) Aggiungi esame al piano di studio");
					System.out.println("3) Rimuovi esame dal piano di studio");
					System.out.println("4) Visualizza libretto");
					System.out.print("\nSeleziona: ");
					byte scelta3 = input.nextByte();
					switch(scelta3) {
					case 0: avanti = false;
							break;
					case 1:
							break;
					case 2:
							break;
					case 3:
							break;
					case 4:
							break;
					}
			}
		}
		System.out.println("\nArrivederci!");
	}
	
	//OUTPUT piano di studi
	public void viewPiano(ArrayList<Esame> pianoStudio, int matricola) {
		System.out.println("\n***** PIANO DI STUDI DELLA MATRICOLA #" + matricola + " *****\n");
		if(pianoStudio.isEmpty())
			System.out.println("Nessun esame ancora inserito!");
		else
			for(Esame esame : pianoStudio) {
				System.out.println("Insegnamento: " + esame.getNome() + " | Crediti: " + esame.getCrediti());
		}
	}
	
	//OUTPUT libretto
	public void viewLibretto(ArrayList<Esame> pianoStudio, int matricola, int crediti, float media) {
		int superati = 0;
		System.out.println("\n***** LIBRETTO DELLA MATRICOLA #" + matricola + " *****\n");
		for(Esame esame : pianoStudio) {
			if(esame.isSuperato()) {
				superati++;
				System.out.println("Insegnamento: " + esame.getNome() + " | Crediti: " + esame.getCrediti() 
				+ " | Voto: " + esame.getVoto());
			}
		}
		if(superati == 0)
			System.out.println("Nessun esame ancora superato!");
		else
			System.out.println("\nCrediti totali: " + crediti + " | Media: " + media);
	}
	
	//OUTPUT iscritti
	public void viewIscritti(ArrayList<Studente> listaStudenti, String nome) {
		System.out.println("\n***** STUDENTI ISCRITTI A: " + nome + " *****\n");
		if(listaStudenti.isEmpty())
			System.out.println("Nessuno studente iscritto!");
		else 
			for(Studente studente : listaStudenti) {
				System.out.println("Studente: " + studente.getNome() + " " + studente.getCognome()
				+ " | Matricola #" + studente.getMatricola());
		}
	}
	
	//OUTPUT laureati
	public void viewLaureati(ArrayList<Studente> listaStudenti, String nome) {
		int laureati = 0;
		System.out.println("\n***** STUDENTI LAUREATI IN: " + nome + " *****\n");
		for(Studente studente : listaStudenti) {
			if(test.isLaureato(studente)) {
				laureati++;
				System.out.println("Studente: " + studente.getNome() + " " + studente.getCognome()
				+ " | Matricola #" +  studente.getMatricola());
			}
		}
		if(laureati == 0)
			System.out.println("Nessuno studente ancora laureato!");
	}
	
	//TODO: implementare output errore quando non modifica piano per finestra chiusa o sforo
}