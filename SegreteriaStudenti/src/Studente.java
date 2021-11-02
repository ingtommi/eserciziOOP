
public class Studente {

	private String nome;
	private static double matricolaUltima = 10000;
	private double matricola;
	//TODO: piano di studi (lista di esami)
	
	
	//costruttore
	public Studente(String nome) {
		this.nome = nome;
		matricola++;
		matricola = matricolaUltima;
		
	}
	
	//getter
	public String getNome() {
		return nome;
	}
	
	public double getMatricola() {
		return matricola;
	}
	
	//TODO: getPiano()
	
	//TODO: getPiano, createPiano(), addEsame(), removeEsame(), findEsame(), printEsamiSuperati()
}