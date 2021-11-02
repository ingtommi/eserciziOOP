
public class Car {

	//variabili di istanza
	private double resa; //resa = litri/chilometri 
	private double litri;
	
	//costruttore1
	public Car(double resa) {
		this.resa = resa;
		this.litri = 0;
	}
	
	//costruttore2 --> VARIANTE: acquisto auto con serbatoio non vuoto
	public Car(double resa, double litriIniziali) {
		this.resa = resa;
		this.litri = litriIniziali;
	}
	
	//diminuzione carburante dopo un certo percorso
	public void drive(double distanza) {
		this.litri -= this.resa*distanza;
	}
	
	//rifornimento
	public void addGas(double litri) {
		this.litri += litri;
	}
	
	//getter
	public double getGas() {
		return this.litri;
	}	
}