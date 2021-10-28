public class Prenotazione {

	private String nome;
	private int orario;
	
	//costruttore
	public Prenotazione(String nome, int orario) {
		
		this.nome = nome;
		this.orario = orario;
	}
	
	public String getNome() {
		
		return nome;
	}
	
	public int getOrario() {
		
		return orario;
	}
	
	public void setNome(String nome) {
		
		this.nome = nome;	
	}
	
	public void setOrario(int orario) {
		
		this.orario = orario;
	}
}