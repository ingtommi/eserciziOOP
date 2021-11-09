package Auto;
import Motori.*;

public class Berlina extends Auto {
	
	public Berlina(String targa, String marca, String modello, Motore motore) {
    	super(targa,marca,modello,motore);
 	}
	      
	public boolean isCoupe() {
		return false;
	}
}