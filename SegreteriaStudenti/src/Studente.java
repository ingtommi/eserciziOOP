import java.util.*;

public class Studente extends Persona {

	private static double matricolaUltima = 10000;
	private double matricola;
    private String nome;
	private ArrayList<Esame> pianostudio;
	private int crediti = 0;
    private int esamiSuperati = 0;
    private double mediaAritmetica = 0;
    private int sommaVoti= 0;
	
    //costruttore
	public Studente(String nome, String cognome) {
		super(nome,cognome); //costruttore superclasse
		matricolaUltima++;
		matricola = matricolaUltima;
	}
	
	//getter e setter
	public double getMatricola() {
		return this.matricola;
	}
	
	public int getCrediti() {
		return this.crediti;
	}
	
	public double getMedia() {
		return this.mediaAritmetica;
	}
	
	public ArrayList<Esame> getPiano() {
		return this.pianostudio;
	}
	
	public void setMatricola(double matricola) {
		this.matricola = matricola;
	}
	
	public void createPiano() {
		pianostudio = new ArrayList<Esame>();
	}
	
	public void addEsame(Esame esame) {
		if(!this.isPresent(esame))
			pianostudio.add(esame);
		}
	
	public void removeEsame(Esame esame) {
		if(!this.isPresent(esame))
			pianostudio.remove(esame);
	}
	
	public Esame findEsame(String nomeEsame) {
		Esame newEsame = null;
		for (Esame esame : pianostudio)
		{
			if(esame.getNome().equals(nomeEsame))
				newEsame = esame;
		}
		return newEsame;
		}
	
	
	public Esame findEsame(double id) {
		Esame newEsame = null;
		for (Esame esame : pianostudio)
		{
			if(esame.getId()==id)
				newEsame = esame;
		}
		return newEsame;
		}
	
	public boolean isPresent(Esame esame) {
		return pianostudio.contains(esame);
	}
	
	public void promuovi(Esame esame, int voto) {
		if(voto>=18) {
			esame.setVoto(voto);
			crediti += esame.getCrediti();
			esamiSuperati++;
			sommaVoti += esame.getVoto();
			mediaAritmetica = sommaVoti/esamiSuperati;
			}
		}
		
	public void visualizza() {
		for(Esame esame : pianostudio) {
			if(esame.getVoto()>=18)
				System.out.println("Nome esame: " + esame.getNome() + " | Voto: " + esame.getVoto() + " | Crediti: " + esame.getCrediti());
				}
		System.out.println("\nCrediti totali: " + getCrediti() + " | Media: " + getMedia());
	}
}