package Persone;

import java.util.*;

import Corsi.*;
import Esami.*;
import Main.*;

public class Studente extends Persona {

	private static int matricolaUltima = 100;
	private int matricola;
	private ArrayList<Esame> pianoStudio = new ArrayList<Esame>();
	private int crediti = 0;
    private int esamiProfitto = 0;
    private float mediaAritmetica = 0;
    private int sommaVoti= 0;
	Test test = new Test();
	InOut out = new InOut();
	
    //costruttore
	public Studente(String nome, String cognome) {
		super(nome,cognome); //costruttore superclasse
		matricolaUltima++;
		matricola = matricolaUltima;
	}
	
	//getter e setter
	public int getMatricola() { return this.matricola; }
	public int getCrediti() { return this.crediti; }
	public float getMedia() { return this.mediaAritmetica; }
	public ArrayList<Esame> getPiano() { return this.pianoStudio; }
	public void setMatricola(int matricola) { this.matricola = matricola; }
	
	public void addEsame(Esame esame) {
		if(test.isOpen()) {
			if(!test.isFull(pianoStudio,esame.getCrediti())) {
				pianoStudio.add(esame);
			}
		}
	}
	
	public void removeEsame(Esame esame) {
		if(test.isOpen())
			pianoStudio.remove(esame);
	}
	
	public Esame findEsame(String nomeEsame) {
		Esame newEsame = null;
		for (Esame esame : pianoStudio)
		{
			if(esame.getNome().equals(nomeEsame))
				newEsame = esame;
		}
		return newEsame;
	}
	
	public Esame findEsame(int id) {
		Esame newEsame = null;
		for (Esame esame : pianoStudio)
		{
			if(esame.getId()==id)
				newEsame = esame;
		}
		return newEsame;
	}
	
	public void insertEsito(Profitto esame, int voto) {
		if(test.isPresent(pianoStudio,esame)) {
			if(voto>=18) {
				esame.setVoto(voto);
				crediti += esame.getCrediti();
				esamiProfitto++;
				sommaVoti += esame.getVoto();
				mediaAritmetica = (float) sommaVoti/esamiProfitto;
			}
		}
	}
	
	public void insertEsito(Idoneita esame, int voto) {
		if(test.isPresent(pianoStudio,esame)) {
			if(voto>=18) {
				esame.setVoto(voto);
				crediti += esame.getCrediti();
			}
		}
	}
	
	public void viewPiano() {
		//utilizzo classe apposita
		out.viewPiano(pianoStudio,matricola);
	}
	
	public void viewLibretto() {
		//utilizzo classe apposita
		out.viewLibretto(pianoStudio,matricola,crediti,mediaAritmetica);
	}
}