package testglobal;

public class Chocoalte extends beverageDecorator{
	
	private int cost;
	private Bevarage bevarage;
	
	
	
	public Chocoalte(int cost, Bevarage bevarage) {
		this.cost = cost;
		this.bevarage = bevarage;
	}

	@Override
	public int getCost() {
		return this.cost+this.bevarage.getCost();
	}

	@Override
	public String getDescription() {
		return this.bevarage.getDescription()+"Topped with Chocalte";
	}
	
	

}
