package mvcpattern;

import java.awt.Color;
import java.awt.Image;
import java.awt.event.ActionListener;

import javax.swing.BoxLayout;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class SpritePanel extends JPanel {

	ImageIcon previewIcon;
	JLabel previewLabel;
	AddImage spriteImage;
	ActionButton spriteAction;

	JButton drawButton = new JButton("Draw");
	JTextField actionSelected = new JTextField(10);

	public SpritePanel() {
		this.setSize(400, 600);
		this.setBackground(Color.RED);
		this.setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));

		previewIcon = new ImageIcon("drawable/Questionmark.png");
		Image tempImg = previewIcon.getImage();
		tempImg = tempImg.getScaledInstance(30, 30, java.awt.Image.SCALE_SMOOTH);
		previewIcon = new ImageIcon(tempImg);
		previewLabel = new JLabel("Selected", previewIcon, JLabel.CENTER);		

		//initImageButtons();
		initActionButtons();
		this.add(drawButton);
		//this.add(previewLabel);
		this.add(actionSelected);
	}

	public void initImageButtons() {
		ButtonGroup bgSprites = new ButtonGroup();
		spriteImage = new AddImage("drawable/aqua_ball.png", "Aqua Ball", 30, 30, this, bgSprites);
		spriteImage = new AddImage("drawable/soccer_ball.png", "Football", 30, 30, this, bgSprites);
	}

	public void initActionButtons() {
		ButtonGroup bgActions = new ButtonGroup();
		spriteAction = new ActionButton("Move", this, bgActions);
		spriteAction = new ActionButton("Bounce", this, bgActions);
	}

	public String getSelectedAction() {
		return this.spriteAction.buttonName;
	}

	public void setSelectedAction(String spriteActionName) {
		this.spriteAction.buttonName = spriteActionName;
		actionSelected.setText(spriteActionName);
	}

	void addControllerListerner(ActionListener listenForDrawButton) {
		drawButton.addActionListener(listenForDrawButton);
	}

	void displayErrorMessage(String errorMessage) {
		JOptionPane.showMessageDialog(this, errorMessage);
	}
}
