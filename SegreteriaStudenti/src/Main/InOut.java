package Main;

import java.util.*;
import Persone.Studente;

public class InOut {

	private ArrayList<Esame> pianoStudio;
	private ArrayList<Studente> listaStudenti;
	private int creditiAcquisiti;
	private float mediaAritmetica;
	private int matricola;
	private String nomeCorso;
	
	//costruttore1
	public InOut(ArrayList<Esame> pianoStudio, int matricola, int creditiAcquisiti, float mediaAritmetica) {
		this.pianoStudio = pianoStudio;
		this.matricola = matricola;
		this.creditiAcquisiti = creditiAcquisiti;
		this.mediaAritmetica = mediaAritmetica;
	}
	
	//costruttore2
	public InOut(ArrayList<Studente> listaStudenti, String nomeCorso) {
		this.listaStudenti = listaStudenti;
		this.nomeCorso = nomeCorso;
	}
    
	//OUTPUT piano di studi
	public void viewPiano() {
		System.out.println("\n***** PIANO DI STUDI DELLA MATRICOLA #" + this.matricola + " *****\n");
		if(pianoStudio.isEmpty())
			System.out.println("Nessun esame ancora inserito!");
		else
			for(Esame esame : pianoStudio) {
				System.out.println("Insegnamento: " + esame.getNome() + " | Crediti: " + esame.getCrediti());
		}
	}
	
	//OUTPUT libretto
	public void viewLibretto() {
		int superati = 0;
		System.out.println("\n***** LIBRETTO DELLA MATRICOLA #" + this.matricola + " *****\n");
		for(Esame esame : pianoStudio) {
			if(esame.getVoto()>=18) {
				superati++;
				System.out.println("Insegnamento: " + esame.getNome() + " | Crediti: " + esame.getCrediti() 
				+ " | Voto: " + esame.getVoto());
			}
		}
		if(superati == 0)
			System.out.println("Nessun esame ancora superato!");
		else
			System.out.println("\nCrediti totali: " + this.creditiAcquisiti + " | Media: " + this.mediaAritmetica);
	}
	
	//OUTPUT iscritti
	public void viewIscritti() {
		System.out.println("\n***** STUDENTI ISCRITTI A: " + this.nomeCorso + " *****\n");
		if(listaStudenti.isEmpty())
			System.out.println("Nessuno studente iscritto!");
		else 
			for(Studente studente : listaStudenti) {
				System.out.println("Studente: " + studente.getNome() + " " + studente.getCognome()
				+ " | Matricola #" + studente.getMatricola());
		}
	}
	
	//OUTPUT laureati
	public void viewLaureati() {
		int laureati = 0;
		System.out.println("\n***** STUDENTI LAUREATI IN: " + this.nomeCorso + " *****\n");
		for(Studente studente : listaStudenti) {
			if(studente.getIsLaureato()) {
				laureati++;
				System.out.println("Studente: " + studente.getNome() + " " + studente.getCognome()
				+ " | Matricola #" +  studente.getMatricola());
			}
		}
		if(laureati == 0)
			System.out.println("Nessuno studente ancora laureato!");
	}
	
	/*//metodo ausiliario per avere visualizzazione migliore di viewLibretto()
	//ritorna lunghezza del nome più lungo dell'esame tra quelli superati
	private int maxLength(ArrayList<Esame> pianoStudio) {
		int length = 0;
		for(int i=0; i<pianoStudio.size(); i++) {
			if(pianoStudio.get(i).getVoto()>=18) {
				if(pianoStudio.get(i).getNome().length()>length)
					length = pianoStudio.get(i).getNome().length();	
			}	
		}	
		return length;
	}*/
}