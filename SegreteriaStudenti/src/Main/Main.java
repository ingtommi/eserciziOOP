package Main;

//importo file di altri packages (* = tutti i file)
import Corsi.*;
import Esami.*;
import Persone.*;

//TODO: implementare database esami e corsi di laurea
public class Main {

	public static void main(String[] args) {
		//crea oggetto Esame
		Profitto es1 = new Profitto("CampiElettromagnetici",6);
		Profitto es2 = new Profitto("ElettronicaAnalogica",9);
		Profitto es3 = new Profitto("Geometria",6);
		Profitto es4 = new Profitto("MisureElettroniche",9);
		Idoneita es5 = new Idoneita("LinguaStraniera",3);
		//crea oggetto Studente
		Studente st1 = new Studente("Marco","Ciampichetti");
		Studente st2 = new Studente("Tommaso","Fava");
		Studente st3 = new Studente("Mario","Rossi");
		//crea oggetto CorsoLaurea
		CorsoLaurea ct1 = new CorsoTriennale("IngegneriaElettronica");
		CorsoLaurea ct2 = new CorsoMagistrale("IngegneriaMeccanica");
		//iscrive studente al corso
		ct1.enrollStudente(st1);
		ct1.enrollStudente(st2);
		ct2.enrollStudente(st3);
		//visualizza iscritti
		ct1.viewIscritti();
		//visualizza laureati
		ct2.viewLaureati();
		//crea piano studio vuoto --> N.B. se non creo il piano non posso utilizzare viewPiano()!
		st1.createPiano();
		st2.createPiano();
		//aggiunge esami al piano creato precedentemente
        st1.addEsame(es1);
		st1.addEsame(es2);
		st2.addEsame(es4);
		st2.addEsame(es5);
		//visualizza piano di studi
		st1.viewPiano();
		st2.viewPiano();
		//aggiunge esami superati
        st1.insertEsito(es1,30);
        st1.insertEsito(es2,25);
        st1.insertEsito(es3,28); //non viene inserito perchè non presente nel piano
        st2.insertEsito(es5,30);
        st2.insertEsito(es4,23);
        //visualizza libretto
        st1.viewLibretto();
        st2.viewLibretto(); //es5 non fa media
	}
}