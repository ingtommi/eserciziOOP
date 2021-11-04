
public class Main {

	public static void main(String[] args) {
		//crea oggetti Esame
		Esame campi = new Esame ("campi", 6);
		Esame analogica = new Esame ("analogica", 9);
		Esame geometria = new Esame ("geometria", 6);
		Esame misure = new Esame ("misure", 9);
		//crea oggetto Studente
		Studente marco = new Studente("marco", "ciampichetti");
		//crea piano studio vuoto
		marco.createPiano();
		//aggiunge esami al piano creato precedentemente
        marco.addEsame(campi);
		marco.addEsame(analogica);
		marco.addEsame(geometria);
		marco.addEsame(misure);
		//visualizza piano di studi
		marco.getPiano();
		//aggiunge esami superati
        marco.insertEsito(campi, 30);
        marco.insertEsito(analogica, 25);
        marco.insertEsito(geometria, 23);
        //visualizzazione libretto
        marco.viewLibretto();
	}
}

//TODO: classe che gestisce output (per libretto ad esempio)