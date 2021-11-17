package Opere;

public class Scultura extends Opera {
	
	private double altezza,larghezza,profondita;
	
	public Scultura(String tit, String art, double alt, double largh, double prof) {
		super(tit,art);
		this.altezza = alt;
		this.larghezza = largh;
		this.profondita = prof;
	}
	
	public double getAltezza() { return altezza; }
	public double getLarghezza() { return larghezza; }
	public double getProfondita() { return profondita; }
	public void setAltezza(double alt) { this.altezza = alt; }
	public void setLarghezza(double largh) { this.larghezza = largh; }
	public void setProfondita(double prof) { this.profondita = prof; }
	
	public void printingombro() {
		double ingombro = altezza*larghezza*profondita;
		System.out.println("Ingombro quadro (m^3): " + ingombro);
	}
}