package Persone;

public abstract class Personale {

	protected String nome,indirizzo,telefono;
	
	public Personale(String nom, String ind, String tel) {
		this.nome = nom;
		this.indirizzo = ind;
		this.telefono = tel;
	}
	
	public String getNome() { return nome; }
	public String getIndirizzo() { return indirizzo; }
	public String getTelefono() { return telefono; }
	public void setIndirizzo(String ind) { this.indirizzo = ind; }
	public void setTelefono(String tel) {this.telefono = tel; }
	
	public String toString() {
		return "Nome: " + nome + " | Indirizzo: " + indirizzo + " | Telefono: " + telefono;
	}
	
	public abstract double calcolaPaga();
}