
//Gestione operazioni

public class ContoCorrente {

	private double saldo;
	private int numero;
	private static int numeroUltimo = 1000;
	public static double tasso_family = 0.02, tasso_business = 0.04;
	private static String tipo;
	
	//costruttore conto
	public ContoCorrente(String t, double saldoIniziale) {
		
		saldo = saldoIniziale;
		numeroUltimo++;
		numero = numeroUltimo;
		tipo = t;	
	}
	//versamento
	public void versa(double somma) {
		saldo += somma;
		System.out.println("\nSomma versata: " + somma);
	}
	//prelievo
	public boolean preleva(double somma) {
		if(saldo<somma)
			return false;
		else
			saldo -= somma;
		    System.out.println("\nSomma prelevata: " + somma);
		    return true;
	}
	//restituzione saldo
	public double getSaldo() {
		
		return saldo;
	}
	//restituzione numero conto
    public int getNumero() {
    	
    	return numero;
    }
    //aggiornamento saldo con interessi
    public void maturaInteressi() {
    	
    	if(tipo.equals("f"))
    		saldo += saldo*tasso_family;
    	else
    		saldo += saldo*tasso_business;
    }
    //modifica tasso family
    public static void modificaTassoFamily(double new_tasso) {
    	
    	tasso_family = new_tasso;
    }
    //modifica tasso business
    public static void modificaTassoBusiness(double new_tasso) {
    	
    	tasso_business = new_tasso;
    }
}