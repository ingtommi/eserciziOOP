package garage;

import veicoli.*;

public class Garage {
	
	VeicoloAMotore veicolo[] = new VeicoloAMotore[15];
	
	public int immettiNuovoVeicolo(VeicoloAMotore v) {
		int i;
		boolean go = true;
		for(i=0; i<15 && go; i++)
			if(veicolo[i] == null) {
				veicolo[i] = v;
				go = false;
			}
		return i;
	}
	
	
	public VeicoloAMotore estraiVeicolo(int posto){
		VeicoloAMotore v = null;
	    if(posto<0 || posto>14) {
	    	System.out.println("ERRORE");
	    }
	    else {
	    	v = veicolo[posto];
	    	veicolo[posto] = null;
	    }
	    return v;
	}

	
	public void stampaSituazionePosti(){
		for(int i=0; i<15; i++) {
			System.out.println(veicolo[i]);
		}
	}
}