package GestioneRegistro;
import java.io.Serializable;


public class NomeEta implements Serializable {
	static final long serialVersionUID = 1;

	protected String nome;
	protected int eta;

	public NomeEta(String nome, int eta) {
		this.nome = nome;
		this.eta = eta;
	}

	public String getNome(){ return nome; }
	public int getEta(){ return eta; }

	public void incrementaEta() { eta++; }
	
	public String toString() { return nome + " " + eta; }
}