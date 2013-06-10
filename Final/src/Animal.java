
public class Animal {
	public static void main(String[] args){
		//ik voeg nu een comment toe
		System.out.println("hoi");
	}
	private int lifeEnergyPool;
	private int turnCost;
	private int x, y;
	
	public void look(){
		for(int i = x-1;i<x+1;i++){
			for(int j = y-1;j<y+1;j++){
				
			}
		}
	}
	
	public void move(){
		//hoi
	}

	public int getLifeEnergyPool() {
		return lifeEnergyPool;
	}

	public void setLifeEnergyPool(int lifeEnergyPool) {
		this.lifeEnergyPool = lifeEnergyPool;
	}

	public int getTurnCost() {
		return turnCost;
	}

	public void setTurnCost(int turnCost) {
		this.turnCost = turnCost;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

}
