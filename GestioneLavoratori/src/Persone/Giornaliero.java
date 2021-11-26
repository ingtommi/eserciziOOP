package Persone;

public class Giornaliero extends Dipendente {
	
	private int giorni;
	
	public Giornaliero(String nom, String ind, String tel, String codice, double pagaBase, int giorni) {
		super(nom,ind,tel,codice,pagaBase);
		this.giorni = giorni;
	}
	
	public double calcolaPaga() {
		double paga = super.pagaBase*giorni;
		return paga;
	}
}