
public class Studente extends Persona {

	private String nome;
	private static double matricolaUltima = 10000;
	private double matricola;
<<<<<<< HEAD
	
	
=======
	private Esame[] pianostudio;
>>>>>>> 9f3b2ec1df8c7b147ef1bad396ee645aef12f4e2
	
	
	//costruttore
	public Studente(String nome, String cognome) {
		super(nome,cognome); //costruttore superclasse
		matricola++;
		matricola = matricolaUltima;
	}
	
	//getter e setter
	public String getNome() {
		return super.nome;
	}
	
	public String getCognome() {
		return super.cognome;
	}
	
	public double getMatricola() {
		return this.matricola;
	}
	
	public void setMatricola(double matricola) {
		this.matricola = matricola;
	}
	
	//TODO: getPiano(), createPiano(), addEsame(), removeEsame(), findEsame(), toString()
}