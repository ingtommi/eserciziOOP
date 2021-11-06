package Corsi;

import java.util.*;
import Main.*;
import Persone.*;

//SUPERCLASSE
public class CorsoLaurea {
	
	private String nomeCorso;
	private ArrayList<Studente> listaStudenti = new ArrayList<Studente>();
	InOut out = new InOut();
	Test test = new Test();
	
	//costruttore
	public CorsoLaurea(String nome){
		this.nomeCorso = nome;
	}
	
	public String getNomeCorso() { return this.nomeCorso; }
	public ArrayList<Studente> getListaStudenti() { return this.listaStudenti; }
	public void setNomeCorso(String nome) { this.nomeCorso = nome;}
	public void setListaStudenti(ArrayList <Studente> listaStudenti) { this.listaStudenti = listaStudenti; }

	public void enrollStudente(Studente studente) {
		if(!test.isPresent(listaStudenti,studente))
			listaStudenti.add(studente);
	}
	
	public Studente findStudente(String cognomeStudente) {
		Studente newstudente = null;
		for(Studente studente : listaStudenti) {
			if(studente.getCognome().equals(cognomeStudente)) {
				newstudente = studente;
		   	}
		}
		return newstudente;
    }
	
	public Studente findStudente(int matricolaStudente) {
		Studente newstudente = null;
		for(Studente studente : listaStudenti) {
			if(studente.getMatricola() == matricolaStudente) {
				newstudente = studente;
		   	}
		}
		return newstudente;
   }
	
    
	public void removeStudente(Studente studente) {
    	listaStudenti.remove(studente);
   }
		
	public void viewIscritti() {
		//utilizzo classe apposita
		out.viewIscritti(listaStudenti,nomeCorso);
	}	
	
	public void viewLaureati() {
		//utilizzo classe apposita
		out.viewLaureati(listaStudenti,nomeCorso);
	}
}