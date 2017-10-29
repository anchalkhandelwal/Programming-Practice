package mvcpattern;

import javax.swing.ButtonGroup;
import javax.swing.JRadioButton;

public class ActionButton {
	
	JRadioButton spriteRadioButton;
	String buttonName;
	SpritePanel spritePanel;
	ButtonGroup bgActions;
	public ActionButton(String buttonName,  SpritePanel spritePanel, ButtonGroup bgActions) {
		this.buttonName = buttonName;
		spriteRadioButton = new JRadioButton(buttonName, false);
		spriteRadioButton.setFocusable(false);
		
		bgActions.add(spriteRadioButton);
		spritePanel.add(spriteRadioButton);
		
	}

}
