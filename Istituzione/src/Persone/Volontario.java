package Persone;

public class Volontario extends Personale {
	
	private double pagaBase;
	
	public Volontario(String nom, String ind, String tel) {
		super(nom,ind,tel);
		this.pagaBase = 0;
	}
	
	public double calcolaPaga() {
		return pagaBase;
	}
}