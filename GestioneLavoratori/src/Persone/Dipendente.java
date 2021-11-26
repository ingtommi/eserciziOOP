package Persone;

//utilizzo classe astratta perchè altrimenti sarei obbligato a definire calcolaPaga() che invece metto nelle sottoclassi
public abstract class Dipendente extends Personale {
	
	private String codice;
	protected double pagaBase;
	
	public Dipendente(String nom, String ind, String tel, String codice, double pagaBase) {
		super(nom,ind,tel);
		this.codice = codice;
		this.pagaBase = pagaBase;
	}
	
	public String getCodice() { return codice; }
	public double getPagaBase() { return pagaBase; }
	public void setPagaBase(double pagaBase) { this.pagaBase = pagaBase; }
}