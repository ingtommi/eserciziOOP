import java.io.*;
import java.util.*;

public class Main {

	public static void main(String[] args) {
		
		List<List<String>> struct = new ArrayList<>();
		
		try {
			Scanner file_input = new Scanner(new BufferedReader(new FileReader("file.csv")));
			while(file_input.hasNext()) {
				String line = file_input.nextLine();
				String[] tokens = line.split(",");
				struct.add(Arrays.asList(tokens));
			}
			file_input.close();
		} catch(FileNotFoundException e) {
			System.out.println("\nFILE NON TROVATO!");
		}
		System.out.println("LETTURA FILE:\n");
		for(List<String> line: struct) {
			System.out.println("Nome: " + line.get(0) + " | Tipo: " + line.get(1) + 
					" | Città: " + line.get(2) + " | Dimensione: " + line.get(3));
        }
	}
}