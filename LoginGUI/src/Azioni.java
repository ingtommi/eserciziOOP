import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;
import java.util.*;

import javax.swing.JLabel;
import javax.swing.JTextField;

public class Azioni implements ActionListener {

	private Main window;
	
	public Azioni(Main window) {
		this.window = window;
	}
	
	public void actionPerformed(ActionEvent e) {
		int pwd = Integer.parseInt(window.campo1.getText());
		if(login(pwd))
			window.campo2.setText("RILASCIATO");
		else window.campo2.setText("NON RILASCIATO");
	}
	
	private boolean login(int password) {
		
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