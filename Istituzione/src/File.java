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
				System.out.println("ERRORE di I/O: " + e);
				ok = false;
			}
		return ok;
	}
	
	public boolean login(int password) {
		
		Vector<Integer> pwd = new Vector<Integer>();
		boolean find = false;
		try {
			Scanner file_input = new Scanner(new BufferedReader(new FileReader("pwd.txt")));
			while(file_input.hasNext()) {
				pwd.add(file_input.nextInt());
			}
			file_input.close();
		} catch(IOException e) {
			System.out.println("ERRORE DI I/O: " + e);
		}
		for(Integer pass : pwd) {
			if(password == pass)
				find = true;
		}
		return find;
	}
}