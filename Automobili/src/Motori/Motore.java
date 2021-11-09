package Motori;

public class Motore {
	
	protected int cilindrata;
	protected int cilindri;
	protected int cavalli;
	
	public Motore(int cilindrata, int cilindri) {
		this.cilindrata = cilindrata;
		this.cilindri = cilindri;
		this.cavalli = potenza();
	}
	
	public int getCilindrata() { return this.cilindrata; }
	public int potenza() { return 0; }
	public int maxRPM() { return 0; }
	public boolean isDiesel() { return false; }
}