package Opere;

public abstract class Opera {
	
	protected String titolo, artista;
	
	public Opera(String tit, String art) {
		this.titolo = tit;
		this.artista = art;
	}
	
	public boolean equals(Object o) {
		if(o instanceof Opera) {
			Opera op = (Opera) o;
			return ((op.titolo.equals(this.titolo))&&(op.artista.equals(this.artista)));
		}
		else return false;
	}
	
	public abstract void printingombro();
}