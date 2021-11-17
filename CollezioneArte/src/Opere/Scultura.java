package Opere;

public class Scultura extends Opera {
	
	private double altezza,larghezza,profondità;
	
	public Scultura(String tit, String art, double alt, double largh, double prof) {
		super(tit,art);
		this.altezza = alt;
		this.larghezza = largh;
		this.profondità = prof;
	}
	
	public double getAltezza() { return altezza; }
	public double getLarghezza() { return larghezza; }
	public double getProfondità() { return profondità; }
	public void setAltezza(double alt) { this.altezza = alt; }
	public void setLarghezza(double largh) { this.larghezza = largh; }
	public void setProfondità(double prof) { this.profondità = prof; }
	
	public void printingombro() {
		double ingombro = altezza*larghezza*profondità;
		System.out.println("Ingombro quadro (m^3): " + ingombro);
	}
}