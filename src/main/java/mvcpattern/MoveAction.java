package mvcpattern;

public class MoveAction {
	
	String moveAction;
	public void executeAction(String moveAction){
		System.out.println("Clicked");
		this.moveAction = moveAction;
	}
	public String getAction(){
		System.out.println(moveAction);
		return moveAction;	
	}

}
