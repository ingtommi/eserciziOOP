//CODICE CHE LEGGE DA FILE .TXT ELENCO DI PASSWORD E MOSTRA GUI PER INSERIRE UNA PWD E CONTROLLARE CORRETTEZZA

import java.awt.*;
import javax.swing.*;

public class Main extends JFrame {
	
	JLabel pwd,res;
	JTextField campo1,campo2;
	JButton bottone;
	
	public static void main(String[] args) {
		
		Main window = new Main("LOGIN");
	}
	
	public Main(String titolo) {
		super(titolo);
		this.setSize(400,80);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		pwd = new JLabel("Password");
		campo1 = new JTextField(5);
		res = new JLabel("Permesso");
		campo2 = new JTextField(10);
		campo2.setEditable(false);
		
		bottone = new JButton("Accedi");
		bottone.addActionListener(new Azioni(this));
		
		JPanel panel = new JPanel();
		panel.add(pwd);
		panel.add(campo1);
		panel.add(res);
		panel.add(campo2);
		panel.add(bottone);
		
		this.add(panel);
		this.setVisible(true);
	}
}