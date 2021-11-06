package Corsi;

import java.util.*;
import Main.*;
import Persone.*;

//SUPERCLASSE
public class CorsoLaurea {
	
	private String nome;
	private ArrayList<Studente> listaStudenti = new ArrayList<Studente>(); //altrimenti dava errore
	InOut out = new InOut();
	Test test = new Test();
	
	//costruttore
	public CorsoLaurea(String nome){
		this.nome = nome;
	}
	
	public String getNomeCorso() { return this.nome; }
	public ArrayList<Studente> getListaStudenti() { return this.listaStudenti; }
	public void setNomeCorso(String nome) { this.nome = nome;}
	public void setListaStudenti(ArrayList <Studente> listaStudenti) { this.listaStudenti = listaStudenti; }

	public void enrollStudente(Studente studente) {
		if(!test.isPresent(listaStudenti,studente))
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
		out.viewIscritti(listaStudenti,nome);
	}	
	
	public void viewLaureati() {
		//utilizzo classe apposita
		out.viewLaureati(listaStudenti,nome);
	}
}