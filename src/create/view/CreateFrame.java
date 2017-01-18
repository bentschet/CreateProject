package create.view;

import java.awt.Dimension;
import javax.swing.JFrame;
import create.controller.CreateController;

public class CreateFrame extends JFrame
{
	private CreateController baseController;
	private CreatePanel panel;
	
	public CreateFrame(CreateController baseController)
	{
		super();
		this.baseController = baseController;
		this.panel = new CreatePanel(baseController);
		
		this.setupFrame();
	}
	
	private void setupFrame()
	{
		super.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		super.setSize(1000, 850);
		super.setMinimumSize(new Dimension(650, 520));
		super.setTitle("Password Strength");
		super.setLocationRelativeTo(null);
		super.setContentPane(panel);
		super.setVisible(true);
	}
	
	public CreatePanel getPanel()
	{
		return this.panel;
	}
}
