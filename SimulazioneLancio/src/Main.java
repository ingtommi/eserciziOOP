import Oggetto.*;

public class Main {

	public static void main(String[] args) {
		
		Dado dado = new Dado();
		Moneta moneta = new Moneta();
		
		dado.lancio();
		moneta.lancio();
		dado.print();
		moneta.print();
	}
}