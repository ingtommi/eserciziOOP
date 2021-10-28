
//Classe che contiene le credenziali di accesso degli utenti

public class gestioneUtenti {

	private String user, pwd, tipo;
	
	//costruttore
	public gestioneUtenti(String u, String p, String t) {
		
		user = u;
		pwd = p;
		tipo = t;
	}
	public boolean controlla(String u, String p) {
		
		if(user.equals(u) && pwd.equals(p))
			return true;
		else
			return false;
	}
	public String getUsername() {
		
		return user;
	}
}