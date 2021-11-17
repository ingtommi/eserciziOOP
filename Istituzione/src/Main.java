import Persone.*;
import java.util.*;

public class Main {

	public static void main(String[] args) {
		
		Personale p1 = new Impiegato("Tommaso Fava","Via Liguria, 9","3291911219","FVATMS00C14E388O",100,2500);
		Personale p2 = new Giornaliero("Mario Rossi","Via Roma, 10","3276523459","RSSMRO67D21388Y",100,25);
		Personale p3 = new Volontario("Luca Bianchi","Via Torino, 2","3267834456");
		
		System.out.println(p1);
		System.out.println("Paga: " + p1.calcolaPaga());
		System.out.println();
		System.out.println(p2);
		System.out.println("Paga: " + p2.calcolaPaga());
		System.out.println();
		System.out.println(p3);
		System.out.println("Paga: " + p3.calcolaPaga());
	}
}