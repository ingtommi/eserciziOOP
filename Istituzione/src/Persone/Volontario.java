package Persone;
import java.util.*;

public class Volontario extends Personale {
	
	private double pagaBase;
	private Vector<Volontario> lista = new Vector<Volontario>();
	
	public Volontario(String nom, String ind, String tel) {
		super(nom,ind,tel);
		this.pagaBase = 0;
	}
	
	public double calcolaPaga() {
		return pagaBase;
	}
}