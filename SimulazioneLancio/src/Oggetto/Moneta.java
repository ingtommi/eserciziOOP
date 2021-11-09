package Oggetto;

public class Moneta extends OggettoLanciato {
	
	public void lancio() {
		this.x = (int)(Math.random()*2);
	}

	public void print() {
		String uscita;
		if(this.x == 0)
			uscita = "Testa";
		else uscita = "Croce";
		System.out.println("Lancio moneta: " + uscita);
	}
}