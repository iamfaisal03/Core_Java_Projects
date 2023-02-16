package testglobal;

public class Tea  implements Bevarage{
	
	private int cost;
	
	public Tea(int cost) {
		this.cost=cost;
	}
	
	@Override
	public int getCost() {
		return this.cost;
	}

	@Override
	public String getDescription() {
		return "Tea";
	}

}
