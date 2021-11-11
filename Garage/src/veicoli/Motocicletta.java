package veicoli;

public class Motocicletta extends VeicoloAMotore {
	
	protected int tempi;
	protected String tipologia;
	
	public Motocicletta(int annoImm, int cilindrata, String marca, String tipoAlim, String tipologia, int tempi) {
		super(annoImm,cilindrata,marca,tipoAlim);
		this.tipologia = tipologia;
		this.tempi = tempi;
	}
	
	public String getTipologia() { return this.tipologia; }
	public void setTipologia(String tipologia) { this.tipologia = tipologia; }
	public int getTempi() { return this.tempi; }
	public void setTempi(int tempi) { this.tempi = tempi; }

	public String toString() {
		return ("Marca: " + marca + " | Tipo: " + tipoAlim + " | Anno: " + annoImm + " | Cilindrata: " + cilindrata
				+ " | Tipologia: " + tipologia + " | Tempi: " + tempi);
	}
}