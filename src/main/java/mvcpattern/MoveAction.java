package mvcpattern;

public class MoveAction {
	
	int PosX;
	int PosY;
	public void executeAction(int PosX, int PosY){
		PosX = PosX + 10;
		PosY = PosY + 30;
	}
	public int getAction(){
		return PosX;
	}

}
