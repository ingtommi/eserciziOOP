import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

//gestore degli eventi dell'addizionatore
public class MainActionListener implements ActionListener {

	// riferimento alla finestra dell'addizionatore
	private Main window;
	
	// costruttore
	public MainActionListener(Main window) {
		this.window = window;
	}
	
	// gestore dell'evento "pression del bottone"
	public void actionPerformed(ActionEvent e) {
		// recupera il primo addendo (tramite window)
		int val1 = Integer.parseInt(window.campo1.getText());
		// recupera il secondo addendo (tramite window)
		int val2 = Integer.parseInt(window.campo2.getText());
		// scrive il risultato (tramite window)
		window.campo3.setText(Integer.toString(val1*val2));
	}
}