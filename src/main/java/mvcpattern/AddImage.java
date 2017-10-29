package mvcpattern;

import java.awt.Image;

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JRadioButton;

public class AddImage {
	ImageIcon spriteImage;
	Image tempImg;
	JRadioButton spriteRadioButton;
	int imageWidth;
	int imageHeight;
	String imageIcon;
	String imageName;
	
	ButtonGroup bgSprites;
	SpritePanel spritePanel;
	
	public AddImage(String imageIcon, String imageName, int imageWidth, int imageHeight, SpritePanel spritePanel, ButtonGroup bgSprites){
		this.imageIcon = imageIcon;
		this.imageName = imageName;
		this.imageWidth = imageWidth;
		this.imageHeight = imageHeight;
		this.spritePanel = spritePanel;
		this.bgSprites = bgSprites;
		
		ImageIcon spriteImage = new ImageIcon(imageIcon);
		Image tempImg = spriteImage.getImage();
		tempImg = tempImg.getScaledInstance(imageWidth, imageHeight, java.awt.Image.SCALE_SMOOTH);
		spriteImage = new ImageIcon(tempImg);
		
		JRadioButton spriteRadioButton = new JRadioButton(imageName, spriteImage, true);
		spriteRadioButton.setFocusable(false);
		bgSprites.add(spriteRadioButton);
		spritePanel.add(spriteRadioButton);
		
		
		System.out.println(imageName);
	}

}
