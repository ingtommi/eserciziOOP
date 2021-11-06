package Main;

import java.util.*;
import Esami.*;
import Persone.*;

public class Test {
	
	private boolean full = false;
	private boolean laureato = false;
	//TODO: eliminare maxCrediti e usare quelli di ogni specifico corso
	private int maxCrediti = 180;

	public Test() {}
	
	public boolean isFull(ArrayList<Esame> pianoStudio, int crediti) {
		int creditiTotali = 0;
		for(int i=0; i<pianoStudio.size(); i++) {
			creditiTotali += pianoStudio.get(i).getCrediti();
		}
		if((creditiTotali+crediti)>maxCrediti)
			full = true;
		return full;
	}
	
	public boolean isLaureato(Studente studente) {
		if(studente.getCrediti() == maxCrediti)
			laureato = true;
		return laureato;
	}
	
	//esame presente in piano
	public boolean isPresent(ArrayList<Esame> pianoStudio, Esame esame) {
		return pianoStudio.contains(esame);
	}
		
	//studente presente in corso
	public boolean isPresent(ArrayList<Studente> listaStudenti, Studente studente) {
		return listaStudenti.contains(studente);
	}
}