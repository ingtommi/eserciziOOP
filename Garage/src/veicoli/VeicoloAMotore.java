package veicoli;

public class VeicoloAMotore {
	
	protected int annoImm, cilindrata;
	protected String marca, tipoAlim;
	
	public VeicoloAMotore(int annoImm, int cilindrata, String marca, String tipoAlim) {
		this.annoImm = annoImm;
		this.cilindrata = cilindrata;
		this.marca = marca;
		this.tipoAlim = tipoAlim;
	}
	
	public int getAnno() { return this.annoImm; }
	public void setAnno(int annoImm) { this.annoImm = annoImm; }
	public String getMarca() { return this.marca; }
	public void setMarca(String marca) { this.marca = marca; }
	public int getCilindrata() { return this.cilindrata; }
	public void setCilindrata(int cilindrata) { this.cilindrata = cilindrata; }
	public String getTipo() { return this.tipoAlim; }
	public void setTipo(String tipoAlim) { this.tipoAlim = tipoAlim; }
}