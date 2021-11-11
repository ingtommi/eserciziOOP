package veicoli;

public class Automobile extends VeicoloAMotore {
	
	protected int porte;
	
	public Automobile(int annoImm, int cilindrata, String marca, String tipoAlim, int porte) {
		super(annoImm,cilindrata,marca,tipoAlim);
		this.porte = porte;
	}
	
	public int getPorte() { return this.porte; }
	public void setPorte(int porte) { this.porte = porte; }

	public String toString() {
		return ("Marca: " + marca + " | Tipo: " + tipoAlim + " | Anno: " + annoImm + " | Cilindrata: " + cilindrata
				+ " | Porte: " + porte);
	}
}