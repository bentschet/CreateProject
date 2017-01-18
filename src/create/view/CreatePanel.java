package create.view;

import java.awt.Color;
import javax.swing.*;
import create.controller.CreateController;
import java.awt.Dimension;
import java.awt.event.*;
import java.awt.event.MouseMotionListener;

public class CreatePanel extends JPanel
{
	private CreateController baseController;
	private SpringLayout baseLayout;
	private JButton checkButton;
	private JTextField passwordField;
	
	public CreatePanel(CreateController baseController)
	{
		super();
		this.baseController = baseController;
		this.baseLayout = new SpringLayout();
		this.checkButton = new JButton("Check password strength!");
		this.passwordField = new JTextField(20);
	}
	
	private void setupPanel()
	{
		this.setLayout(baseLayout);
		this.setPreferredSize(new Dimension(900, 600));
		this.setBackground(Color.lightGray);
		
		passwordField.setEditable(true);
	}
}
