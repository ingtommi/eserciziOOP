import Motori.*;
import Auto.*;

public class Main {

	public static void main(String[] args) {

		Optional op1 = new Optional(1234, 200, "Vetri elettrici");
		Optional op2 = new Optional(77, 1000, "Aria condizionata");
		Optional op3 = new Optional(78, 2000, "Climatizzatore automatico");
		Optional op4 = new Optional(90, 500, "Caricatore CD");
		
		Auto auto[] = new Auto[4];
		
		auto[0] = new Auto("RE 8888888", "FIAT", "Seicento", new MotoreBenzina(1000,4));
		auto[1] = new Berlina("BO 987654321", "MERCEDES", "S", new MotoreDiesel2500());
		auto[2] = new Coupe("RA 33333333", "FIAT", "Punto", new MotoreBenzina(1200,4));
		auto[3] = new Coupe("MI 7777777", "Audi", "A4", new MotoreDiesel(1800,4));
		
		auto[0].addOptional(op1);
		auto[0].addOptional(op2);
		auto[3].addOptional(op3);
		auto[3].addOptional(op4);
		
		for(int i=0;i<auto.length;i++){
		    System.out.println("\nAuto " + (i+1));
		    System.out.println("Targa: " + auto[i].getTarga());
		    System.out.println("Modello: " + auto[i].getModello());
		    System.out.println("Coupe': " + auto[i].isCoupe());
		    
		    // Definisco un oggetto Motore, per richiamare i vari metodi
		    Motore mot = auto[i].getMotore();
		    System.out.println("Cilindrata = " + mot.getCilindrata());
		    System.out.println("Potenza = " + mot.potenza());
		    System.out.println("Diesel = " + mot.isDiesel());
		    
		    auto[i].getOpt().get(i).toString();
		    
	}
}
	
}