
public class Cellulare {
	
	private double carica;
	private int numeroChiamate;
	private static double costoOperatore = 0.2;
	
	public Cellulare(double carica) {
		this.carica = carica;
	}
	
	public void ricarica(double unaRicarica) {
		carica += unaRicarica;
	}
	
	public void chiama(double minutiDurata) {
		numeroChiamate++;
		carica -= costoOperatore*minutiDurata;
	}
	
	public double numero404() {
		return carica;
	}

	public int getNumeroChiamate() {
		return numeroChiamate;
	}
	
	public void azzeraChiamate() {
		numeroChiamate = 0;
	}
}