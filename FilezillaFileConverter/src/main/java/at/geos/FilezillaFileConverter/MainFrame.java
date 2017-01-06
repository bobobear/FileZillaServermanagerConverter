package at.geos.FilezillaFileConverter;

import java.awt.Container;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class MainFrame extends JFrame{
	
	private ActionListener controller;
	private static String TITLE = "FileZilla Servermanager File Converter";
	
	public MainFrame(ActionListener controller) {
		super(TITLE);
		this.setController(controller);
		
		setSize(350, 200);
	    setDefaultCloseOperation(EXIT_ON_CLOSE);

	    Container container = getContentPane();
	    
	    container.setLayout(new FlowLayout());
	    
	    
	    JTextField sourceFilePathText = new JTextField();
	    JButton sourceFileButton = new JButton("Source File");
	      
	    JTextField targetFilePathText = new JTextField();
	    JButton targetFileButton = new JButton("Target File");
	    
	    container.add(sourceFileButton);
	    container.add(sourceFilePathText);
	    container.add(targetFileButton);
	    container.add(targetFilePathText);
	}

	public ActionListener getController() {
		return controller;
	}

	public void setController(ActionListener controller) {
		this.controller = controller;
	}
	
	

}
