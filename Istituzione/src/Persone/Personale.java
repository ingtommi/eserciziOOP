package Persone;

public abstract class Personale {

	protected String nome,indirizzo,telefono;
	private static int ultimoID = 100;
	protected int ID;
	
	public Personale(String nom, String ind, String tel) {
		this.nome = nom;
		this.indirizzo = ind;
		this.telefono = tel;
		ultimoID++;
		ID = ultimoID;
		
	}
	
	public String getNome() { return nome; }
	public String getIndirizzo() { return indirizzo; }
	public String getTelefono() { return telefono; }
	public int getID() { return this.ID; }
	public void setIndirizzo(String ind) { this.indirizzo = ind; }
	public void setTelefono(String tel) {this.telefono = tel; }
	
	public String toString() {
		return "\nID: "+ ID + " | Nome: " + nome + " | Indirizzo: " + indirizzo + " | Cellulare: " + telefono;
	}
	
	public abstract double calcolaPaga();
}