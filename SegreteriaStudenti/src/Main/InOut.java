package Main;

import java.util.*;

import Esami.*;
import Persone.*;
import Corsi.*;

public class InOut {

	boolean avanti1 = true;
	Scanner input = new Scanner(System.in);
	Test test = new Test();
	
	//costruttore
	public InOut() {}
    
	//TODO: tornare indietro nei sottomenù dopo una scelta
	//TODO: verificare se corretto utilizzare metodi ausiliari
	//TODO: implementare output errore quando non modifica piano per finestra chiusa o sforo
	
	public void azioni() {
		System.out.println("\n***** BENVENUTO UTENTE *****\n");
		while(avanti1) {
			System.out.println();
			System.out.println("0) Esci");
			System.out.println("1) Admin");
			System.out.println("2) Studente");
			System.out.print("\nSeleziona: ");
			byte scelta1 = input.nextByte();
			System.out.println();
			switch(scelta1) {
			case 0: avanti1 = false;
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
					System.out.println();
					switch(scelta2) {
					case 0: avanti1 = false;
							break;
					case 1: System.out.println("1) Corso triennale");
							System.out.println("2) Corso magistrale");
							System.out.println("3) Corso a ciclo unico");
							System.out.print("\nSeleziona: ");
							byte scelta4 = input.nextByte();
							System.out.println();
							switch(scelta4) {
							case 1: triennale().enrollStudente(studente()); //utilizzo metodi ausiliari per evitare di scrivere sempre stesso codice di input
									break;
							case 2: magistrale().enrollStudente(studente());
									break;
							case 3: unico().enrollStudente(studente());	
									break;
							}
							break;
					case 2: System.out.println("1) Cerca per cognome");
							System.out.println("2) Cerca per matricola");
							System.out.print("\nSeleziona: ");
							byte scelta5 = input.nextByte();
							System.out.println();
							switch(scelta5) {
							case 1: System.out.print("Inserisci cognome studente: ");
									String cognome = input.next();
									if(corso().findStudente(cognome))
										System.out.println("\nStudente presente!");
									else System.out.println("\nStudente non presente!");
									break;
							case 2: System.out.print("Inserisci matricola studente: ");
									int matricola = input.nextInt();
									if(corso().findStudente(matricola))
										System.out.println("\nStudente presente!");
									else System.out.println("\nStudente non presente!");
									break;
							}
							break;
					case 3: corso().viewIscritti();
							break;
					case 4: corso().viewLaureati();
							break;
					case 5: admin().openPiano();
							break;
					case 6: admin().closePiano();
							break;
					case 7: studente().viewPiano();
							break;
					case 8: studente().addEsame(esame());
							break;
					case 9: studente().removeEsame(esame());
							break;
					case 10:System.out.println("1) Cerca per nome");
							System.out.println("2) Cerca per ID");
							System.out.print("\nSeleziona: ");
							byte scelta6 = input.nextByte();
							System.out.println();
							switch(scelta6) {
							case 1: if(studente().findEsame(nomeEsame()))
										System.out.println("\nEsame presente!");
									else System.out.println("\nEsame non presente!");
									break;
							case 2: if(studente().findEsame(idEsame()))
										System.out.println("\nEsame presente!");
									else System.out.println("\nEsame non presente!");
									break;
							}
							break;
					case 11:System.out.println("1) Esame di profitto");
							System.out.println("2) Esame di idoneità");
							System.out.print("\nSeleziona: ");
							byte scelta7 = input.nextByte();
							System.out.println();
							switch(scelta7) {
							case 1: studente().insertEsito(profitto(),voto());
									break;
							case 2: studente().insertEsito(ido(),voto());
									break;
							}
							break;
					case 12:studente().viewLibretto();
							break;
					}
					break;
			case 2: System.out.println("0) Esci");
					System.out.println("1) Visualizza piano di studio");
					System.out.println("2) Aggiungi esame al piano di studio");
					System.out.println("3) Rimuovi esame dal piano di studio");
					System.out.println("4) Visualizza libretto");
					System.out.print("\nSeleziona: ");
					byte scelta3 = input.nextByte();
					System.out.println();
					switch(scelta3) {
					case 0: avanti1 = false;
							break;
					case 1: studente().viewPiano();
							break;
					case 2: studente().addEsame(esame());
							break;
					case 3: studente().removeEsame(esame());
							break;
					case 4: studente().viewLibretto();
							break;
					}
			}
		}
		System.out.println("\nArrivederci!");
	}
	
	//metodi ausiliari per semplificare codice switch-case
	private Studente studente() {
		System.out.print("Inserisci nome studente: ");
		String nome = input.next();
		System.out.print("Inserisci cognome studente: ");
		String cognome = input.next();
		Studente studente = new Studente(nome,cognome);
		return studente;
	}
	
	private Amministratore admin() {
		System.out.print("Inserisci nome admin: ");
		String nome = input.next();
		System.out.print("Inserisci cognome admin: ");
		String cognome = input.next();
		Amministratore admin = new Amministratore(nome,cognome);
		return admin;
	}
	
	private Esame esame() {
		System.out.print("Inserisci nome esame: ");
		String nome = input.next();
		System.out.print("Inserisci numero crediti: ");
		int cfu = input.nextInt();
		Esame esame = new Esame(nome,cfu);
		return esame;
	}
	
	private Profitto profitto() {
		System.out.print("Inserisci nome esame: ");
		String nome = input.next();
		System.out.print("Inserisci numero crediti: ");
		int cfu = input.nextInt();
		Profitto profitto = new Profitto(nome,cfu);
		return profitto;
	}
	
	private Idoneita ido() {
		System.out.print("Inserisci nome esame: ");
		String nome = input.next();
		System.out.print("Inserisci numero crediti: ");
		int cfu = input.nextInt();
		Idoneita ido = new Idoneita(nome,cfu);
		return ido;
	}
	
	private CorsoTriennale triennale() {
		System.out.print("Inserisci nome corso: ");
		String nome = input.next();
		CorsoTriennale triennale = new CorsoTriennale(nome);
		return triennale;
	}
	
	private CorsoMagistrale magistrale() {
		System.out.print("Inserisci nome corso: ");
		String nome = input.next();
		CorsoMagistrale magistrale = new CorsoMagistrale(nome);
		return magistrale;
	}
	
	private CorsoUnico unico() {
		System.out.print("Inserisci nome corso: ");
		String nome = input.next();
		CorsoUnico unico = new CorsoUnico(nome);
		return unico;
	}
	
	private CorsoLaurea corso() {
		System.out.print("Inserisci nome corso: ");
		String nome = input.next();
		CorsoLaurea corso = new CorsoLaurea(nome);
		return corso;
	}
	
	private int voto() {
		System.out.print("Inserisci voto esame: ");
		int voto = input.nextInt();
		return voto;
	}
	
	private String nomeEsame() {
		System.out.print("Inserisci nome esame: ");
		String nome = input.next();
		return nome;
	}
	
	private int idEsame() {
		System.out.print("Inserisci ID esame: ");
		int id = input.nextInt();
		return id;
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
}