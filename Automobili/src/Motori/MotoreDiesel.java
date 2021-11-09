package Motori;

public class MotoreDiesel extends Motore {
	
	public MotoreDiesel(int cilindrata,int cilindri) {
		super(cilindrata,cilindri);
	}
	
	public int potenza() { return (this.cilindrata/this.cilindri)/20; }
	public boolean isDiesel() { return true; }
	public int maxRPM() { return 5000; }
}