import java.util.Scanner;

public class Campo {
	
	//array di oggetti Prenotazione
	Prenotazione[] lista = new Prenotazione[10];

	//costruttore (potrei evitare perchè uguale al default)
	public Campo() {}
		
	Scanner input = new Scanner(System.in);
	
	//metodo per aggiungere prenotazione, void perchè con una variabile booleana
	//da restituire al main non sapevo come controllare se chiuso 
	public void addPrenotazione() {
		
		System.out.print("\nInserire nome (unica parola): ");
		String nome = input.next();
		System.out.print("Inserire orario (ora esatta tra le 9 e le 18 incluse): ");
		int orario = input.nextInt();
		if(isClosed(orario))
			System.out.println("\nCampo chiuso!");
		else {
			int H = orario-9;
			if(lista[H] != null)
				System.out.println("\nCampo occupato!");
			else {
				lista[H] = new Prenotazione(nome,orario);
				System.out.println("\nPrenotazione effettuata!");
			}
		}
	}
	
	//metodo per cancellare prenotazione dato nome e orario
	public boolean removePrenotazione() {
		 
		boolean remove = false;
		System.out.print("\nInserire nome (unica parola): ");
		String nome = input.next();
		System.out.print("Inserire orario (ora esatta tra le 9 e le 18 incluse): ");
		int orario = input.nextInt();
		for(int i=0; i<10 && remove == false; i++) {
			if(lista[i] != null) {
				if(lista[i].getNome().equals(nome) && lista[i].getOrario() == orario) {
					remove = true;
					lista[i] = null;
				}
			}
		}
		return remove;
	}
	
	//metodo per visualizzare prenotazioni effettuate
	public void printLista() {
		
		boolean check = false;
		System.out.println("\nLISTA PRENOTAZIONI:\n");
		for(int j=0; j<10; j++) {
			if(lista[j] != null) {
				System.out.println("Orario: " + lista[j].getOrario() + ".00-" + (lista[j].getOrario()+1)+ ".00" + ", Nome: " + lista[j].getNome());
				check = true;
			}
		}
		if(!check)
			System.out.println("\nNessuna prenotazione trovata!");
	}
	
	public boolean isClosed(int orario) {
		
		boolean close = false;
		if(orario < 9 || orario > 18)
			close = true;
		return close;
	}
}