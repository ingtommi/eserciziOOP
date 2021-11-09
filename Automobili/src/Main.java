import Motori.*;
import Auto.*;

public class Main {

	public static void main(String[] args) {

		Optional op1 = new Optional(1234, 200, "Vetri elettrici");
		Optional op2 = new Optional(77, 1000, "Aria condizionata");
		Optional op3 = new Optional(78, 2000, "Climatizzatore automatico");
		Optional op4 = new Optional(90, 500, "Caricatore CD");
		
		Automobile auto[] = new Automobile[4];
		
		auto[0] = new Automobile("RE 8888888", "FIAT", "Seicento", new MotoreBenzina(1000,4));
		auto[1] = new Berlina("BO 987654321", "MERCEDES", "S", new MotoreDiesel2500());
		auto[2] = new Coupe("RA 33333333", "FIAT", "Punto", new MotoreBenzina(1200,4));
		auto[3] = new Coupe("MI 7777777", "Audi", "A4", new MotoreDiesel(1800,4));
		
		auto[0].addOptional(op1);
		auto[0].addOptional(op2);
		auto[3].addOptional(op3);
		auto[3].addOptional(op4);
	}
}