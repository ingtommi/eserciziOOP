import java.util.*;

public class Studente extends Persona {

	private static double matricolaUltima = 10000;
	private double matricola;
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
	public void setMatricola(double matricola) { this.matricola = matricola; }
	
	public void getPiano() {
		System.out.println("***** PIANO DI STUDI *****\n");
		for(Esame esame : pianoStudio) {
			System.out.println("Esame: " + esame.getNome());
		}
	}
	
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
	
	public boolean isLaureato() {
		if(crediti == maxCrediti)
			laureato = true;
		return laureato;
	}
	
	public boolean isPresent(Esame esame) {
		return pianoStudio.contains(esame);
	}

	public void viewLibretto() {
		System.out.println("\n***** LIBRETTO STUDENTE *****\n");
		for(Esame esame : pianoStudio) {
			if(esame.getVoto()>=18)
				System.out.println("Esame: " + esame.getNome() + " | Voto: " + esame.getVoto() + " | Crediti: " + esame.getCrediti());
				}
		System.out.println("\nCrediti totali: " + this.crediti + " | Media: " + this.mediaAritmetica);
	}
}