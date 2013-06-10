
public class Animal {
	public void main(String[] args){
		System.out.println("hoi");
	}
	private int lifeEnergyPool;
	private int turnCost;
	private int x, y;
	
	public void look(){
		for(x = (getX()-1);x<(getX()+1);x++){
			for(y = (getY()-1);y<(getY()+1);y++){
				
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
