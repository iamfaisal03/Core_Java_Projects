package testglobal;

public class Coffee implements Bevarage{
	
	private int cost;
	
	public Coffee(int cost) {
		this.cost = cost;
	}

	@Override
	public int getCost() {
		return this.cost;
	}

	@Override
	public String getDescription() {
		return "Coffee";
	}
	

}
