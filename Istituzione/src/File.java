import java.io.*;
import java.util.*;
import Persone.*;

public class File {
	
	public boolean WriteFile(Vector<Personale> lista) throws IOException {
		
		boolean ok = true;
		try {
			PrintWriter file_output = new PrintWriter(new BufferedWriter(new FileWriter("lista.txt")));
			for (Personale p : lista) {
				file_output.println(p);
			}
			file_output.close();
			} catch (IOException e) {
				System.out.println("ERRORE di I/O");
				System.out.println(e);
				ok = false;
			}
		return ok;
	}
}