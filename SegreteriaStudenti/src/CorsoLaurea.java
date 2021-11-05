import java.util.*;

public class CorsoLaurea {
	
	private String nome;
	private int crediti;
	private ArrayList<Studente> listastudenti;
	
	//costruttore
	CorsoLaurea(String nome, int crediti){
		this.nome = nome;
		this.crediti = crediti;
	}
	
	 public String getNomeCorso() { return this.nome; }
	 public int getCreditiCorso() { return this.crediti;}
	 public ArrayList<Studente> getListaStudenti() { return this.listastudenti; }
	 public void setNomeCorso(String nome) { this.nome = nome;}
	 public void setListaStudenti(ArrayList <Studente> listastudenti) { this.listastudenti = listastudenti; }

	
	public void iscrizione(Studente studente) {
		if(!listastudenti.contains(studente))
			listastudenti.add(studente);
	}
	
	public Studente findStudent(String nomeStudente) {
		Studente newstudente = null;
		for( Studente studente : listastudenti )
		{
			if(studente.getNome().equals(nomeStudente)) 
		   	{
				newstudente = studente;
		   	}
		}
		return newstudente;
   }
    
	public void remove(Studente studente) {
    	listastudenti.remove(studente);
   }
		
	public void viewStudenti() {
		System.out.println(listastudenti);
	}	
	
	public void ViewLaureati() {
		for( Studente studente : listastudenti ) 
		{
			if (studente.getIsLaureato()) 
			{
				System.out.println(studente);
			}
		}
	}





}
