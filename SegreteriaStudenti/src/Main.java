
public class Main {

	public static void main(String[] args) {
		Esame campi = new Esame ("campi", 6);
		Esame analogica = new Esame ("analogica", 9);
		Esame geometria = new Esame ("geometria", 6);
		Esame misure = new Esame ("misure", 9);
		Studente marco = new Studente("marco", "ciampichetti");
		marco.createPiano();
        marco.addEsame(campi);
		marco.addEsame(analogica);
		marco.addEsame(geometria);
		marco.addEsame(misure);
        marco.promuovi(campi, 30);
        marco.promuovi(analogica, 25);
        marco.promuovi(geometria, 23);
        marco.promuovi(misure, 20);
        marco.visualizza();
	}

}
