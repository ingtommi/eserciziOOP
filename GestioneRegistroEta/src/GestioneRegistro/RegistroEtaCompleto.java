package GestioneRegistro;

import java.io.*;
import java.util.Vector;

public class RegistroEtaCompleto {

	private String file;
	private Vector<NomeEta> dati = new Vector<NomeEta>();
	private boolean salvato = true;
	private boolean fileok = true;

	//costruttore
	public RegistroEtaCompleto(String file) {
		this.file = file;
		try {
			ObjectInputStream file_input = new ObjectInputStream(new BufferedInputStream(new FileInputStream(file)));
			dati = (Vector<NomeEta>) file_input.readObject();
			file_input.close();
			fileok = true;
		} catch (FileNotFoundException e) {
			System.out.println("\nERRORE: FILE NON TROVATO!");
			fileok = false;
		} catch (EOFException e) {
			//se il file è vuoto dà problemi, scrivendoci dentro un oggetto null risolvo
			try {
			ObjectOutputStream fo = new ObjectOutputStream(new BufferedOutputStream(new FileOutputStream(file)));
			fo.writeObject(null);
			fo.close();
			} catch(IOException e1) {
				System.out.println("\nERRORE: " + e);
				fileok = false;
			}
		} catch (ClassNotFoundException e) {
			System.out.println("\nERRORE: OGGETTO NON PRESENTE!");
			fileok = false;
		} catch (IOException e) {
			System.out.println("\nERRORE: " + e);
			fileok = false;
		}
	}
	
	public boolean getSalvato() { return salvato; }
	public boolean getFileOk() { return fileok; }

	public void viewRegistro() {
		if(dati.isEmpty())
			System.out.println("\nREGISTRO VUOTO!");
		else {
			System.out.println("\nREGISTRO DELLE ETA':\n");
			for (NomeEta nomeeta : dati)
				System.out.println(nomeeta); //utilizzo metodo toString di NomeEta
		}
	}

	public void addStudente(String nome, int eta) {
		NomeEta nomeeta = new NomeEta(nome,eta);
		if(dati.contains(nomeeta)) {
			System.out.println("\nSTUDENTE GIA' PRESENTE NEL REGISTRO!");
		} else {
			dati.add(nomeeta);
			System.out.println("\nOPERAZIONE AVVENUTA CORRETTAMENTE!");
			salvato = false;
		}
	}

	public void incrementaEta(String nome) {
		for(NomeEta nomeeta : dati) {
			if(nomeeta.getNome().equals(nome)) {
				nomeeta.incrementaEta();
				System.out.println("\nOPERAZIONE AVVENUTA CORRETTAMENTE!");
				salvato = false;
			} else {
				System.out.println("\nSTUDENTE NON PRESENTE NEL REGISTRO!");
			}
		}
	}

	public void salva() {
		if(salvato) {
			System.out.println("\nFILE GIA' AGGIORNATO!");
		} else {
			try {
				ObjectOutputStream file_output = new ObjectOutputStream(new BufferedOutputStream(new FileOutputStream(file)));
				file_output.writeObject(dati);
				file_output.close();
				System.out.println("\nOPERAZIONE AVVENUTA CORRETTAMENTE!");
				salvato = true; 
			} catch (IOException e) {
				System.out.println("ERRORE: " + e);
			}
		}
	}
}