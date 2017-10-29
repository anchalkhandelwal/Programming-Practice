package mvcpattern;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SpriteController {
	private SpritePanel spritePanel;
	private MoveAction moveAction;
	
	public SpriteController(SpritePanel spritePanel, MoveAction moveAction){
		this.spritePanel = spritePanel;
		this.moveAction = moveAction;
		
		this.spritePanel.addControllerListerner(new ControllerListerner());
	}
	class ControllerListerner implements ActionListener{

		public void actionPerformed(ActionEvent e) {
			String spriteActionName;
			try{
				spriteActionName = spritePanel.getSelectedAction();
				System.out.println("Selectd is: "+spriteActionName);
				moveAction.executeAction(spriteActionName);
				spritePanel.setSelectedAction(moveAction.getAction());
			}catch(Exception err){
				
			}
		}
	}
}
