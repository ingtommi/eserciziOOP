package Persone;

public class Amministratore extends Persona {
	
	//TODO: aggiungere attributi admin
	private boolean open = false;
	
	public Amministratore(String nome, String cognome) {
		super(nome,cognome);
	}
	
	public boolean getStato() {return this.open; }
	public void openPiano() { this.open = true; }
	public void closePiano() { this.open = false; }
}