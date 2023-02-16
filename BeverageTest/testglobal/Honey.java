package testglobal;

public class Honey extends beverageDecorator{
	
	private int cost;
	private Bevarage bevarage;
	
	public Honey(int cost,Bevarage bevarage) {
		this.bevarage=bevarage;
		this.cost=cost;
	}
	
	
	@Override
	public int getCost() {
		return this.cost;
	}

	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return this.bevarage.getDescription()+"Topped with Honey";
	}
	

}
