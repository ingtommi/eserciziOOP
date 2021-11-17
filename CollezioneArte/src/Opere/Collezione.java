package Opere;
import java.util.*;

public class Collezione {
	
	Vector<Opera> collezione;
	String nome,luogo;
	
	public Collezione(String nome, String luogo) {
		collezione = new Vector<Opera>();
		this.nome = nome;
		this.luogo = luogo;
	}
	
	public void addOpera(Opera opera) {
		collezione.add(opera);
	}
	
	public boolean findOpera(Opera opera) {
		if(collezione.contains(opera))
			return true;
		else return false;			
	}
	
	public void visualizza() {
		System.out.println("\nNome collezione: " + nome + " | Luogo: " + luogo);
		for(Opera opera : collezione)
			System.out.println("Titolo opera: " + opera.titolo + " | Artista: " + opera.artista);
	}
}