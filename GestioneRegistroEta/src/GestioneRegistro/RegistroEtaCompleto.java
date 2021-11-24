package GestioneRegistro;

import java.io.*;
import java.util.Vector;

public class RegistroEtaCompleto {

	private String file;
	private Vector<NomeEta> dati = new Vector<NomeEta>();
	private boolean salvato = false;

	//costruttore
	public RegistroEtaCompleto(String file) {
		this.file = file;
		try {
			ObjectInputStream file_input = new ObjectInputStream(new BufferedInputStream(new FileInputStream(file)));
			dati = (Vector<NomeEta>) file_input.readObject();
			file_input.close();
		} catch (FileNotFoundException e) {
			System.out.println("\nATTENZIONE: FILE NON TROVATO!");
		} catch (ClassNotFoundException e) {
			System.out.println("\nERRORE: " + e);
		} catch (IOException e) {
			System.out.println("\nERRORE: " + e);
		}
	}

	public boolean getSalvato() {return salvato;}

	public void viewRegistro() {
		System.out.println();
		if (dati.isEmpty())
			System.out.println("\nREGISTRO VUOTO!");
		else {
			System.out.println("\nREGISTRO DELLE ETA'\n:");
			for (NomeEta nomeeta : dati)
				System.out.println(nomeeta);
		}
	}

	public void addStudente(String nome, int eta) {
		NomeEta nomeeta = new NomeEta(nome,eta);
		if (dati.contains(nomeeta)) {
			System.out.println(nome + " E' GIA' PRESENTE NEL REGISTRO!");
		} else {
			dati.add(nomeeta);
			salvato = false;
		}
	}


	public int incrementaEta(String nome) {
		for (NomeEta nomeeta : dati) {
			if (nomeeta.getNome().equals(nome)) {
				nomeeta.incrementaEta();
				salvato = false;
				return nomeeta.getEta();
			}
		}
		return 0;
	}


	public boolean salva() {
		if (salvato) {
			try {
				ObjectOutputStream file_output = new ObjectOutputStream(new BufferedOutputStream(new FileOutputStream(file)));
				file_output.writeObject(dati);
				file_output.close();
				salvato = true; 
				return salvato;
			} catch (IOException e) {
				System.out.println("ERRORE di I/O");
				System.out.println(e);
				return salvato;
			}		
		} else return false;
	}
}