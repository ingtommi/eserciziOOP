package Corsi;

import java.util.*;
import Main.InOut;
import Persone.*;

//SUPERCLASSE
public class CorsoLaurea {
	
	private String nome;
	private ArrayList<Studente> listaStudenti = new ArrayList<Studente>(); //altrimenti dava errore
	
	//costruttore
	public CorsoLaurea(String nome){
		this.nome = nome;
	}
	
	public String getNomeCorso() { return this.nome; }
	public ArrayList<Studente> getListaStudenti() { return this.listaStudenti; }
	public void setNomeCorso(String nome) { this.nome = nome;}
	public void setListaStudenti(ArrayList <Studente> listaStudenti) { this.listaStudenti = listaStudenti; }

	public void enrollStudente(Studente studente) {
		if(!this.isPresent(studente))
			listaStudenti.add(studente);
	}
	
	public Studente findStudente(String nomeStudente) {
		Studente newstudente = null;
		for(Studente studente : listaStudenti) {
			if(studente.getNome().equals(nomeStudente)) {
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
		InOut out = new InOut(listaStudenti,nome);
		out.viewIscritti();
	}	
	
	public void viewLaureati() {
		//utilizzo classe apposita
		InOut out = new InOut(listaStudenti,nome);
		out.viewLaureati();
	}
	
	private boolean isPresent(Studente studente) {
		return listaStudenti.contains(studente);
	}
}