import java.util.*;

public class CorsoLaurea {
	
	private String nome;
	private int creditiTotali;
	private ArrayList<Studente> listaStudenti = new ArrayList<Studente>(); //altrimenti dava errore
	
	//costruttore
	public CorsoLaurea(String nome, int crediti){
		this.nome = nome;
		this.creditiTotali = crediti;
	}
	
	public String getNomeCorso() { return this.nome; }
	public int getCreditiCorso() { return this.creditiTotali;}
	public ArrayList<Studente> getListaStudenti() { return this.listaStudenti; }
	public void setNomeCorso(String nome) { this.nome = nome;}
	public void setCreditiTotali(int creditiTotali) { this.creditiTotali = creditiTotali; }
	public void setListaStudenti(ArrayList <Studente> listaStudenti) { this.listaStudenti = listaStudenti; }

	public void enrollStudente(Studente studente) {
		if(!this.isPresent(studente))
			listaStudenti.add(studente);
	}
	
	public Studente findStudente(String nomeStudente) {
		Studente newstudente = null;
		for(Studente studente : listaStudenti) {
			if(studente.getNome().equals(nomeStudente)) {
				newstudente = studente;
		   	}
		}
		return newstudente;
   }
    
	public void removeStudente(Studente studente) {
    	listaStudenti.remove(studente);
   }
		
	public void viewIscritti() {
		//utilizzo classe apposita
		InOut out = new InOut(listaStudenti,nome);
		out.viewIscritti();
	}	
	
	public void viewLaureati() {
		//utilizzo classe apposita
		InOut out = new InOut(listaStudenti,nome);
		out.viewLaureati();
	}
	
	private boolean isPresent(Studente studente) {
		return listaStudenti.contains(studente);
	}
}