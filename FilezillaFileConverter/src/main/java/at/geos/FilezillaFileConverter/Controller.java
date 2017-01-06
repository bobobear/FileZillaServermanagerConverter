package at.geos.FilezillaFileConverter;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Controller implements ActionListener{

	private MainFrame mainFrame;
	
	public Controller() {
		mainFrame = new MainFrame(this);
		mainFrame.setVisible(true);
	}
	
	public void actionPerformed(ActionEvent e) {
		
		
	}

}
