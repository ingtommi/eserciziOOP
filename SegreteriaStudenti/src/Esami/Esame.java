package Esami;

//SUPERCLASSE
public class Esame {
	
	private String nome;
	private int crediti;
	private int voto = 0;	private static int idUltimo = 0;
	private int id;
	boolean superato = false;
	
	//costruttore
	public Esame(String nome, int crediti) {
		this.nome = nome;
		this.crediti = crediti;
		idUltimo++;
		id = idUltimo;
	}

	//getter e setter
    public String getNome() { return this.nome; }
    public int getCrediti() { return this.crediti; }
    public int getId() { return this.id; }
    public int getVoto() {return this.voto; }
    public void setCrediti(int crediti) { this.crediti = crediti; }
    public void setVoto(int voto) {this.voto = voto; }
    
    public boolean isSuperato() {
    	if(this.voto>=18)
    		superato = true;
    	return superato;
    }
}