package Auto;

public class Optional {


    private int codice;   
    private String descrizione;
    private int valore;
    public Optional(int codice, int valore, String descrizione)  {
    	this.codice = codice;
		this.valore = valore;
		if(descrizione != null) {
		    this.descrizione = descrizione;
		}
		else{
		    this.descrizione = "Descrizione non presente";
		}
    }
    
    
    public int getValore()  {return valore;}
    public int getCodice(){return codice;}
    public String getDescrizione(){return descrizione;}
    public void setDescrizione(String descrizione) {this.descrizione = descrizione;}
    public void setValore(int valore) {
    	if(valore >= 0)	{
    		this.valore = valore;
    	}
    }

    public String toString() {
    	return "Optional: " + this.codice + " | " + this.descrizione;
    }
}
