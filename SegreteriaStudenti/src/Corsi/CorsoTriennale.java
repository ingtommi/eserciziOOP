package Corsi;

public class CorsoTriennale extends CorsoLaurea {
	
	private final int creditiTotali = 180;
	
	public CorsoTriennale(String nome) { 
		super(nome);
	}	
	
	public int getCrediti() { return this.creditiTotali; }
}