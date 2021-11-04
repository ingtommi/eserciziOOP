
public class Esame {
	
	private String nome;
	private int voto;
	private int crediti;
	private static double idUltimo = 0;
	private double id;
	
	//costruttore
	public Esame(String nome, int crediti) {
		this.nome = nome;
		this.crediti = crediti;
		idUltimo++;
		id = idUltimo;
	}

	//getter e setter
    public String getNome() { return nome; }
    public int getVoto(){ return voto; }
    public int getCrediti() { return crediti; }
    public double getId() { return id; }
    public void setVoto(int voto) { this.voto = voto; }
    public void setCrediti(int crediti) { this.crediti = crediti; }
}