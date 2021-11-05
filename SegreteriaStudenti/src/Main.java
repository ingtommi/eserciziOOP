
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
		//crea oggetto CorsoLaurea
		CorsoLaurea cl1 = new CorsoLaurea("IngegneriaElettronica",180);
		CorsoLaurea cl2 = new CorsoLaurea("IngegneriaMeccanica",180);
		//iscrive studente al corso
		cl1.enrollStudente(st1);
		cl1.enrollStudente(st2);
		//visualizza iscritti
		cl1.viewIscritti();
		cl2.viewIscritti();
		//visualizza laureati
		cl1.viewLaureati();
		cl2.viewLaureati();
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