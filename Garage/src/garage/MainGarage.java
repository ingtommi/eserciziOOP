package garage;

import veicoli.*;

public class MainGarage {

	public static void main(String[] args) {
		
		Garage garage = new Garage();
		VeicoloAMotore v1 = new Automobile(2010,2000,"BMW","benzina",5);
		VeicoloAMotore v2 = new Furgone(2012,3000,"Renault","diesel",3);
		VeicoloAMotore v3 = new Motocicletta(2018,500,"Ducati","benzina","corsa",4);
		
		garage.immettiNuovoVeicolo(v1);
		garage.immettiNuovoVeicolo(v2);
		garage.immettiNuovoVeicolo(v3);
		
		garage.estraiVeicolo(1);
		
		garage.stampaSituazionePosti();	

	}
}