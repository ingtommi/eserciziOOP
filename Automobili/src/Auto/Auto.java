package Auto;
 
import java.util.ArrayList;
import Motori.*;

public class Auto {
	
	protected ArrayList<Optional> optionals = new ArrayList<Optional>();
	protected Motore motore;
	protected String modello;
	protected String marca;
	protected String targa;
	
	public Auto(String targa, String marca, String modello, Motore motore) {
		this.marca = marca;
		this.targa = targa;
		this.modello = modello;
		this.motore = motore;
	 }
	
	public String getTarga() {return targa;}
	public String getModello() {return modello;}
	public String getMarca() {return marca;}
	public Motore getMotore() {return motore;}
	public ArrayList<Optional> getOpt() {return optionals;} 
	
	
	public boolean isCoupe() {
		return false;
	}
	
	public void addOptional(Optional optional) {
		optionals.add(optional);
	}
}
