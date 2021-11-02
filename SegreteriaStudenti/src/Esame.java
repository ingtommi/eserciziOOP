
public class Esame {
	
	private String nome;
	private int voto;
	private int crediti;
	
	//costruttore
	
	public Esame(String nome, int voto, int crediti) {
		this.nome= nome;
		this.voto= voto;
		this.crediti=crediti;
	}

	//getter
    public String getNome() {
		return nome;
	}

    public int getVoto(){
	    return voto;
    }

     public int getCrediti() {
	return crediti;
     }

    public void setNome(String nome){
	
	this.nome = nome;	
     }

    public void setVoto(int voto) {
	
	this.voto = voto;
    }

   public void setCrediti(int crediti) {
	
	this.crediti = crediti;
    }






}
