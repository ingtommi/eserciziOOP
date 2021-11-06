package Main;

import java.util.*;

import Esami.*;
import Persone.Studente;

public class InOut {

	Test test = new Test();
	
	public InOut() {}
    
	//TODO: aggiugere menù input
	
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