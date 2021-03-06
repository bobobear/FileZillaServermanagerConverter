package at.geos.FilezillaFileConverter.Controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import at.geos.FilezillaFileConverter.Gui.MainFrame;

public class Controller implements ActionListener{

	private static final String BTN_SOURCE_FILE = "btnSourceFile";
	private static final String BTN_TARGET_FILE = "btnTargetFile";
	private static final String BTN_CREATE = "btnCREATE";
	
	private MainFrame mainFrame;
	
	
	public void initializeApp(){
		mainFrame = new MainFrame(this);
		mainFrame.setVisible(true);
	}
	
	public void actionPerformed(ActionEvent e) {
		switch (e.getActionCommand()) {
		case BTN_SOURCE_FILE:
			System.out.println(BTN_SOURCE_FILE);
			mainFrame.showSourceFileChooser();
			break;
		case BTN_TARGET_FILE:
			System.out.println(BTN_TARGET_FILE);
			mainFrame.showTargetFileChooser();
			break;
		case BTN_CREATE:
			System.out.println(BTN_CREATE);
		break;
		
		}
		
		
	}

}
