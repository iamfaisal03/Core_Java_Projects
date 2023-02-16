package testglobal;

public class Caramel extends beverageDecorator {
	
	private int cost;
	private Bevarage Bevarage;
	
	
	
	public Caramel(int cost,Bevarage Bevarage) {
		this.cost = cost;
		this.Bevarage = Bevarage;
	}

	@Override
	public int getCost() {
		return this.cost+this.Bevarage.getCost();
	}

	@Override
	public String getDescription() {
		
		return this.Bevarage.getDescription()+"Topped with caremel";
	}
	

}
