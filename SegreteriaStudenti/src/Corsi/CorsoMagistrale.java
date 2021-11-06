package Corsi;

public class CorsoMagistrale extends CorsoLaurea {
	
	private final int creditiTotali = 120;
	
	public CorsoMagistrale(String nome) {
		super(nome);
	}
	
	public int getCrediti() { return this.creditiTotali; }
}