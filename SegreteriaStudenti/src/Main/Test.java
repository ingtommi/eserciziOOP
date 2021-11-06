package Main;

import java.util.*;
import Esami.*;
import Persone.*;
import Corsi.*;

public class Test {
	
	private boolean full = false;
	private boolean laureato = false;
	//TODO: eliminare maxCrediti e usare quelli di ogni specifico corso
	private int maxCrediti = 180;

	public Test() {}
	
	public boolean getFull() { return this.full; }
	
	//TODO: modificare o togliere
	public boolean isOpen() {
		return true;
	}
	
	//controlla se con nuovo esame si sfora il massimo 
	public boolean isFull(ArrayList<Esame> pianoStudio, int crediti) {
		int creditiTotali = 0;
		for(int i=0; i<pianoStudio.size(); i++) {
			creditiTotali += pianoStudio.get(i).getCrediti();
		}
		if((creditiTotali+crediti)>maxCrediti)
			full = true;
		return full;
	}
	
	//controlla se studente ha raggiunto massimo crediti
	public boolean isLaureato(Studente studente) {
		if(studente.getCrediti() == maxCrediti)
			laureato = true;
		return laureato;
	}
	
	//controlla se esame presente in piano
	public boolean isPresent(ArrayList<Esame> pianoStudio, Esame esame) {
		return pianoStudio.contains(esame);
	}
		
	//controlla se studente presente in corso
	public boolean isPresent(ArrayList<Studente> listaStudenti, Studente studente) {
		return listaStudenti.contains(studente);
	}
}