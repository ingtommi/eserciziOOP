package Persone;

public class Amministratore extends Persona {
	
	private boolean open = false;
	private static int matricolaUltima = 6000;
	private int matricola;
	
	public Amministratore(String nome, String cognome) {
		super(nome,cognome);
		matricolaUltima++;
		matricola = matricolaUltima;
	}
	
	public boolean getStato() {return this.open; }
	public int getMatricola() { return this.matricola; }
	public void setMatricola(int matricola) { this.matricola = matricola; }
	public void openPiano() { this.open = true; }
	public void closePiano() { this.open = false; }
}