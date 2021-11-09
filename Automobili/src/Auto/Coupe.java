package Auto;
import Motori.*;

public class Coupe extends Auto {

	 public Coupe(String targa, String marca, String modello, Motore motore) {
	    	super(targa,marca,modello,motore);
	    }
	    
	    public boolean isCoupe() {
	    	return true;
	    }
	
}
