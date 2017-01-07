package at.geos.FilezillaFileConverter;

import java.awt.Container;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import java.awt.Font;
import java.awt.event.ActionEvent;

public class MainFrame extends JFrame{
	
	private ActionListener controller;
	
	private JTextField textFieldSourceFile;
	private JTextField textFieldTargetFile;
	
	private static final String TITLE = "FileZilla Servermanager File Converter";
	private static final String BTN_SOURCE_FILE = "btnSourceFile";
	private static final String BTN_TARGET_FILE = "btnTargetFile";
	private static final String BTN_CREATE = "btnCREATE";
	
	public MainFrame(ActionListener controller) {
		super(TITLE);
		this.setController(controller);
		
		setSize(633, 302);
	    setDefaultCloseOperation(EXIT_ON_CLOSE);

	    getContentPane().setLayout(null);
	    
	    textFieldSourceFile = new JTextField();
	    textFieldSourceFile.setBounds(8, 69, 191, 22);
	    getContentPane().add(textFieldSourceFile);
	    textFieldSourceFile.setColumns(10);
	    
	    textFieldTargetFile = new JTextField();
	    textFieldTargetFile.setBounds(8, 104, 191, 22);
	    getContentPane().add(textFieldTargetFile);
	    textFieldTargetFile.setColumns(10);
	    
	    JButton btnSourceFile = new JButton("Source File");
	    btnSourceFile.setBounds(211, 68, 97, 25);
	    btnSourceFile.addActionListener(controller);
	    btnSourceFile.setActionCommand(BTN_SOURCE_FILE);
	    getContentPane().add(btnSourceFile);
	    
	    JButton btnTargetFile = new JButton("Target File");
	    btnTargetFile.setBounds(211, 103, 97, 25);
	    btnTargetFile.addActionListener(controller);
	    btnTargetFile.setActionCommand(BTN_TARGET_FILE);
	    getContentPane().add(btnTargetFile);
	    
	    JRadioButton rdbtnBase64 = new JRadioButton("plaintext -> base64");
	    rdbtnBase64.setBounds(8, 149, 154, 25);
	    rdbtnBase64.setSelected(true);
	    getContentPane().add(rdbtnBase64);
	    
	    JRadioButton rdbtnPlaintext = new JRadioButton("base64 -> plaintext");
	    rdbtnPlaintext.setBounds(184, 149, 216, 25);
	    getContentPane().add(rdbtnPlaintext);
	    
	    ButtonGroup radioButtonGroup = new ButtonGroup();
	    radioButtonGroup.add(rdbtnPlaintext);
	    radioButtonGroup.add(rdbtnBase64);
	    
	    JLabel lblNewLabel = new JLabel("Select an existing FileZilla Servermanager-XML-file and the target for the converted version:");
	    lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 13));
	    lblNewLabel.setBounds(8, 13, 595, 33);
	    getContentPane().add(lblNewLabel);
	    
	    JButton btnCreate = new JButton("Create");
	    btnCreate.addActionListener(controller);
	    btnCreate.setBounds(12, 195, 97, 25);
	    btnCreate.setActionCommand(BTN_CREATE);
	    getContentPane().add(btnCreate);
	}

	public ActionListener getController() {
		return controller;
	}

	public void setController(ActionListener controller) {
		this.controller = controller;
	}
}
