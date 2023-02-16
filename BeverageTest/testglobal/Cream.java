package testglobal;

public class Cream extends beverageDecorator{
	
	private int cost;
	private Bevarage bevarage;
	
	
	
	public Cream(int cost, Bevarage bevarage) {
		this.cost = cost;
		this.bevarage = bevarage;
	}

	@Override
	public int getCost() {
		return this.cost;
	}

	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return this.bevarage.getDescription()+"Topped with Cream";
	}
	
	

}
