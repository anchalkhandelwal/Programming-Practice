package mvcpattern;

import java.awt.BorderLayout;

import javax.swing.JFrame;

public class GameFrame extends JFrame{
	
	SpritePanel spritePanel;
	MoveAction moveAction;
	public GameFrame(){
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setSize(700, 600);
		this.setTitle("Simple MVC Version 1");
		this.setLocationRelativeTo(null);
		this.setLayout(new BorderLayout());
		
		spritePanel = new SpritePanel();
		this.add(spritePanel, BorderLayout.WEST);
		
		moveAction = new MoveAction();
		SpriteController spriteController = new SpriteController(spritePanel, moveAction);
		
	}
}
