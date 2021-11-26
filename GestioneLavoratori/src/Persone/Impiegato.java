package Persone;

public class Impiegato extends Dipendente {
	
	private double bonus;
	
	public Impiegato(String nom, String ind, String tel, String codice, double pagaBase, double bonus) {
		super(nom,ind,tel,codice,pagaBase);
		this.bonus = bonus;
	}
	
	public double calcolaPaga() {
		double paga = super.pagaBase + bonus;
		return paga;
	}
}