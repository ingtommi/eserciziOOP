import java.io.*;
import java.util.*;

public class Main {

	public static void main(String[] args) {
		
		Vector<String[]> struct = new Vector<String[]>();
		
		try {
			Scanner file_input = new Scanner(new BufferedReader(new FileReader("file.csv")));
			while(file_input.hasNext()) {
				String line = file_input.nextLine();
				String[] tokens = line.split(",");
				struct.add(tokens);
			}
			file_input.close();
		} catch(FileNotFoundException e) {
			System.out.println("\nFILE NON TROVATO!");
		}
		System.out.println("LETTURA FILE: file.csv\n");
		for(String[] line : struct) {
			System.out.println("Nome: " + line[0] + " | Tipo: " + line[1] + 
					" | Città: " + line[2] + " | Dimensione: " + line[3]);
        }
	}
}