package Oggetto;

public abstract class OggettoLanciato {
	
	protected int x;
	
	public abstract void lancio();
	public int getValore() { return this.x; } ;
	public void print() { System.out.println(getValore()); }
}
