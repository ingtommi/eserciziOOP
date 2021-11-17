package Opere;

public class Quadro extends Opera {
	
	private double altezza,larghezza;
	
	public Quadro(String tit, String art, double alt, double largh) {
		super(tit,art);
		this.altezza = alt;
		this.larghezza = largh;
	}
	
	public double getAltezza() { return altezza; }
	public double getLarghezza() { return larghezza; }
	public void setAltezza(double alt) { this.altezza = alt; }
	public void setLarghezza(double largh) { this.larghezza = largh; }
	
	public void printingombro() {
		double ingombro = altezza*larghezza;
		System.out.println("Ingombro quadro (m^2): " + ingombro);
	}
}