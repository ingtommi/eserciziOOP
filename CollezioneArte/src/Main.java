import Opere.*;

public class Main {

	public static void main(String[] args) {
		
		Opera opera1 = new Quadro("Avvento","Leonardo",4,2.5);
		Opera opera2 = new Scultura("David","Michelangelo",4,2,1.2);
		Opera opera3 = new Scultura("Cristo","Mantegna",3,1.5,1);
		
		opera1.printingombro();
		opera2.printingombro();
		opera3.printingombro();
		
		Collezione coll = new Collezione("Personale","Roma");
		
		coll.addOpera(opera3);
		coll.addOpera(opera2);
		coll.addOpera(opera1);
		
		coll.visualizza();
	}
}