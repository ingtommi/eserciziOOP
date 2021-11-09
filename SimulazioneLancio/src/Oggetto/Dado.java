package Oggetto;

public class Dado extends OggettoLanciato {
	
	public void lancio() {
		this.x = 1+(int)(Math.random()*6);
	}
	
	public void print() {
		System.out.println("Lancio dado: " + this.x);
	}
}