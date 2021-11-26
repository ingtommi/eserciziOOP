package Eccezioni;

public class EccezionePagaNegativa extends Exception {
	
	public EccezionePagaNegativa() { super(); }
	public EccezionePagaNegativa(String msg) { super(msg); }
}