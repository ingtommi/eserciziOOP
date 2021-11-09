package Motori;

public class MotoreBenzina extends Motore{
	
	public MotoreBenzina(int cilindrata, int cilindri) {
		super(cilindrata,cilindri);
	}
	
	public int potenza() { return (this.cilindrata/this.cilindri)/10; }
	public boolean isDiesel() { return false; }
	public int maxRPM() { return 7500; }
}