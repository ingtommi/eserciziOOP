package GestioneRegistro;

import java.io.*;
import java.util.Vector;

public class RegistroEtaCompleto {

	private String file;
	private Vector<NomeEta> dati = new Vector<NomeEta>();
	private boolean modificato = false;

	//costruttore
	public RegistroEtaCompleto(String file) {
		this.file = file;
		try {
			ObjectInputStream file_input = new ObjectInputStream(new BufferedInputStream(new FileInputStream(file)));
			dati = (Vector<NomeEta>) file_input.readObject();
			file_input.close();
		} catch (FileNotFoundException e) {
			System.out.println("ATTENZIONE: FILE NON TROVATO!");
		} catch (ClassNotFoundException e) {
			System.out.println("ERRORE: MANCA OGGETTO NEL FILE!");
			System.out.println(e);
		} catch (IOException e) {
			System.out.println("ERRORE di I/O");
			System.out.println(e);
		}
	}


	public void visualizza() {
		System.out.println();
		if (dati.isEmpty())
			System.out.println("REGISTRO VUOTO!");
		else {
			System.out.println("REGISTRO DELLE ETA':");
			for (NomeEta nomeeta : dati)
				System.out.println(nomeeta);
		}
	}


	public void aggiungi(String nome, int eta) {
		NomeEta nomeeta = new NomeEta(nome,eta);
		if (dati.contains(nomeeta)) {
			System.out.println(nome + " E' GIA' PRESENTE NEL REGISTRO!");
		} else {
			dati.add(nomeeta);
			modificato=true;
		}
	}











}
