import java.util.Scanner;

public class Campo {
	
	Prenotazione[] lista = new Prenotazione[10];

	//costruttore (potrei evitare perchè uguale al default)
	public Campo() {}
		
	Scanner input = new Scanner(System.in);
	
	public boolean addPrenotazione() {
		
		boolean add = true;
		System.out.print("\nInserire nome: ");
		String nome = input.nextLine();
		System.out.print("Inserire orario (ora esatta tra le 9 e le 18 incluse): ");
		int orario = input.nextInt();
		if(orario > 8 && orario < 19) {
			int H = orario-9;
			if(lista[H] != null)
				add = false;
			else lista[H] = new Prenotazione(nome,orario);
		}
		return add;
	}
	
	public boolean removePrenotazione() {
		 
		boolean remove = false;
		System.out.print("\nInserire nome: ");
		String nome = input.nextLine();
		System.out.print("Inserire orario (ora esatta tra le 9 e le 18 incluse): ");
		int orario = input.nextInt();
		for(int i=0; i<10 && remove == false; i++) {
			if(lista[i].getNome().equals(nome) && lista[i].getOrario() == orario) {
				remove = true;
				lista[i] = null;
			}
		}
		return remove;
	}
	
	public void printLista() {
		
		for(int j=0; j<10; j++) {
			if(lista[j] != null)
				System.out.println("\nOrario: " + lista[j].getOrario() + ", Nome: " + lista[j].getNome());
		}
	}
}