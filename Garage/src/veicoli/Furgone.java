package veicoli;

public class Furgone extends VeicoloAMotore {
	
	protected int carico;
	
	public Furgone(int annoImm, int cilindrata, String marca, String tipoAlim, int carico) {
		super(annoImm,cilindrata,marca,tipoAlim);
		this.carico = carico;
	}
	
	public int getCarico() { return this.carico; }
	public void setCarico(int carico) { this.carico = carico; }

	public String toString() {
		return ("Marca: " + marca + " | Tipo: " + tipoAlim + " | Anno: " + annoImm + " | Cilindrata: " + cilindrata
				+ " | Carico: " + carico);
	}
}