
//Inizializzazione credenziali utente e scelta terminale

public class gestioneBanca {

	public static void main(String[] args) {
		
		//generazione utenti
		gestioneUtenti u1 = new gestioneUtenti("ingtommi", "admin", "f");
		gestioneUtenti u2 = new gestioneUtenti("test", "test", "b");
		gestioneUtenti utenti[] = {u1,u2};
		
		//generazione terminali
		gestioneTerminale t1 = new gestioneTerminale(utenti);
		
		//ingresso terminale
		t1.login();
	}
}

//TODO: Associare conti agli utenti (DIZIONARIO)
//TODO: Implementare possibilità per admin di gestire array di utenti (aggungere, eliminare, visualizzare)