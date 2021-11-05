import java.util.*;

public class Studente extends Persona {

	private static int matricolaUltima = 100;
	private int matricola;
	private ArrayList<Esame> pianoStudio;
	private int crediti = 0;
	private final int maxCrediti = 180;
    private int esamiSuperati = 0;
    private float mediaAritmetica = 0;
    private int sommaVoti= 0;
    private boolean laureato = false;
	
    //costruttore
	public Studente(String nome, String cognome) {
		super(nome,cognome); //costruttore superclasse
		matricolaUltima++;
		matricola = matricolaUltima;
	}
	
	//getter e setter
	public double getMatricola() { return this.matricola; }
	public int getCrediti() { return this.crediti; }
	public float getMedia() { return this.mediaAritmetica; }
	public boolean getIsLaureato() { return isLaureato(); }
	public ArrayList<Esame> getPiano() { return this.pianoStudio; }
	public void setMatricola(int matricola) { this.matricola = matricola; }
	
	public void createPiano() {
		pianoStudio = new ArrayList<Esame>();
	}
	
	public void addEsame(Esame esame) {
		if(!this.isPresent(esame))
			pianoStudio.add(esame);
		}
	
	public void removeEsame(Esame esame) {
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
	
	public Esame findEsame(double id) {
		Esame newEsame = null;
		for (Esame esame : pianoStudio)
		{
			if(esame.getId()==id)
				newEsame = esame;
		}
		return newEsame;
	}
	
	public void insertEsito(Esame esame, int voto) {
		if(voto>=18) {
			esame.setVoto(voto);
			crediti += esame.getCrediti();
			esamiSuperati++;
			sommaVoti += esame.getVoto();
			mediaAritmetica = (float) sommaVoti/esamiSuperati;
		}
	}
	
	public void viewPiano() {
		//utilizzo classe apposita
		InOut out = new InOut(pianoStudio,matricola,crediti,mediaAritmetica);
		out.viewPiano();
	}
	
	public void viewLibretto() {
		//utilizzo classe apposita
		InOut out = new InOut(pianoStudio,matricola,crediti,mediaAritmetica);
		out.viewLibretto();
	}
	
	public boolean isLaureato() {
		if(crediti == maxCrediti)
			laureato = true;
		return laureato;
	}
	
	private boolean isPresent(Esame esame) {
		return pianoStudio.contains(esame);
	}
}