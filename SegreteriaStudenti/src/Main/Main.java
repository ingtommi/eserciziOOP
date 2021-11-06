package Main;

//importo file di altri packages (* = tutti i file)
import Corsi.*;
import Persone.*;

public class Main {

	public static void main(String[] args) {
		//crea oggetto Esame
		Esame es1 = new Esame("CampiElettromagnetici",6);
		Esame es2 = new Esame("ElettronicaAnalogica",9);
		Esame es3 = new Esame("Geometria",6);
		Esame es4 = new Esame("MisureElettroniche",9);
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
		ct2.viewIscritti();
		//visualizza laureati
		ct1.viewLaureati();
		ct2.viewLaureati();
		//crea piano studio vuoto --> N.B. se non creo il piano non posso utilizzare viewPiano()!
		st1.createPiano();
		st2.createPiano();
		//aggiunge esami al piano creato precedentemente
        st1.addEsame(es1);
		st1.addEsame(es2);
		st1.addEsame(es3);
		st1.addEsame(es4);
		//visualizza piano di studi
		st1.viewPiano();
		st2.viewPiano();
		//aggiunge esami superati
        st1.insertEsito(es1,30);
        st1.insertEsito(es2,25);
        st1.insertEsito(es3,23);
        //visualizza libretto
        st1.viewLibretto();
        st2.viewLibretto();
	}
}