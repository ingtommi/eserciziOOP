//CODICE CHE PERMETTE DI ESEGUIRE OPERAZIONE MOLTIPLICAZIONE CON INTERFACCIA GRAFICA

import java.awt.*;
import javax.swing.*;

public class Main extends JFrame {
	
	JLabel label1,label2,label3;
	JTextField campo1,campo2,campo3;
	JButton bottone;
	
	public static void main(String[] args) {
		
		Main window = new Main("MOLTIPLICATORE");
	}
	
	//costruttore
	public Main(String titolo) {
		//crea il JFrame
		super(titolo);
		// imposta la dimensione della finestra
		this.setSize(350,100);
		// specifica che la finestra deve essere centrata
		this.setLocationRelativeTo(null);
		// specifica che la chiusura della finestra deve far terminare il programma
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		// inizializza la prima casella di input
		label1 = new JLabel("Fattore 1");
		campo1 = new JTextField(10);
		
		// inizializza la seconda casella di input
		label2 = new JLabel("Fattore 2");
		campo2 = new JTextField(10);
		
		// inizializza una casella per visualizzare il risultato
		label3 = new JLabel("Risultato");
		campo3 = new JTextField(10);
		campo3.setEditable(false); // non modificabile dall'utente
		
		// crea un bottone che fa eseguire il calcolo
		bottone = new JButton("Calcola");
		// collega il bottone al suo gestore degli eventi
		bottone.addActionListener(new MainActionListener(this));
		
		// inserisce tutti gli elementi in un panel
		JPanel panel = new JPanel();
		panel.add(label1);
		panel.add(campo1);
		panel.add(label2);
		panel.add(campo2);
		panel.add(label3);
		panel.add(campo3);
		panel.add(bottone);
		
		// inserisce il panel nella finestra
		this.add(panel);
		
		// visualizza la finestra
		this.setVisible(true);
	}
}