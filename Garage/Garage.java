
public class Garage {
	
	VeicoliAMotore veicoli = new VeicoliAMotore[15];
	
	
	public int immettiNuovoVeicolo(VeicoliAMotore v) {
		for(int i=0; i<15; i++)
			if(veicoli[i] == null)
				veicoli [i] = v;
	}
	
	
	public VeicoliAMotore estraiVeicolo(int posto){
	    if(posto<0 || posto>14)
	    	System.out.println("ERRORE");
	    else veicoli.remove(posto);
	}

	
	public void stampaSituazionePosti(){
		for(int i=0; i<15; i++) {
			System.out.println(VeicoliAMotore[i]);
	}}


}
