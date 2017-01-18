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
		
	}
}
