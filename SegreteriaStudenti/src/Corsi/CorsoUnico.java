package Corsi;

public class CorsoUnico extends CorsoLaurea {
	
	private final int creditiTotali = 300;
	
	public CorsoUnico(String nome) {
		super(nome);
	}
	
	public int getCrediti() { return this.creditiTotali; }
}