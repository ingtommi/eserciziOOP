//SUPERCLASSE (estesa da Studente ed eventualmente in futuro da Professore)

public class Persona {
	
	String nome;
	String cognome;
	
	public Persona(String nome, String cognome) {
		this.nome = nome;
		this.cognome = cognome;
	}
	
	
	public String getNome() {
		return this.nome;
	}
	
	public String getCognome() {
		return this.cognome;
	}
}

